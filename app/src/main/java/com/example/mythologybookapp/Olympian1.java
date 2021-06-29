package com.example.mythologybookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Olympian1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olympian1);
    }

    public void hestiaOnClick(View view) {
        Intent intent =  new Intent(Olympian1.this,Aphrodite.class);
        startActivity(intent);
    }

    public void heraOnClick(View view) {
        Intent intent =  new Intent(Olympian1.this,Artemis.class);
        startActivity(intent);

    }

    public void demeterOnClick(View view) {
        Intent intent =  new Intent(Olympian1.this,Athena.class);
        startActivity(intent);
    }

    public void athenaOnClick(View view) {
        Intent intent =  new Intent(Olympian1.this,Demeter.class);
        startActivity(intent);
    }

    public void artemisOnClick(View view) {
        Intent intent =  new Intent(Olympian1.this,Hera.class);
        startActivity(intent);
    }

    public void aphroditeOnClick(View view) {
        Intent intent =  new Intent(Olympian1.this,Hestia.class);
        startActivity(intent);
    }
}