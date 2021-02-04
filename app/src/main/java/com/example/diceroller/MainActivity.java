package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Creates VAR and Defines variable type
        Button rollButton;
        //Variable assignment
        rollButton = (Button) findViewById(R.id.rollButton);
        //Create dice array
        final int[] diceArray = {
                R.drawable.dice1 ,
                R.drawable.dice2 ,
                R.drawable.dice3 ,
                R.drawable.dice4 ,
                R.drawable.dice5 ,
                R.drawable.dice6};
        final ImageView diceLeft;
        diceLeft = (ImageView) findViewById(R.id.diceLeft);

        final ImageView diceRight;
        diceRight = (ImageView) findViewById(R.id.diceRight);

        //Define code that gets executed on press
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates a debug message
                Log.d("Dice Roller" , "The Button has been pressed!");
                //RNG creation
                Random randomNumberGenerator = new Random();
                //Creating a random number
                int numberLeft = randomNumberGenerator.nextInt(6);
                int numberRight = randomNumberGenerator.nextInt(6);
                Log.d("Dice Roller" , "The random number is: " + numberLeft);

                //Sets source of image
                diceLeft.setImageResource(diceArray[numberLeft]);
                diceRight.setImageResource(diceArray[numberRight]);



            }
        });




    }
}