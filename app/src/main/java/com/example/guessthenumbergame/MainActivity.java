package com.example.guessthenumbergame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button nextButton;
    private TextView inputView;
    private int randomNumber;

    private int randomNumber;
    private int number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(20);
        System.out.print(randomNumber);




    }
    }
