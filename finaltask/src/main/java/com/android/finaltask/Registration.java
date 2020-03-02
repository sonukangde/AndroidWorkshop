package com.android.finaltask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {

    EditText edtName, edtUsername, edtEmail, edtPassword, edtConfirmpassword;
    Button btnSignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        edtName = findViewById(R.id.edtName);
        edtUsername = findViewById(R.id.edtUsername);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        edtConfirmpassword = findViewById(R.id.edtConfirmpassword);
        btnSignup = findViewById(R.id.btnSignup);


        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("callFrom", "login");

                Intent intent = new Intent(Registration.this, MainActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);


            }


        });
    }
}