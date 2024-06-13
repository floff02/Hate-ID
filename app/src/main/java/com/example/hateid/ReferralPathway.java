package com.example.hateid;


import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class ReferralPathway extends AppCompatActivity {
    Button bSubmit, bContinue;
    CheckBox cbQuestions, cbSaveQuestions, cbContactedYes, cbContactedNo, cbOrgPolice, cbOrgGP, cbOrgSocialHousing, cbOrgLandlord, cbOrgCouncil, cbOrgEducation, cbOrgSocialServices, cbOrgStopHate, cbOrgOther;
    LinearLayout PathwayLayout;
    TextView Page1;

    TextInputEditText tiFormName, tiFormContact, tiFormPostCode, tiFormWhatHappened, tiFormWhoInvolved, tiFormWhere, tiFormWhen, tiOrgOther;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referral_pathway);

        bSubmit = findViewById(R.id.bSubmit);
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
        Page1 = findViewById(R.id.Page1);

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
                Page1.setVisibility(View.VISIBLE);
                bSubmit.setVisibility(View.INVISIBLE);
                bContinue.setVisibility(View.VISIBLE);
                bContinue.setText("Continue without Submitting");

                bContinue.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(ReferralPathway.this, Questionnaire.class);
                        startActivity(intent);
                        finish();
                    }
                });
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
                Page1.setVisibility(View.VISIBLE);
                bSubmit.setVisibility(View.VISIBLE);
                bContinue.setVisibility(View.INVISIBLE);
                bSubmit.setText("Submit");
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


        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbSaveQuestions.isChecked()) {
                    bContinue.setVisibility(View.INVISIBLE);
                    StringBuilder Organisations = new StringBuilder();
                    String ServiceUserName = Objects.requireNonNull(tiFormName.getText()).toString();
                    String ContactInfo = Objects.requireNonNull(tiFormContact.getText()).toString();
                    String PostCode = Objects.requireNonNull(tiFormPostCode.getText()).toString();
                    String WhatHappened = Objects.requireNonNull(tiFormWhatHappened.getText()).toString();
                    String WhoInvolved = Objects.requireNonNull(tiFormWhoInvolved.getText()).toString();
                    String Where = Objects.requireNonNull(tiFormWhere.getText()).toString();
                    String When = Objects.requireNonNull(tiFormWhen.getText()).toString();

                    if (cbOrgPolice.isChecked()) {
                        if (Organisations.length() > 0) Organisations.append(", ");
                        Organisations.append("Police");
                    }
                    if (cbOrgGP.isChecked()) {
                        if (Organisations.length() > 0) Organisations.append(", ");
                        Organisations.append("GP/Health Practitioner");
                    }
                    if (cbOrgSocialHousing.isChecked()) {
                        if (Organisations.length() > 0) Organisations.append(", ");
                        Organisations.append("Social Housing");
                    }
                    if (cbOrgLandlord.isChecked()) {
                        if (Organisations.length() > 0) Organisations.append(", ");
                        Organisations.append("Landlord");
                    }
                    if (cbOrgCouncil.isChecked()) {
                        if (Organisations.length() > 0) Organisations.append(", ");
                        Organisations.append("Council/Anti-social Behaviour Team");
                    }
                    if (cbOrgEducation.isChecked()) {
                        if (Organisations.length() > 0) Organisations.append(", ");
                        Organisations.append("Educational Institutions");
                    }
                    if (cbOrgSocialServices.isChecked()) {
                        if (Organisations.length() > 0) Organisations.append(", ");
                        Organisations.append("Social Services/Social Workers/Care Staff etc");
                    }
                    if (cbOrgStopHate.isChecked()) {
                        if (Organisations.length() > 0) Organisations.append(", ");
                        Organisations.append("Stop Hate UK/Tell MAMA/Other third-party Reporting Services");
                    }
                    if (cbOrgOther.isChecked()) {
                        if (Organisations.length() > 0) Organisations.append(", ");
                        Organisations.append(tiOrgOther.getText());
                    }

                    String FinalOrganisations = Organisations.toString();


                    String EmailBody = "Service users name: " + ServiceUserName + "\nContact Information: " + ContactInfo + "\nPostcode: " + PostCode + "\nWhat happened: " + WhatHappened + "\nWho was involved: " + WhoInvolved + "\nWhere did this take place: " + Where + "\nWhen did this happen: " + When + "\nOther Organisations that have been Contacted: " + FinalOrganisations;

                    Log.d(TAG, "Email Body: " + EmailBody);
                    Intent EmailIntent = new Intent(Intent.ACTION_SENDTO);
                    EmailIntent.setData(Uri.parse("mailto:"));
                    EmailIntent.putExtra(Intent.EXTRA_SUBJECT, "HATE ID: Service user referral: " + ServiceUserName);
                    EmailIntent.putExtra(Intent.EXTRA_TEXT, EmailBody);

                    startActivity(Intent.createChooser(EmailIntent, "Choose an Email Client: "));

                    Toast.makeText(ReferralPathway.this, "Please return to the app after sending the email to proceed.", Toast.LENGTH_LONG).show();

                    bSubmit.setVisibility(View.INVISIBLE);
                    bContinue.setVisibility(View.VISIBLE);

                    bContinue.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(ReferralPathway.this, Questionnaire.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
                else {
                    Toast.makeText(ReferralPathway.this, "Please check one of the options above before continuing", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}