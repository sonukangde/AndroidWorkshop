package com.android.finaltask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtUsername, edtPassword;
    TextView txtSignup;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsername=findViewById(R.id.edtUsername);
        edtPassword=findViewById(R.id.edtPassword);
        txtSignup=findViewById(R.id.txtSignup);
        btnLogin=findViewById(R.id.btnLogin);


        txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle=new Bundle();
                bundle.putString("callFrom","login");

                Intent intent=new Intent(MainActivity.this,Registration.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
