package com.example.passwordencryp;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class MainActivity extends AppCompatActivity {

    private EditText inputText, passwordText;
    private TextView encryptedText, decryptedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.inputText);
        passwordText = findViewById(R.id.passwordText);
        encryptedText = findViewById(R.id.encryptedText);
        decryptedText = findViewById(R.id.decryptedText);

        Button encryptButton = findViewById(R.id.encryptButton);
        Button decryptButton = findViewById(R.id.decryptButton);

        Button copyEncryptedButton = findViewById(R.id.copyEncryptedButton);
        Button copyDecryptedButton = findViewById(R.id.copyDecryptedButton);

        Button resetButton = findViewById(R.id.resetButton);

        encryptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                encrypt();
            }
        });

        decryptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrypt();
            }
        });

        copyEncryptedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                copyToClipboard(encryptedText.getText().toString());
            }
        });

        copyDecryptedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                copyToClipboard(decryptedText.getText().toString());
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
    }

    private void encrypt() {
        String input = inputText.getText().toString();
        String password = passwordText.getText().toString();

        if (input.length() < 8) {
            showToast("Input text must be at least 8 characters long");
        } else if (input.length() > 30) {
            showToast("Input text must be at most 30 characters long");
        } else {
            String encrypted = TripleDESEncryption.encrypt(input, password);
            fadeInAnimation(encryptedText, "Encrypted: " + encrypted);
        }
    }

    private void decrypt() {
        String encrypted = encryptedText.getText().toString().replace("Encrypted: ", "");
        String password = passwordText.getText().toString();
        String decrypted = TripleDESEncryption.decrypt(encrypted, password);
        fadeInAnimation(decryptedText, "Decrypted: " + decrypted);
    }

    private void copyToClipboard(String text) {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Copied Text", text);
        if (clipboard != null) {
            clipboard.setPrimaryClip(clip);
            showToast("Text copied to clipboard");
        }
    }

    private void reset() {
        inputText.setText("");
        passwordText.setText("");
        encryptedText.setText("Encrypted: ");
        decryptedText.setText("Decrypted: ");
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void fadeInAnimation(final TextView textView, String text) {
        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(1000);
        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                textView.setText(text);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Animation ended (if needed)
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Animation repeat (if needed)
            }
        });
        textView.startAnimation(fadeIn);
    }
}

class TripleDESEncryption {

    private static final String TRANSFORMATION = "DESede/ECB/PKCS5Padding";
    private static final String ALGORITHM = "DESede";

    // Parameters for key derivation using PBKDF2
    private static final byte[] salt = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08};
    private static final int iterationCount = 1000;
    private static final int keyLength = 192;

    public static String encrypt(String data, String key) {
        try {
            Key secretKey = generateKey(key);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            return android.util.Base64.encodeToString(encryptedBytes, android.util.Base64.DEFAULT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String decrypt(String encryptedData, String key) {
        try {
            Key secretKey = generateKey(key);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decryptedBytes = cipher.doFinal(android.util.Base64.decode(encryptedData, android.util.Base64.DEFAULT));
            return new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Key generateKey(String key) throws NoSuchAlgorithmException, InvalidKeySpecException, UnsupportedEncodingException {
        byte[] keyBytes = new byte[24];
        byte[] passwordBytes = key.getBytes("UTF-8");

        // Use PBKDF2 to derive a key from the password
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        KeySpec keySpec = new PBEKeySpec(key.toCharArray(), salt, iterationCount, keyLength);
        SecretKey secretKey = keyFactory.generateSecret(keySpec);

        // Get the encoded key bytes
        byte[] encodedKey = secretKey.getEncoded();

        // Copy the first 24 bytes of the encoded key into keyBytes
        System.arraycopy(encodedKey, 0, keyBytes, 0, Math.min(encodedKey.length, keyBytes.length));

        return new SecretKeySpec(keyBytes, "DESede");
    }
}
