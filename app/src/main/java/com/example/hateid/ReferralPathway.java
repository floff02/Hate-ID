package com.example.hateid;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class ReferralPathway extends AppCompatActivity {
    Button bContinue, bSubmitContinue;
    CheckBox cbQuestions, cbSaveQuestions, cbContactedYes, cbContactedNo, cbOrgPolice, cbOrgGP, cbOrgSocialHousing, cbOrgLandlord, cbOrgCouncil, cbOrgEducation, cbOrgSocialServices, cbOrgStopHate, cbOrgOther;
    LinearLayout PathwayLayout;

    TextInputEditText tiFormName, tiFormContact, tiFormPostCode, tiFormWhatHappened, tiFormWhoInvolved, tiFormWhere, tiFormWhen, tiOrgOther;


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
        PathwayLayout = findViewById(R.id.PathwayLayout);
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
        cbContactedYes = findViewById(R.id.cbContactedYes);
        cbContactedNo = findViewById(R.id.cbContactedNo);

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
                PathwayLayout.setVisibility(View.VISIBLE);
                cbOrgPolice.setVisibility(View.INVISIBLE);
                cbOrgGP.setVisibility(View.INVISIBLE);
                cbOrgSocialHousing.setVisibility(View.INVISIBLE);
                cbOrgLandlord.setVisibility(View.INVISIBLE);
                cbOrgCouncil.setVisibility(View.INVISIBLE);
                cbOrgEducation.setVisibility(View.INVISIBLE);
                cbOrgSocialServices.setVisibility(View.INVISIBLE);
                cbOrgStopHate.setVisibility(View.INVISIBLE);
                cbOrgOther.setVisibility(View.INVISIBLE);
                tiOrgOther.setVisibility(View.INVISIBLE);
                cbContactedYes.setVisibility(View.INVISIBLE);
                cbContactedNo.setVisibility(View.INVISIBLE);
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
                PathwayLayout.setVisibility(View.VISIBLE);
                cbOrgPolice.setVisibility(View.VISIBLE);
                cbOrgGP.setVisibility(View.VISIBLE);
                cbOrgSocialHousing.setVisibility(View.VISIBLE);
                cbOrgLandlord.setVisibility(View.VISIBLE);
                cbOrgCouncil.setVisibility(View.VISIBLE);
                cbOrgEducation.setVisibility(View.VISIBLE);
                cbOrgSocialServices.setVisibility(View.VISIBLE);
                cbOrgStopHate.setVisibility(View.VISIBLE);
                cbOrgOther.setVisibility(View.VISIBLE);
                tiOrgOther.setVisibility(View.VISIBLE);
                cbContactedYes.setVisibility(View.VISIBLE);
                cbContactedNo.setVisibility(View.VISIBLE);
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