package com.android.jaiswalshiwam.dicee;

import android.support.v7.app.AppCompatActivity;
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

        Button rollButton=(Button) findViewById(R.id.rollButton);
        final ImageView rightDice=(ImageView) findViewById(R.id.image_rightDice);
        final ImageView leftDice=(ImageView) findViewById(R.id.image_leftDice);
        ImageView logo=(ImageView) findViewById(R.id.image_logo);
        final int diceArray[]={R.drawable.dice1, R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,
        R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d("Dicee","The Button Is Pressed");
                Random rand=new Random();
                int number=rand.nextInt(6);
                int number2=rand.nextInt(6);
                Log.d("Dicee","This no is"+number);
                leftDice.setImageResource(diceArray[number]);
                rightDice.setImageResource(diceArray[number2]);
            }
        });
    }
}
