package com.example.hateid;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hateidapp.R;
import com.example.hateidapp.databinding.ActivityContactusBinding;

public class ContactusActivity extends AppCompatActivity {

    ActivityContactusBinding binding;
    TextView tvConnectVoiceWeb, tvCarolLongEmail, tvJohnClaytonEmail, tvStephanMacdonaldEmail, tvCatherineDonovanEmail;
    ImageButton ibBack, ibHomePage, ibDefinitions, ibForm, ibAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityContactusBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ibBack = findViewById(R.id.ibBack);
        ibBack = findViewById(R.id.ibBack);
        ibHomePage = findViewById(R.id.ibHomePage);
        ibDefinitions = findViewById(R.id.ibDefinitions);
        ibForm = findViewById(R.id.ibForm);
        ibAboutUs = findViewById(R.id.ibAboutUs);

        tvCarolLongEmail = findViewById(R.id.tvCarolLongEmail);
        tvJohnClaytonEmail = findViewById(R.id.tvJohnClaytonEmail);
        tvStephanMacdonaldEmail = findViewById(R.id.tvStephanMacdonaldEmail);
        tvCatherineDonovanEmail = findViewById(R.id.tvCatherineDonovanEmail);

        tvConnectVoiceWeb = findViewById(R.id.tvConnectVoiceWeb);
        tvConnectVoiceWeb.setMovementMethod(LinkMovementMethod.getInstance());


        Linkify.addLinks(tvCarolLongEmail, Linkify.EMAIL_ADDRESSES);
        Linkify.addLinks(tvJohnClaytonEmail, Linkify.EMAIL_ADDRESSES);
        Linkify.addLinks(tvStephanMacdonaldEmail, Linkify.EMAIL_ADDRESSES);
        Linkify.addLinks(tvCatherineDonovanEmail, Linkify.EMAIL_ADDRESSES);

        ibBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ibHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactusActivity.this, DescriptionPage.class);
                startActivity(intent);
            }
        });
        ibDefinitions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactusActivity.this, HomePage.class);
                startActivity(intent);
            }
        });

        ibForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactusActivity.this, ReferralPathway.class);
                startActivity(intent);
            }
        });
        ibAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactusActivity.this, ContactusActivity.class);
                startActivity(intent);
            }
        });
    }
}