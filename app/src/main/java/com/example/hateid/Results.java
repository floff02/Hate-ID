package com.example.hateid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class Results extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        tvResult = findViewById(R.id.tvResult);

        Intent intent = getIntent();

        int referral = intent.getIntExtra("Referral", 0);

        if(referral == 1){
            tvResult.setText("If, in your judgement, the client has not been victimised by hate, but by a neighbourhood dispute, please see Northumbria Police guidance to give appropriate advice [hyperlink to Northumbria Police Neighbour Disputes page].");
        }
        else if (referral == 2) {
            tvResult.setText("If, in your judgement, the client has not been victimised by hate, but by anti-social behaviour, please refer them to your ASB Team. See: [hyperlink to Northumbria Police ASB page].");
        }
        else if (referral == 3) {
            tvResult.setText("If, in your judgement, the client is in danger/at risk and or the victim of a crime encourage them to RING THE POLICE.");
        }
        else if (referral == 4) {
            tvResult.setText("If, in your judgement, the client is in danger/at risk and or the victim of a crime that is motivated by hate then encourage them to RING THE POLICE and REPORT A HATE CRIME.");
        }
        else if (referral == 5) {
            tvResult.setText(". If, in your judgement, the client is in danger/at risk and or the victim of a non-crime incident that is motivated by hate then encourage them to RING THE POLICE and REPORT A HATE INCIDENT.\n\nIf, in your judgment, the client is the victim of a non-crime incident then please refer them to CONNECTED VOICE HATE CRIME ADVOCACY SERVICE (HCAS).");
        }
        else if (referral == 6) {

        }

    }
}