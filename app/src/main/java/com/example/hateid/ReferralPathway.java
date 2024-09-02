package com.example.hateid;


import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hateidapp.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class ReferralPathway extends AppCompatActivity {
    Button bSubmit, bContinue;
    CheckBox cbConsent, cbChildrenPre, cbChildrenPrimary, cbChildrenSecondary, cbChildrenAdult, cbChildrenNon, cbContactedYes, cbContactedNo, cbOrgPolice, cbOrgGP, cbOrgSocialHousing, cbOrgLandlord, cbOrgCouncil, cbOrgEducation, cbOrgSocialServices, cbOrgStopHate, cbOrgOther;
    LinearLayout PathwayLayout;
    ImageButton ibBack, ibHomePage, ibDefinitions, ibForm, ibAboutUs;

    TextInputEditText tiFormName, tiFormWhatHappened, tiFormWhoInvolved, tiFormWhere, tiFormWhen, tiOrgOther, tiAdditionalInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referral_pathway);

        ibHomePage = findViewById(R.id.ibHomePage);
        ibDefinitions = findViewById(R.id.ibDefinitions);
        ibForm = findViewById(R.id.ibForm);
        ibAboutUs = findViewById(R.id.ibAboutUs);
        ibBack = findViewById(R.id.ibBack);

        bSubmit = findViewById(R.id.bSubmit);
        bContinue = findViewById(R.id.bContinue);
        cbConsent = findViewById(R.id.cbConsent);
        tiFormName=findViewById(R.id.tiFormName);
        tiFormWhatHappened = findViewById(R.id.tiFormWhatHappened);
        tiFormWhoInvolved = findViewById(R.id.tiFormWhoInvolved);
        tiFormWhere = findViewById(R.id.tiFormWhere);
        tiFormWhen = findViewById(R.id.tiFormWhen);
        PathwayLayout = findViewById(R.id.PathwayLayout);
        cbChildrenPre = findViewById(R.id.cbChildrenPre);
        cbChildrenPrimary = findViewById(R.id.cbChildrenPrimary);
        cbChildrenSecondary = findViewById(R.id.cbChildrenSecondary);
        cbChildrenAdult = findViewById(R.id.cbChildrenAdult);
        cbChildrenNon = findViewById(R.id.cbChildrenNon);
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
        tiAdditionalInfo = findViewById(R.id.tiAdditionalInfo);

        cbConsent.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked){
                bSubmit.setVisibility(View.VISIBLE);
                bContinue.setVisibility(View.INVISIBLE);
            }
            else {
                bSubmit.setVisibility(View.INVISIBLE);
                bContinue.setVisibility(View.VISIBLE);
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

        ibBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ibHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReferralPathway.this, DescriptionPage.class);
                startActivity(intent);
            }
        });
        ibDefinitions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReferralPathway.this, HomePage.class);
                startActivity(intent);
            }
        });

        ibForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReferralPathway.this, ReferralPathway.class);
                startActivity(intent);
            }
        });
        ibAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReferralPathway.this, ContactusActivity.class);
                startActivity(intent);
            }
        });


        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbConsent.isChecked()) {
                    StringBuilder Children = new StringBuilder();
                    StringBuilder Organisations = new StringBuilder();
                    String ServiceUserName = Objects.requireNonNull(tiFormName.getText()).toString();
                    String WhatHappened = Objects.requireNonNull(tiFormWhatHappened.getText()).toString();
                    String WhoInvolved = Objects.requireNonNull(tiFormWhoInvolved.getText()).toString();
                    String Where = Objects.requireNonNull(tiFormWhere.getText()).toString();
                    String When = Objects.requireNonNull(tiFormWhen.getText()).toString();
                    String AdditionalInfo = (tiAdditionalInfo.getText()).toString();


                    if (cbChildrenPre.isChecked()) {
                        if (Children.length() > 0) Children.append(", ");
                        Children.append("Pre-school age children");
                    }
                    if (cbChildrenPrimary.isChecked()) {
                        if (Children.length() > 0) Children.append(", ");
                        Children.append("Primary school age children");
                    }
                    if (cbChildrenSecondary.isChecked()) {
                        if (Children.length() > 0) Children.append(", ");
                        Children.append("Secondary school age children");
                    }
                    if (cbChildrenAdult.isChecked()) {
                        if (Children.length() > 0) Children.append(", ");
                        Children.append("Dependent adult children living at home");
                    }
                    if (cbChildrenNon.isChecked()) {
                        if (Children.length() > 0) Children.append(", ");
                        Children.append("No Children");
                    }
                    String FinalChildren = Children.toString();


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


                    String EmailBody = "Service users name: " + ServiceUserName + "\nWhat happened: " + WhatHappened + "\nWho was involved: " + WhoInvolved + "\nWhere did this take place: " + Where + "\nWhen did this happen: " + When + "\nChildren impacted:" + FinalChildren + "\nOther Organisations that have been Contacted: "  + FinalOrganisations + "\nAdditional Information: " + AdditionalInfo;

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
                        }
                    });
                }
                else {
                    Toast.makeText(ReferralPathway.this, "Please check one of the options above before continuing", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReferralPathway.this, Questionnaire.class);
                startActivity(intent);
            }
        });
    }
}