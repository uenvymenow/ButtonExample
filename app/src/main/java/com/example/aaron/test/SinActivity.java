package com.example.aaron.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin);

        // Locate the SinWordTextView
        TextView sinWord = findViewById(R.id.sinWordTextView);

        // Add the word Sin to the textview
        sinWord.setText("Sin");

        // Locate the sinScriptureTextView
        TextView sinScripture = findViewById(R.id.sinScriptureTextView);

        // Add the scripture reference to the sinScriptureTextView
        sinScripture.setText("'for all have sinned and fall short of the glory of God, \n" +
                "Romans 3:23");

        // Locate the sinImageView
        ImageView sinImage = findViewById(R.id.sinImage);

        // Add the sin image to the sinImageView
        sinImage.setImageResource(R.drawable.sinimage);
    }

    public void backButton(View view) {
        // Find the sin view that shows the SinActivity
        Button backButton = findViewById(R.id.backButton);

        // Set onClickListener for back textView {@Link MainActivity}
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(SinActivity.this, MainActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
            }
        });
    }

    public void continueButton(View view){
            // Find the blood view that shows the BloodActivity
            Button bloodTextView = findViewById(R.id.continueTextView);

            // Set onClickListener for blood textView {@Link BloodActivity}
            bloodTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent bloodIntent = new Intent(SinActivity.this, BloodActivity.class);
                    startActivity(bloodIntent);
                }
            });
    }
}
