package com.proyecto.pasemov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton Entrada1, Entrada2;
boolean ModoAccesibilidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Entrada1= findViewById(R.id.btnRegular);
        Entrada2= findViewById(R.id.btnVisibilidad);
        Entrada1.setOnClickListener(v ->
        {
            Intent intent1 = new Intent(this, Pantalla1.class);
            ModoAccesibilidad =false;
            intent1.putExtra("Modo",ModoAccesibilidad);
            startActivity(intent1);
        } );
        Entrada2.setOnClickListener(view -> {
            Intent intent2 = new Intent(this, Pantalla1.class);
            ModoAccesibilidad=true;
            intent2.putExtra("Modo",ModoAccesibilidad);
            startActivity(intent2);
        });
    }
}