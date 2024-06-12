package com.example.hateid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Results extends AppCompatActivity {

    TextView tvResult, GuidancePolice, GuidanceSocialHousing, GuidanceSocialWork, GuidanceEducation;
    Button bMoreOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        tvResult = findViewById(R.id.tvResult);
        bMoreOptions = findViewById(R.id.bMoreOptions);
        GuidancePolice = findViewById(R.id.GuidancePolice);
        GuidanceSocialHousing = findViewById(R.id.GuidanceSocialHousing);
        GuidanceSocialWork = findViewById(R.id.GuidanceSocialWork);
        GuidanceEducation = findViewById(R.id.GuidanceEducation);

        GuidancePolice.setMovementMethod(LinkMovementMethod.getInstance());
        GuidanceSocialHousing.setMovementMethod(LinkMovementMethod.getInstance());
        GuidanceSocialWork.setMovementMethod(LinkMovementMethod.getInstance());
        GuidanceEducation.setMovementMethod(LinkMovementMethod.getInstance());

        bMoreOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Results.this, MoreOptions.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();

        int referral = intent.getIntExtra("Referral", 0);

        if(referral == 1){
            tvResult.setText(R.string.Neighbourhood_Dispute_Result);
            tvResult.setMovementMethod(LinkMovementMethod.getInstance());
            //+ R.string.Neighbourhood_Dispute_Result_Link
        }
        else if (referral == 2) {
            tvResult.setText(R.string.Anti_Social_Behaviour_Result);
            tvResult.setMovementMethod(LinkMovementMethod.getInstance());
        }
        else if (referral == 3) {
            tvResult.setText(R.string.Crime_Result);
            tvResult.setMovementMethod(LinkMovementMethod.getInstance());
        }
        else if (referral == 4) {
            tvResult.setText(R.string.Crime_Hate_Result);
            tvResult.setMovementMethod(LinkMovementMethod.getInstance());
        }
        else if (referral == 5) {
            tvResult.setText(R.string.Non_Crime_Incident_Result);
            tvResult.setMovementMethod(LinkMovementMethod.getInstance());
        }
        else if (referral == 6) {
            tvResult.setText(R.string.Mate_Crime_Hate_Result);
            tvResult.setMovementMethod(LinkMovementMethod.getInstance());
        }
        else if (referral == 7) {
            tvResult.setText(R.string.Mate_Non_Crime_Hate_Result);
            tvResult.setMovementMethod(LinkMovementMethod.getInstance());
        }
        else if (referral == 8) {
            tvResult.setText(R.string.Hate_Relationship_Crime_Result);
            tvResult.setMovementMethod(LinkMovementMethod.getInstance());
        }
        else if (referral == 9) {
            tvResult.setText(R.string.Hate_Relationship_Non_crime_Result);
            tvResult.setMovementMethod(LinkMovementMethod.getInstance());
        }
//        else if (referral == 10) {
//            tvResult.setText(R.string.Hate_Crime_And_Hate_Relationship_Result);
//            tvResult.setMovementMethod(LinkMovementMethod.getInstance());
//        }
//        else if (referral == 11) {
//            tvResult.setText(R.string.Hate_Incident_And_Hate_Relationship_Result);
//            tvResult.setMovementMethod(LinkMovementMethod.getInstance());
//        }
    }
}