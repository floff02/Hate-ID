package com.example.hateid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hateidapp.R;

public class HomePage extends AppCompatActivity {
    Button bHateRelationships, bMateCrime, bNeighbourDisputes, bHateCrime, bHateIncident, bAntiSocialBehaviour, bClose, bContinue;
    TextView tvDefinition;
    ImageButton ibBack, ibHomePage, ibDefinitions, ibForm, ibAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ibHomePage = findViewById(R.id.ibHomePage);
        ibDefinitions = findViewById(R.id.ibDefinitions);
        ibBack = findViewById(R.id.ibBack);
        ibForm = findViewById(R.id.ibForm);
        ibAboutUs = findViewById(R.id.ibAboutUs);

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
                tvDefinition.setText("A ‘hate relationship’ occurs when an individual/family experiences repetitive, often (but not always) ‘low level’ forms of hate from known perpetrators who live close by. The impacts are similar to coercive control experienced in domestic violence and abuse with victimised people feeling entrapped, isolated, and with profound impacts on physical and mental health and well being. Hate incidents [based on race, religion, disability, sexual orientation, or transgender identity] might include abusive language; surveillance; disruptive noises; obstruction; thrown missiles; damage to property; harassment and threats; and physical violence, etc. Perpetrators are not strangers (Donovan, Clayton and Macdonald 2021).");
            }
        });
        bMateCrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDefinition.setText("‘Mate crime’, the hostile acts of perpetrators who are ‘insiders’, sharing\n" +
                        "\n" +
                        "domesticity to some degree, there is a mutual relationship. The disabled person may cling to the relationship, wanting the hostility to stop but welcoming the company and feeling part of a family or group. These situations are not opportunistic, they are calculated. Disabled people in these situations are less likely to complain to the police or other authorities because they consider the perpetrators to be their friends. (Thomas 2011: 108)");
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
                tvDefinition.setText("Any crime can be prosecuted as a hate crime if the offender has either demonstrated hostility or been motivated by hostility based on race, religion, disability, sexual orientation, or transgender identity. Someone can be a victim of more than one type of hate crime. (CPS 2023)");
            }
        });
        bHateIncident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDefinition.setText("A non-crime hate incident means an incident or alleged incident which involves or is alleged to involve an act by a person (‘the subject’) which is perceived by a person other than the subject to be motivated - wholly or partly - by hostility or prejudice towards persons with a particular characteristic [based on race, religion, disability, sexual orientation, or transgender identity]. (see Home Office 2024)");
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

        ibBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ibHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, DescriptionPage.class);
                startActivity(intent);
            }
        });
        ibDefinitions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, HomePage.class);
                startActivity(intent);
            }
        });

        ibForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, ReferralPathway.class);
                startActivity(intent);
            }
        });
        ibAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, ContactusActivity.class);
                startActivity(intent);
            }
        });


    }
}