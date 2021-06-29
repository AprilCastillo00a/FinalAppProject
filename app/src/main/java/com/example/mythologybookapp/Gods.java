package com.example.mythologybookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gods extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gods);

        button= findViewById(R.id.button);
    }

    public void btnFunction(View view) {
        Intent intent=new Intent(Gods.this,Olympian.class);
        startActivity(intent);
    }

    public void btnFunction1(View view) {
        Intent intent = new Intent(Gods.this, Olympian1.class);
        startActivity(intent);
    }
}