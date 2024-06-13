package com.example.hateid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MoreOptions extends AppCompatActivity {
    ImageButton ibBack;
    LinearLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_options);

        ibBack = findViewById(R.id.ibBack);

        ibBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoreOptions.this, Results.class);
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