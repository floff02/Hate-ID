package com.example.hateidapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hateidapp.databinding.ActivityIntroBinding;


public class IntroActivity extends AppCompatActivity {
    ActivityIntroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setVariable();
        getWindow().setStatusBarColor(Color.parseColor("#1B1B1B"));
    }

    protected void setVariable() {
        binding.btnCont.setOnClickListener(v -> {

            startActivity(new Intent(IntroActivity.this, LoginActivity.class));

        });



    }
}