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
    ImageButton ibBack, ibList, ibAboutus, ibBook;
    LinearLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_options);

        ibBack = findViewById(R.id.ibBack);

        ibList = findViewById(R.id.ibList);
        ibAboutus = findViewById(R.id.ibAboutUs);
        ibBook = findViewById(R.id.ibBook);

        ibBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoreOptions.this, Results.class);
                startActivity(intent);
            }
        });

        ibBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoreOptions.this, HomePage.class);
                startActivity(intent);
                finish();
            }
        });

        ibList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoreOptions.this, ReferralPathway.class);
                startActivity(intent);
                finish();
            }
        });
        ibAboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoreOptions.this, ContactusActivity.class);
                startActivity(intent);
                finish();
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