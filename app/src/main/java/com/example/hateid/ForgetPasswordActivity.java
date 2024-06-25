package com.example.hateid;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hateidapp.databinding.ActivityForgetPasswordBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgetPasswordActivity extends AppCompatActivity {

    ActivityForgetPasswordBinding binding;
    FirebaseAuth auth;


    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityForgetPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        auth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Create Your Account");
        progressDialog.setMessage("Please Wait");


        binding.textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgetPasswordActivity.this,LoginActivity.class));
            }
        });
        binding.sendemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = binding.username.getText().toString();
                progressDialog.dismiss();

                if (email.isEmpty()){
                    binding.username.setError("Enter Email");
                }else {

                    auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                            if (task.isSuccessful()){
                                progressDialog.dismiss();
                                Toast.makeText(ForgetPasswordActivity.this,"Cheack Your Email (Check your spam mail too)",Toast.LENGTH_SHORT).show();

                                startActivity(new Intent(ForgetPasswordActivity.this,LoginActivity.class));
                            }else {


                                progressDialog.dismiss();

                                Toast.makeText(ForgetPasswordActivity.this, task.getException().getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                            }

                        }
                    });
                }

            }
        });
    }
}