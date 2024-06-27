package com.example.hateid;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hateidapp.R;
import com.example.hateidapp.databinding.ActivitySignupBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class SignupActivity extends AppCompatActivity {
    ActivitySignupBinding binding;
    FirebaseAuth auth;

    Button btnalreadyaccount;

    FirebaseFirestore firestore;
    ProgressDialog progressDialog;

    String a;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btnalreadyaccount = findViewById(R.id.btnalreadyaccount);

        firestore = FirebaseFirestore.getInstance();
        auth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Create Your Account");
        progressDialog.setMessage("Please Wait");

        btnalreadyaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });



        binding.btnCreateaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = binding.username.getText().toString();
                String retypepassword = binding.sgnRetypepassword.getText().toString();
                String password = binding.txtPassword.getText().toString();

                if(email.isEmpty()){


                    binding.username.setError("Enter your email");


                }else if(retypepassword.isEmpty()){

                    binding.sgnRetypepassword.setError("Retype your password");

                }else if (password.isEmpty()){

                    binding.txtPassword.setError("Enter your password");
                }

                else if (!password.equals(retypepassword)){
                    binding.sgnRetypepassword.setError("The password dosent match");

                }
                else {

                    progressDialog.show();

                    auth.createUserWithEmailAndPassword(binding.username.getText().toString(),binding.txtPassword.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()){
                                Log.i(a,"onComplete: ");
                                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                                startActivity(intent);
                                finish();

                            }else {
                                Log.i(a,"Failure: "+task.getException());
                                Toast.makeText(SignupActivity.this, "Authentication Failed",Toast.LENGTH_SHORT).show();;

                            }






                        }
                    });


                };

            }

        });

    }
}