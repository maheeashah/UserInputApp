package com.example.userinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DispayWelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispay_welcome);

        //receive the intent
        Intent intent = getIntent();
        // extract the data using the constant name we created as its label
        //since the constant lives in MainActivity.java, that is why we need
        //to refer to it in this way
        String welcomeName = intent.getStringExtra(MainActivity.EXTRA_NAME);


        //get a reference to view on the screen we want to display text in
        TextView displayTV = findViewById(R.id.textView);

        //set the text to the TextView on the screen
        displayTV.setText(welcomeName);
    }
}