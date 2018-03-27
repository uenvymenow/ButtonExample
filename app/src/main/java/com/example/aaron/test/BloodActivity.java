package com.example.aaron.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class BloodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood);

        // Locate the bloodWordTextView
        TextView bloodWord = findViewById(R.id.bloodWordTextView);

        // Add the word blood to the textview
        bloodWord.setText("Blood");

        // Locate the bloodScriptureTextView
        TextView bloodScripture = findViewById(R.id.bloodScriptureTextView);

        // Add the scripture reference to the bloodScriptureTextView
        bloodScripture.setText("'but God shows his love for us in that while we were still sinners, Christ died for us. '\n" +
                "Romans 5:8");

        // Locate the bloodImageView
        ImageView bloodImage = findViewById(R.id.bloodImage);

        // Add the blood image to the bloodImageView
        bloodImage.setImageResource(R.drawable.bloodimage);
    }
}
