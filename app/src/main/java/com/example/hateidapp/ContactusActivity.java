package com.example.hateidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hateidapp.databinding.ActivityContactusBinding;
import com.example.hateidapp.databinding.ActivityForgetPasswordBinding;

public class ContactusActivity extends AppCompatActivity {

    ActivityContactusBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityContactusBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imgbtnAboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContactusActivity.this,ReferralPathway.class));
            }
        });
        binding.imgbtnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContactusActivity .this,ContactusActivity.class));
            }
        });
        binding.imgbtnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContactusActivity .this,ReferralPathway.class));
            }
        });
        binding.imgbtnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContactusActivity .this,HomePage.class));
            }
        });
    }
}