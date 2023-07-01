package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class XFragment extends Fragment {

private static final String argmt1 = "arguments1";
private static final String argmt2 = "arguments2";


    public XFragment(){

    }

    public static XFragment getInstance(String value1 , int value2){

        XFragment xFragment = new XFragment();
        Bundle bundle = new Bundle();
        bundle.putString(argmt1,value1);
        bundle.putInt(argmt2,value2);

        xFragment.setArguments(bundle);

        return xFragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        if (getArguments() != null){

            String name = getArguments().getString(argmt1);
            int no = getArguments().getInt(argmt2);

            Log.d("value =","no= " + no + " name= " + name);



        }



        return inflater.inflate(R.layout.fragment_x, container, false);
    }



}