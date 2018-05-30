package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

//Author: Frank Agyekum

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = findViewById(R.id.image_eightBall);
        final int[] ballArray = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        Button askbtn = findViewById(R.id.askButton);
        askbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //create random number generator
                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(5);

                //grasp a random resource from the ball array
                int imageResourceId = ballArray[number];

                //display an image every time the button is clicked
                ballDisplay.setImageResource(imageResourceId);

            }
        });
    }
}
