package com.android.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    button=findViewById(R.id.button2);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            BlankFragment fragment=new BlankFragment();
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.replace(R.id.frame_container,fragment);
            fragmentTransaction.commit();

        }



    });

    button2=findViewById(R.id.button3);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            BlankFragment fragment=new BlankFragment();
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.replace(R.id.frame_container,fragment);
            fragmentTransaction.commit();

        }
    });
    button3=findViewById(R.id.button4);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            BlankFragment fragment=new BlankFragment();
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.replace(R.id.frame_container,fragment);
            fragmentTransaction.commit();

        }
    });


    }
}
