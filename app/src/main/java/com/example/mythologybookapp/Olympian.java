package com.example.mythologybookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Olympian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olympian);
    }

    public void zeusOnClick(View view) {
        Intent intent = new Intent(Olympian.this,Apollo.class);
        startActivity(intent);
    }

    public void poseidonOnClick(View view) {
        Intent intent = new Intent(Olympian.this,Ares.class);
        startActivity(intent);
    }

    public void hermesOnClick(View view) {
        Intent intent = new Intent(Olympian.this,Dionysus.class);
        startActivity(intent);
    }

    public void hephaestusOnClick(View view) {
        Intent intent = new Intent(Olympian.this,Hades.class);
        startActivity(intent);
    }

    public void HadesOnClick(View view) {
        Intent intent = new Intent(Olympian.this,Hephaestus.class);
        startActivity(intent);
    }

    public void DionysusOnClick(View view) {
        Intent intent = new Intent(Olympian.this,Hermes.class);
        startActivity(intent);
    }

    public void aresOnClick(View view) {
        Intent intent = new Intent(Olympian.this,Poseidon.class);
        startActivity(intent);
    }

    public void apolloOnClick(View view) {
        Intent intent = new Intent(Olympian.this,Zeus.class);
        startActivity(intent);
    }
}