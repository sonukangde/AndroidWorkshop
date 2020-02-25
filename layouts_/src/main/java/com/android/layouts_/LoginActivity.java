package com.android.layouts_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsername,edtPassword;
    TextView signUp;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername=findViewById(R.id.edtUsername);
        edtPassword=findViewById(R.id.edtPassword);
        signUp=findViewById(R.id.txtSignUp);
        btnLogin=findViewById(R.id.btnLogIn);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle=new Bundle();
                bundle.putString("callFrom","login");

                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}