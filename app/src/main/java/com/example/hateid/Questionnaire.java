package com.example.hateid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hateidapp.R;

public class Questionnaire extends AppCompatActivity {

    Button bSubmit;
    CheckBox cbCrimeYes, cbCrimeNo, cbCrimeUnsure, cbDangerYes, cbDangerNo, cbOneOff, cbSeriesSame, cbSeriesDifferent, cbCloseYes, cbCloseNo, cbDisability, cbReligion, cbRace, cbSexuality, cbTransgender, cbNone;
    TextView tvClientCrime;
    ImageButton ibBack, ibHomePage, ibDefinitions, ibForm, ibAboutUs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        ibHomePage = findViewById(R.id.ibHomePage);
        ibDefinitions = findViewById(R.id.ibDefinitions);
        ibForm = findViewById(R.id.ibForm);
        ibAboutUs = findViewById(R.id.ibAboutUs);
        ibBack = findViewById(R.id.ibBack);

        bSubmit = findViewById(R.id.bSubmit);

        tvClientCrime = findViewById(R.id.tvClientCrime);

        cbCrimeYes = findViewById(R.id.cbCrimeYes);
        cbCrimeNo = findViewById(R.id.cbCrimeNo);
        cbCrimeUnsure = findViewById(R.id.cbCrimeUnsure);

        cbDangerYes = findViewById(R.id.cbDangerYes);
        cbDangerNo = findViewById(R.id.cbDangerNo);

        cbOneOff = findViewById(R.id.cbOneOff);

        cbSeriesSame = findViewById(R.id.cbSeriesSame);
        cbSeriesDifferent = findViewById(R.id.cbSeriesDifferent);

        cbCloseYes = findViewById(R.id.cbCloseYes);
        cbCloseNo = findViewById(R.id.cbCloseNo);

        cbDisability = findViewById(R.id.cbDisability);
        cbReligion = findViewById(R.id.cbReligion);
        cbRace = findViewById(R.id.cbRace);
        cbSexuality = findViewById(R.id.cbSexuality);
        cbTransgender = findViewById(R.id.cbTransgender);
        cbNone = findViewById(R.id.cbNone);

        tvClientCrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvClientCrime.setText("Does the client believe this is a crime?\n\nA crime is an unlawful act (or sometimes a failure to act) and can include: physical assault, threatening behaviour, harassment, criminal damage, vandalism, trespass, incitement to racial hatred, etc.");
            }
        });

        cbCrimeYes.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbCrimeNo.setChecked(false);
                cbCrimeUnsure.setChecked(false);
            }
        });
        cbCrimeNo.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbCrimeYes.setChecked(false);
                cbCrimeUnsure.setChecked(false);
            }
        });
        cbCrimeUnsure.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbCrimeYes.setChecked(false);
                cbCrimeNo.setChecked(false);
            }
        });


        cbDangerYes.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbDangerNo.setChecked(false);
            }
        });
        cbDangerNo.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbDangerYes.setChecked(false);
            }
        });


        cbOneOff.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbSeriesSame.setChecked(false);
                cbSeriesDifferent.setChecked(false);
            }
        });

        cbSeriesSame.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbOneOff.setChecked(false);
                cbSeriesDifferent.setChecked(false);
            }
        });
        cbSeriesDifferent.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbOneOff.setChecked(false);
                cbSeriesSame.setChecked(false);
            }
        });

        cbCloseYes.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if(isChecked){
                cbCloseNo.setChecked(false);
            }
        }));
        cbCloseNo.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if(isChecked){
                cbCloseYes.setChecked(false);
            }
        }));

        cbNone.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbDisability.setChecked(false);
                cbReligion.setChecked(false);
                cbRace.setChecked(false);
                cbSexuality.setChecked(false);
                cbTransgender.setChecked(false);
            }
        });


        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbCrimeNo.isChecked() && cbDangerNo.isChecked() && (cbOneOff.isChecked() || cbSeriesSame.isChecked() || cbSeriesDifferent.isChecked()) && !
                        (cbDisability.isChecked() || cbReligion.isChecked() || cbRace.isChecked() || cbSexuality.isChecked() || cbTransgender.isChecked()) && (cbCloseYes.isChecked() || cbCloseNo.isChecked())){
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Neighbourhood Referral Code
                    intent.putExtra("Referral", 1);
                    startActivity(intent);
                }
                else if (cbCrimeNo.isChecked() && cbDangerYes.isChecked() && (cbOneOff.isChecked() || cbSeriesSame.isChecked() || cbSeriesDifferent.isChecked()) && !
                        (cbDisability.isChecked() || cbReligion.isChecked() || cbRace.isChecked() || cbSexuality.isChecked() || cbTransgender.isChecked()) && (cbCloseYes.isChecked() || cbCloseNo.isChecked())) {
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Anti-Social Behaviour Referral Code
                    intent.putExtra("Referral", 2);
                    startActivity(intent);
                }
                else if ((cbCrimeYes.isChecked() || cbCrimeUnsure.isChecked()) && (cbDangerYes.isChecked() || cbDangerNo.isChecked()) && (cbSeriesSame.isChecked() || cbSeriesDifferent.isChecked()) && cbDisability.isChecked() && (cbCloseYes.isChecked() || cbCloseNo.isChecked())) {
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Mate Crime (Crime) Referral Code
                    intent.putExtra("Referral", 6);
                    startActivity(intent);
                }
                else if (cbCrimeNo.isChecked() && cbDangerYes.isChecked() && (cbSeriesSame.isChecked() || cbSeriesDifferent.isChecked()) && cbDisability.isChecked() && (cbCloseYes.isChecked() || cbCloseNo.isChecked())) {
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Mate Crime (Non-Crime) Referral Code
                    intent.putExtra("Referral", 7);
                    startActivity(intent);
                }
                else if ((cbCrimeYes.isChecked() || cbCrimeUnsure.isChecked()) && (cbDangerYes.isChecked() || cbDangerNo.isChecked()) && (cbOneOff.isChecked() || cbSeriesSame.isChecked() || cbSeriesDifferent.isChecked()) && !
                        (cbDisability.isChecked() || cbReligion.isChecked() || cbRace.isChecked() || cbSexuality.isChecked() || cbTransgender.isChecked()) && (cbCloseYes.isChecked() || cbCloseNo.isChecked())) {
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Crime Referral Code
                    intent.putExtra("Referral", 3);
                    startActivity(intent);
                }
                else if ((cbCrimeYes.isChecked() || cbCrimeUnsure.isChecked()) && (cbDangerYes.isChecked() || cbDangerNo.isChecked()) && (cbOneOff.isChecked() || cbSeriesDifferent.isChecked()) &&
                        (cbDisability.isChecked() || cbReligion.isChecked() || cbRace.isChecked() || cbSexuality.isChecked() || cbTransgender.isChecked()) && (cbCloseYes.isChecked() || cbCloseNo.isChecked())) {
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Hate Crime Referral Code
                    intent.putExtra("Referral", 4);
                    startActivity(intent);
                }
                else if (cbCrimeNo.isChecked() && (cbDangerYes.isChecked() || cbDangerNo.isChecked()) && (cbOneOff.isChecked() || cbSeriesDifferent.isChecked()) &&
                        (cbDisability.isChecked() || cbReligion.isChecked() || cbRace.isChecked() || cbSexuality.isChecked() || cbTransgender.isChecked()) && (cbCloseYes.isChecked() || cbCloseNo.isChecked())) {
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Hate Incident Referral Code
                    intent.putExtra("Referral", 5);
                    startActivity(intent);
                }

                else if ((cbCrimeYes.isChecked() || cbCrimeUnsure.isChecked()) && (cbDangerYes.isChecked() || cbDangerNo.isChecked()) && cbSeriesSame.isChecked() &&
                        (cbDisability.isChecked() || cbReligion.isChecked() || cbRace.isChecked() || cbSexuality.isChecked() || cbTransgender.isChecked()) && cbCloseYes.isChecked()) {
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Hate Relationship (Crime) Referral Code
                    intent.putExtra("Referral", 8);
                    startActivity(intent);
                }
                else if (cbCrimeNo.isChecked() && (cbDangerYes.isChecked() || cbDangerNo.isChecked()) && cbSeriesSame.isChecked() &&
                        (cbDisability.isChecked() || cbReligion.isChecked() || cbRace.isChecked() || cbSexuality.isChecked() || cbTransgender.isChecked()) && cbCloseYes.isChecked()) {
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Hate Relationship (Non-Crime) Referral Code
                    intent.putExtra("Referral", 9);
                    startActivity(intent);
                }

//                else if ((cbCrimeYes.isChecked() || cbCrimeUnsure.isChecked()) && (cbDangerYes.isChecked() || cbDangerNo.isChecked()) && cbSeriesSame.isChecked() && cbSeriesDifferent.isChecked() &&
//                        (cbDisability.isChecked() || cbReligion.isChecked() || cbRace.isChecked() || cbSexuality.isChecked() || cbTransgender.isChecked())) {
//                    Intent intent = new Intent(Questionnaire.this, Results.class);
//                    //Hate Crime and Hate Relationship (Crime) Referral Code
//                    intent.putExtra("Referral", 10);
//                    startActivity(intent);
//                }
//                else if (cbCrimeNo.isChecked() && (cbDangerYes.isChecked() || cbDangerNo.isChecked()) && (cbOneOff.isChecked() || cbSeriesSame.isChecked() || cbSeriesDifferent.isChecked()) &&
//                        (cbDisability.isChecked() || cbReligion.isChecked() || cbRace.isChecked() || cbSexuality.isChecked() || cbTransgender.isChecked())) {
//                    Intent intent = new Intent(Questionnaire.this, Results.class);
//                    //Hate Incident and Hate Relationship (Non-Crime) Referral Code
//                    intent.putExtra("Referral", 11);
//                    startActivity(intent);
//                }
                else {
                    Toast.makeText(Questionnaire.this, "Invalid combination of Questionnaire options. Please ensure you have selected the correct options, if you believe this to be a mistake please contact a member on the research team of the about us page.", Toast.LENGTH_LONG).show();
                }


            }
        });

        ibBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ibHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Questionnaire.this, DescriptionPage.class);
                startActivity(intent);
            }
        });
        ibDefinitions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Questionnaire.this, HomePage.class);
                startActivity(intent);
            }
        });

        ibForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Questionnaire.this, ReferralPathway.class);
                startActivity(intent);
            }
        });
        ibAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Questionnaire.this, ContactusActivity.class);
                startActivity(intent);
            }
        });
    }
}