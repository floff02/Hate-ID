package com.example.hateid;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hateidapp.R;

public class MoreOptions extends AppCompatActivity {
    ImageButton ibBack, ibHomePage, ibDefinitions, ibForm, ibAboutUs;
    LinearLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_options);

        ibBack = findViewById(R.id.ibBack);

        ibHomePage = findViewById(R.id.ibHomePage);
        ibDefinitions = findViewById(R.id.ibDefinitions);
        ibForm = findViewById(R.id.ibForm);
        ibAboutUs = findViewById(R.id.ibAboutUs);

        ibBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ibHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoreOptions.this, DescriptionPage.class);
                startActivity(intent);
            }
        });
        ibDefinitions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoreOptions.this, HomePage.class);
                startActivity(intent);
            }
        });

        ibForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoreOptions.this, ReferralPathway.class);
                startActivity(intent);
            }
        });
        ibAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoreOptions.this, ContactusActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout rootLayout = findViewById(R.id.rootLayout);

        for (int i = 0; i < rootLayout.getChildCount(); i++) {
            if (rootLayout.getChildAt(i) instanceof TextView) {
                TextView textView = (TextView) rootLayout.getChildAt(i);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }
}