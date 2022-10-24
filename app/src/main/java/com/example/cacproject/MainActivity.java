package com.example.cacproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    private Button startBtn;

    // allows for automatic sliding
    private Handler sliderHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // initialize start button
        startBtn = findViewById(R.id.mainStartBtn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                configureStartButton();
            }
        }); // listener that calls next activity method

    }

    public void configureStartButton ()
    {
        Intent intent = new Intent(this, Choose.class);
        startActivity(intent);
    } // end start button handler (goes to next screen when start is pressed)
}