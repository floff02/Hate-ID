package com.example.hateid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hateidapp.R;

public class DescriptionPage extends AppCompatActivity {
    Button bContinue;
    ImageButton ibBack, ibHomePage, ibDefinitions, ibForm, ibAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_page);
        bContinue = findViewById(R.id.bContinue);
        ibBack = findViewById(R.id.ibBack);
        ibHomePage = findViewById(R.id.ibHomePage);
        ibDefinitions = findViewById(R.id.ibDefinitions);
        ibForm = findViewById(R.id.ibForm);
        ibAboutUs = findViewById(R.id.ibAboutUs);

        bContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DescriptionPage.this, HomePage.class);
                startActivity(intent);
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
                Intent intent = new Intent(DescriptionPage.this, DescriptionPage.class);
                startActivity(intent);
            }
        });
        ibDefinitions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DescriptionPage.this, HomePage.class);
                startActivity(intent);
            }
        });

        ibForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DescriptionPage.this, ReferralPathway.class);
                startActivity(intent);
            }
        });
        ibAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DescriptionPage.this, ContactusActivity.class);
                startActivity(intent);
            }
        });
    }
}