package com.example.hateid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Questionnaire extends AppCompatActivity {

    Button bSubmit;
    CheckBox cbCrimeYes, cbCrimeNo, cbCrimeUnsure, cbDangerYes, cbDangerNo, cbOneOffYes, cbOneOffNo, cbSeriesIncidentsYes, cbSeriesIncidentsNo, cbContactedYes, cbContactedNo, cbOrgPolice, cbOrgGP, cbOrgSocialHousing, cbOrgLandlord, cbOrgCouncil, cbOrgEducation, cbOrgSocialServices, cbOrgStopHate, cbOrgOther, cbDisability, cbReligion, cbRace, cbSexuality, cbTransgender;
    TextInputEditText tiOrgOther;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        bSubmit = findViewById(R.id.bSubmit);

        cbCrimeYes = findViewById(R.id.cbCrimeYes);
        cbCrimeNo = findViewById(R.id.cbCrimeNo);
        cbCrimeUnsure = findViewById(R.id.cbCrimeUnsure);

        cbDangerYes = findViewById(R.id.cbDangerYes);
        cbDangerNo = findViewById(R.id.cbDangerNo);

        cbOneOffYes = findViewById(R.id.cbOneOffYes);
        cbOneOffNo = findViewById(R.id.cbOneOffNo);

        cbSeriesIncidentsYes = findViewById(R.id.cbSeriesIncidentsYes);
        cbSeriesIncidentsNo = findViewById(R.id.cbSeriesIncidentsNo);

        cbContactedYes = findViewById(R.id.cbContactedYes);
        cbContactedNo = findViewById(R.id.cbContactedNo);

        cbOrgPolice = findViewById(R.id.cbOrgPolice);
        cbOrgGP = findViewById(R.id.cbOrgGP);
        cbOrgSocialHousing = findViewById(R.id.cbOrgSocialHousing);
        cbOrgLandlord = findViewById(R.id.cbOrgLandlord);
        cbOrgCouncil = findViewById(R.id.cbOrgCouncil);
        cbOrgEducation = findViewById(R.id.cbOrgEducation);
        cbOrgSocialServices = findViewById(R.id.cbOrgSocialServices);
        cbOrgStopHate = findViewById(R.id.cbOrgStopHate);
        cbOrgOther = findViewById(R.id.cbOrgOther);
        tiOrgOther = findViewById(R.id.tiOrgOther);

        cbDisability = findViewById(R.id.cbDisability);
        cbReligion = findViewById(R.id.cbReligion);
        cbRace = findViewById(R.id.cbRace);
        cbSexuality = findViewById(R.id.cbSexuality);
        cbTransgender = findViewById(R.id.cbTransgender);


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


        cbOneOffYes.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbOneOffNo.setChecked(false);
            }
        });
        cbOneOffNo.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbOneOffYes.setChecked(false);
            }
        });


        cbSeriesIncidentsYes.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbSeriesIncidentsNo.setChecked(false);
            }
        });
        cbSeriesIncidentsNo.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbSeriesIncidentsYes.setChecked(false);
            }
        });


        cbContactedYes.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbContactedNo.setChecked(false);
            }
        });
        cbContactedNo.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbContactedYes.setChecked(false);
            }
        });


        cbDisability.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbReligion.setChecked(false);
                cbRace.setChecked(false);
                cbSexuality.setChecked(false);
                cbTransgender.setChecked(false);
            }
        });
        cbReligion.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbDisability.setChecked(false);
                cbRace.setChecked(false);
                cbSexuality.setChecked(false);
                cbTransgender.setChecked(false);
            }
        });
        cbRace.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbDisability.setChecked(false);
                cbReligion.setChecked(false);
                cbSexuality.setChecked(false);
                cbTransgender.setChecked(false);
            }
        });
        cbSexuality.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbDisability.setChecked(false);
                cbReligion.setChecked(false);
                cbRace.setChecked(false);
                cbTransgender.setChecked(false);
            }
        });
        cbTransgender.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                cbDisability.setChecked(false);
                cbReligion.setChecked(false);
                cbRace.setChecked(false);
                cbSexuality.setChecked(false);
            }
        });

        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbCrimeNo.isChecked() && cbDangerNo.isChecked() && (cbOneOffYes.isChecked() || cbOneOffNo.isChecked()) && (cbSeriesIncidentsYes.isChecked() || cbSeriesIncidentsNo.isChecked())){
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Neighbourhood Referral Code
                    intent.putExtra("Referral", 1);
                    startActivity(intent);
                }
                else if (cbCrimeNo.isChecked() && cbDangerYes.isChecked() && (cbOneOffYes.isChecked() || cbOneOffNo.isChecked()) && (cbSeriesIncidentsYes.isChecked() || cbSeriesIncidentsNo.isChecked())) {
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Anti-Social Behaviour Referral Code
                    intent.putExtra("Referral", 2);
                    startActivity(intent);
                }
                else if (cbCrimeYes.isChecked() && (cbDangerYes.isChecked() || cbDangerNo.isChecked()) && (cbOneOffYes.isChecked() || cbOneOffNo.isChecked()) && (cbSeriesIncidentsYes.isChecked() || cbSeriesIncidentsNo.isChecked())) {
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Crime Referral Code
                    intent.putExtra("Referral", 3);
                    startActivity(intent);
                }
                else if (cbCrimeYes.isChecked() && (cbDangerYes.isChecked() || cbDangerNo.isChecked()) && cbOneOffYes.isChecked() && cbSeriesIncidentsNo.isChecked() &&
                        (cbDisability.isChecked() || cbReligion.isChecked() || cbRace.isChecked() || cbSexuality.isChecked() || cbTransgender.isChecked())) {
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Hate Crime Referral Code
                    intent.putExtra("Referral", 4);
                    startActivity(intent);
                }
                else if (cbCrimeNo.isChecked() && (cbDangerYes.isChecked() || cbDangerNo.isChecked()) && (cbOneOffYes.isChecked() || cbOneOffNo.isChecked()) && cbSeriesIncidentsNo.isChecked() &&
                        (cbDisability.isChecked() || cbReligion.isChecked() || cbRace.isChecked() || cbSexuality.isChecked() || cbTransgender.isChecked())) {
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Hate Incident Referral Code
                    intent.putExtra("Referral", 5);
                    startActivity(intent);
                }
                else if (cbCrimeYes.isChecked() && (cbDangerYes.isChecked() || cbDangerNo.isChecked()) && cbOneOffNo.isChecked() && cbSeriesIncidentsYes.isChecked() && cbDisability.isChecked()) {
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Mate Crime (Crime) Referral Code
                    intent.putExtra("Referral", 6);
                    startActivity(intent);
                }
                else if (cbCrimeNo.isChecked() && cbDangerYes.isChecked() && cbOneOffNo.isChecked() && cbSeriesIncidentsYes.isChecked() && cbDisability.isChecked()) {
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Mate Crime (Non-Crime) Referral Code
                    intent.putExtra("Referral", 7);
                    startActivity(intent);
                }
                else if (cbCrimeYes.isChecked() && (cbDangerYes.isChecked() || cbDangerNo.isChecked()) && cbOneOffNo.isChecked() && cbSeriesIncidentsYes.isChecked() &&
                        (cbDisability.isChecked() || cbReligion.isChecked() || cbRace.isChecked() || cbSexuality.isChecked() || cbTransgender.isChecked())) {
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Hate Relationship (Crime) Referral Code
                    intent.putExtra("Referral", 8);
                    startActivity(intent);
                }
                else if (cbCrimeNo.isChecked() && cbDangerYes.isChecked() && cbOneOffNo.isChecked() && cbSeriesIncidentsYes.isChecked() &&
                        (cbDisability.isChecked() || cbReligion.isChecked() || cbRace.isChecked() || cbSexuality.isChecked() || cbTransgender.isChecked())) {
                    Intent intent = new Intent(Questionnaire.this, Results.class);
                    //Hate Relationship (Non-Crime) Referral Code
                    intent.putExtra("Referral", 9);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Questionnaire.this, "Invalid combination of Questionnaire options. Please ensure you have selected the correct options, if you believe this to be a mistake please contact a member on the research team of the about us page.", Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}