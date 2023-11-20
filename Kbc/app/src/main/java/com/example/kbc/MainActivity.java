package com.example.kbc;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random random = new Random();

    private TextView questionTextView, finalScoreTextView;
    private Button option1Button, option2Button, option3Button, option4Button, nextButton;
    private Button fiftyFiftyButton, doubleDipButton, flipQuestionButton;

    private List<Question> questions;
    private int currentQuestionIndex = 0;
    int score = 0;

    private boolean fiftyFiftyUsed = false;
    private boolean doubleDipUsed = false;
    private boolean flipQuestionUsed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();
        initializeQuestions();

        displayQuestion();

        option1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(0);
            }
        });

        option2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(1);
            }
        });

        option3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(2);
            }
        });

        option4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(3);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentQuestionIndex < questions.size() - 1) {
                    currentQuestionIndex++;
                    displayQuestion();
                } else {
                    // End of the quiz, show a message or handle as needed
                    Toast.makeText(MainActivity.this, "Quiz Completed!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        fiftyFiftyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!fiftyFiftyUsed) {
                    useFiftyFiftyLifeline();
                }
            }
        });

        doubleDipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!doubleDipUsed) {
                    useDoubleDipLifeline();
                }
            }
        });

        flipQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!flipQuestionUsed) {
                    flipQuestion();
                }
            }
        });
    }

    private void initializeViews() {
        questionTextView = findViewById(R.id.questionTextView);
        option1Button = findViewById(R.id.option1Button);
        option2Button = findViewById(R.id.option2Button);
        option3Button = findViewById(R.id.option3Button);
        option4Button = findViewById(R.id.option4Button);
        nextButton = findViewById(R.id.nextButton);
        finalScoreTextView = findViewById(R.id.finalScoreTextView);
        fiftyFiftyButton = findViewById(R.id.fiftyFiftyButton);
        doubleDipButton = findViewById(R.id.doubleDipButton);
        flipQuestionButton = findViewById(R.id.flipQuestionButton);
    }

    private void initializeQuestions() {
        questions = new ArrayList<>();
        // Add Bollywood quiz questions with options and correct answers
        // Add more questions as needed

        questions.add(new Question("‘છોટા ભીમ’ ના મુખ્ય ચરિત્રનું નામ શું છે?",
                new String[]{"રાજુ", "છુટકી", "ભીમ", "કાળીયા"}, 2));

        questions.add(new Question("ધોલકપુર ગામનું નામ શું છે, જેમણે ‘છોટા ભીમ’ વસવાનું છે?",
                new String[]{"ધોલકપુર", "પહેલવાનપુર", "કાળીયા નગર", "સુંદરબન"}, 0));

        questions.add(new Question("‘છોટા ભીમ’ માટે શ્રેષ્ઠ મિત્ર કોણ છે?",
                new String[]{"છુટકી", "રાજુ", "જગ્ગુ", "કાળિયા"}, 1));

        questions.add(new Question("‘છોટા ભીમ’ માટે દણાં આપતા પ્રમુખ પ્રતાગોનિસ્ટ શું છે?",
                new String[]{"ધોલુ", "ભોલુ", "કાળિયા", "કિર્માડ"}, 3));

        questions.add(new Question("શું છે તે વિશેષ શક્તિ કે કસ્ક છે જેનાથી ભીમને અલગ થવામાં સહાય થાય છે?",
                new String[]{"સુપર સ્ટ્રેન્થ", "સુપર સ્પીડ", "ટેલિપોર્ટેશન", "ફ્લાઇટ"}, 0));
        questions.add(new Question("ભીમના પાલનહાર અને સંગી શાકારે કયા નામે છે?",
                new String[]{"ગોલુ", "જગ્ગુ", "ચિંટુ", "મંગુ"}, 1));

        questions.add(new Question("‘છોટા ભીમ’ સિરીઝમાં, બીમના અનુયાયી અને સહયાતિકારી પરાયણ કેટલા વર્ષનો છે?",
                new String[]{"વળી", "જંબુવાન", "સુગ્રીવ", "અંગદ"}, 1));

        questions.add(new Question("શું ‘છોટા ભીમ’ માટેના મુદ્રક અને તેમના મિત્રો માટે માર્ગદર્શન આપતા બુદ્ધિમાન પરાયણ ચરિત્ર કોણ છે?",
                new String[]{"ગુરુ શાંભુ", "ચાચા ચોધરી", "ધોલુ", "કાળિયાની માતા"}, 0));

        questions.add(new Question("‘છોટા ભીમ’ સિરીઝમાં શ્રેષ્ઠ પરાયણ બાળકો છે કેમ કે બીમ સાથે પ્રતિસાધનાત્મક રહેવું પસંદ કરે છે?",
                new String[]{"રાજુ", "છુટકી", "જગ્ગુ", "કાળિયા"}, 1));
// Add more questions...

        // Add more questions as needed
    }

    private void displayQuestion() {
        Question currentQuestion = questions.get(currentQuestionIndex);
        questionTextView.setText(currentQuestion.getQuestion());
        option1Button.setText(currentQuestion.getOptions()[0]);
        option2Button.setText(currentQuestion.getOptions()[1]);
        option3Button.setText(currentQuestion.getOptions()[2]);
        option4Button.setText(currentQuestion.getOptions()[3]);

        // Show the "Next" button only if it's the last question
        nextButton.setVisibility(currentQuestionIndex == questions.size() - 1 ? View.VISIBLE : View.GONE);

        // Enable all options for a new question
        enableOptions();
    }

    private void enableOptions() {
        option1Button.setEnabled(true);
        option2Button.setEnabled(true);
        option3Button.setEnabled(true);
        option4Button.setEnabled(true);
    }

    private void checkAnswer(int selectedOption) {
        Question currentQuestion = questions.get(currentQuestionIndex);
        int correctAnswer = currentQuestion.getCorrectAnswer();

        if (selectedOption == correctAnswer) {
            // Correct answer logic
            score++;
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        } else {
            // Incorrect answer logic
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
            // Deduct points for incorrect answers (you can adjust the amount)
            score = Math.max(0, score - 1);
        }

        // Move to the next question or end the quiz
        if (currentQuestionIndex < questions.size() - 1) {
            currentQuestionIndex++;
            displayQuestion();
        } else {
            // End of the quiz, show the final score
            finalScoreTextView.setText("Score: " + score);

            Intent intent = new Intent(this, finalscore.class);
            intent.putExtra("finalScore", score);

// Start the new activity
            startActivity(intent);
            finish(); // Optional: Finish the current activity if you don't want to go back to it

        }
    }


    private void resetGame() {
        currentQuestionIndex = 0;
        score = 0;
        displayQuestion();
        resetLifelines();
    }

    private void resetLifelines() {
        fiftyFiftyUsed = false;
        doubleDipUsed = false;
        flipQuestionUsed = false;

        // Enable lifeline buttons
        fiftyFiftyButton.setEnabled(true);
        doubleDipButton.setEnabled(true);
        flipQuestionButton.setEnabled(true);
    }

    private void useFiftyFiftyLifeline() {
        Question currentQuestion = questions.get(currentQuestionIndex);

        // Identify the correct answer
        int correctAnswer = currentQuestion.getCorrectAnswer();

        // Identify two unique incorrect answers
        List<Integer> incorrectOptions = getRandomIncorrectOptions(correctAnswer);

        // Log the correct and incorrect options for debugging
        Log.d("Lifeline", "Correct Answer: " + correctAnswer);
        Log.d("Lifeline", "Incorrect Answers: " + incorrectOptions);

        // Create a list of options to disable
        List<Integer> optionsToDisable = Arrays.asList(incorrectOptions.get(0), incorrectOptions.get(1));

        // Log the options to disable for debugging
        Log.d("Lifeline", "Options to Disable: " + optionsToDisable);

        // Disable the selected options
        disableOptions(optionsToDisable);

        // Disable the lifeline button after using it
        fiftyFiftyButton.setEnabled(false);
        fiftyFiftyUsed = true;
    }

    private List<Integer> getRandomIncorrectOptions(int correctOption) {
        List<Integer> incorrectOptions = new ArrayList<>();

        // Create a list of incorrect options excluding the correct option
        for (int i = 0; i < 4; i++) {
            if (i != correctOption) {
                incorrectOptions.add(i);
            }
        }

        // Randomly select two incorrect options
        Collections.shuffle(incorrectOptions);
        return incorrectOptions.subList(0, 2);
    }


    private void disableOptions(List<Integer> optionsToDisable) {
        for (int optionIndex : optionsToDisable) {
            disableOption(optionIndex);
        }
    }


    private void disableOption(int optionIndex) {
        Button buttonToDisable = null;

        switch (optionIndex) {
            case 0:
                buttonToDisable = option1Button;
                break;
            case 1:
                buttonToDisable = option2Button;
                break;
            case 2:
                buttonToDisable = option3Button;
                break;
            case 3:
                buttonToDisable = option4Button;
                break;
            default:
                // Handle unexpected optionIndex
                break;
        }

        if (buttonToDisable != null) {
            buttonToDisable.setEnabled(false);
        }
    }




    private void useDoubleDipLifeline() {
        // Disable the lifeline button after using it
        doubleDipButton.setEnabled(false);
        doubleDipUsed = true;

        // Show a message or perform any UI update to indicate that double dip is in progress
        Toast.makeText(this, "Double Dip: Choose two answers.", Toast.LENGTH_SHORT).show();

        // Attach click listeners to option buttons for the double-dip phase
        attachDoubleDipClickListeners();
    }

    private void attachDoubleDipClickListeners() {
        option1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleDoubleDipChoice(0);
            }
        });

        option2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleDoubleDipChoice(1);
            }
        });

        option3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleDoubleDipChoice(2);
            }
        });

        option4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleDoubleDipChoice(3);
            }
        });
    }

    private void handleDoubleDipChoice(int selectedOption) {
        // Implement logic to handle the choice in the double-dip phase
        // You may want to store the choice or perform any relevant actions

        // Disable the selected option to indicate that it has been chosen
        disableOption(selectedOption);

        // Check if two choices have been made
        if (twoChoicesMade()) {
            // Proceed with the logic for the double-dip lifeline
            // For example, check if the choices are correct, update the score, etc.

            // Reset click listeners for normal operation
            resetOptionClickListeners();

            // Enable other lifelines
            enableLifelines();
        }
    }

    private boolean twoChoicesMade() {
        // Implement logic to check if two choices have been made
        // You may want to use a counter or other mechanism to track the choices
        return true;  // Placeholder logic, replace with your implementation
    }

    private void resetOptionClickListeners() {
        // Reset click listeners for normal operation
        option1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(0);
            }
        });

        option2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(1);
            }
        });

        option3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(2);
            }
        });

        option4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(3);
            }
        });
    }

    private void enableLifelines() {
        // Enable other lifelines as needed
        fiftyFiftyButton.setEnabled(true);
        flipQuestionButton.setEnabled(true);
    }


    @SuppressLint("SwitchIntDef")
    public void onClick(View view) {
        int viewId = view.getId();

        if (viewId == R.id.doubleDipButton) {
            if (!doubleDipUsed) {
                useDoubleDipLifeline();
            }
        } else if (viewId == R.id.flipQuestionButton) {
            if (!flipQuestionUsed) {
                flipQuestion();
            }
        }
        // Add more cases as needed
    }


    private void flipQuestion() {
        // Implement the logic to flip the question
        // For example, you can select a new random question from your question list
        // Update the UI to display the new question and its options

        // Here, I'm just incrementing the currentQuestionIndex for demonstration purposes
        if (currentQuestionIndex < questions.size() - 1) {
            currentQuestionIndex++;
            displayQuestion();
            flipQuestionUsed = true; // Set the flipQuestionUsed flag to true
        } else {
            // End of the quiz, show a message or handle as needed
            Toast.makeText(this, "Quiz Completed!", Toast.LENGTH_SHORT).show();
        }
    }




}//class
