package com.example.hateidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hateidapp.databinding.ActivityHomePageBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomePage extends AppCompatActivity {
    Button bHateRelationships, bMateCrime, bNeighbourDisputes, bHateCrime, bHateIncident, bAntiSocialBehaviour, bClose, bContinue;
    TextView tvDefinition;
    ActivityHomePageBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomePageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());







        bHateRelationships = findViewById(R.id.bHateRelationships);
        bMateCrime = findViewById(R.id.bMateCrime);
        bNeighbourDisputes = findViewById(R.id.bNeighbourDisputes);
        bHateCrime = findViewById(R.id.bHateCrime);
        bHateIncident = findViewById(R.id.bHateIncident);
        bAntiSocialBehaviour = findViewById(R.id.bAntiSocialBehaviour);
        tvDefinition = findViewById(R.id.tvDefinition);
        bClose = findViewById(R.id.bClose);
        bContinue = findViewById(R.id.bContinue);






        bHateRelationships.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDefinition.setText("A ‘hate relationship’ looks to capture the familiar, repetitive, enduring and often ‘low level’ character of some forms of hate between clients and known perpetrators, akin to coercive control experienced in domestic violence and abuse. The cases involve a range of acts of violence reported over extended periods (in some cases years) towards the same client(s) and their families including abusive language; surveillance; disruptive noises; obstruction; thrown missiles; damage to property; harassment and threats; and physical violence, etc. Perpetrators are not strangers. They are already known primarily as neighbours or locals, or over time they become familiar to the clients. (CVA 2022).");
            }
        });
        bMateCrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDefinition.setText("Mate Crime is defined as the exploitation, abuse or theft from any person at risk from those they consider to be their friends. Those who commit such abuse or theft are often referred to as 'fake friends'. (Salford Safeguarding Adults Board 2023)");
            }
        });
        bNeighbourDisputes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDefinition.setText("Neighbour Disputes are where two neighbours disagree about something that then becomes a source of distress and frustration. It is common for both sides of the dispute to have done things to annoy the other person and ultimately the actual dispute is not ASB. (ASB Help 2023)");
            }
        });
        bHateCrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDefinition.setText("Any crime can be prosecuted as a hate crime if the offender has either demonstrated hostility based on race, religion, disability, sexual orientation, or transgender identity or been motivated by hostility based on race, religion, disability, sexual orientation or transgender identity. Someone can be a victim of more than one type of hate crime. (CPS 2023)");
            }
        });
        bHateIncident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDefinition.setText("A non-crime hate incident (“incident” is defined as “a single distinct event which disturbs an individual, group or community’s quality of life or causes them concern”) means an alleged incident which involves … an act by a person (‘the subject’) which is perceived by a person (the victim) to be motivated - wholly or partly - by hostility or prejudice towards persons with a particular characteristic. (Home Office 2023)");
            }
        });
        bAntiSocialBehaviour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDefinition.setText("Antisocial behaviour is defined as 'behaviour by a person which causes, or is likely to cause, harassment, alarm or distress to persons not of the same household as the person'. There are three main categories for antisocial behaviour, depending on how many people are affected: Personal antisocial behaviour is when a person targets a specific individual or group; Nuisance antisocial behaviour is when a person causes trouble, annoyance or suffering to a community; Environmental antisocial behaviour is when a person’s actions affect the wider environment, such as public spaces or buildings. (Met 2023)");
            }
        });
        bClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDefinition.setText("Please click a button above to see it's definition!");
            }
        });
        bContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, ReferralPathway.class);
                startActivity(intent);
                finish();
            }
        });
        binding.imgbtnAboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this,ReferralPathway.class));
            }
        });
        binding.imgbtnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this,ContactusActivity.class));
            }
        });
        binding.imgbtnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this,ReferralPathway.class));
            }
        });
        binding.imgbtnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this,HomePage.class));
            }
        });




    }
}