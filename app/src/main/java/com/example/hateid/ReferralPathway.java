package com.example.hateid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReferralPathway extends AppCompatActivity {
    Button bContinue, bSubmitContinue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referral_pathway);

        bContinue = findViewById(R.id.bContinue);
        bSubmitContinue = findViewById(R.id.bSubmitContinue);

        bContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReferralPathway.this, Questionnaire.class);
                startActivity(intent);
                finish();
            }
        });
        bSubmitContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReferralPathway.this, Questionnaire.class);
                startActivity(intent);
                finish();
            }
        });
    }
}