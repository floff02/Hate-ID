package com.example.hateid;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class ReferralPathway extends AppCompatActivity {
    Button bContinue, bSubmitContinue;
    CheckBox cbQuestions, cbSaveQuestions;

    TextInputEditText tiFormName, tiFormContact, tiFormPostCode, tiFormWhatHappened, tiFormWhoInvolved, tiFormWhere, tiFormWhen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referral_pathway);

        bContinue = findViewById(R.id.bContinue);
        cbQuestions = findViewById(R.id.cbQuestions);
        cbSaveQuestions = findViewById(R.id.cbSaveQuestions);
        tiFormName = findViewById(R.id.tiFormName);
        tiFormContact = findViewById(R.id.tiFormContact);
        tiFormPostCode = findViewById(R.id.tiFormPostCode);
        tiFormWhatHappened = findViewById(R.id.tiFormWhatHappened);
        tiFormWhoInvolved = findViewById(R.id.tiFormWhoInvolved);
        tiFormWhere = findViewById(R.id.tiFormWhere);
        tiFormWhen = findViewById(R.id.tiFormWhen);

        cbQuestions.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked){
                cbSaveQuestions.setChecked(false);
                tiFormName.setVisibility(View.INVISIBLE);
                tiFormContact.setVisibility(View.INVISIBLE);
                tiFormPostCode.setVisibility(View.INVISIBLE);
                tiFormWhatHappened.setVisibility(View.INVISIBLE);
                tiFormWhoInvolved.setVisibility(View.INVISIBLE);
                tiFormWhere.setVisibility(View.INVISIBLE);
                tiFormWhen.setVisibility(View.INVISIBLE);
            }
        });

        cbSaveQuestions.setOnCheckedChangeListener((buttonView, isChecked) ->{
            if (isChecked){
                cbQuestions.setChecked(false);
                tiFormName.setVisibility(View.VISIBLE);
                tiFormContact.setVisibility(View.VISIBLE);
                tiFormPostCode.setVisibility(View.VISIBLE);
                tiFormWhatHappened.setVisibility(View.VISIBLE);
                tiFormWhoInvolved.setVisibility(View.VISIBLE);
                tiFormWhere.setVisibility(View.VISIBLE);
                tiFormWhen.setVisibility(View.VISIBLE);
            }
        });


        bContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbQuestions.isChecked() || cbSaveQuestions.isChecked()) {
                    Intent intent = new Intent(ReferralPathway.this, Questionnaire.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(ReferralPathway.this, "Please check one of the options above before continuing", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}