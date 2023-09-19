package com.ejemplo.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, cedula, fechaNacimiento;
    Button A,B,C;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombre);
        cedula = findViewById(R.id.cedula);
        fechaNacimiento = findViewById(R.id.nacimiento);
        A = findViewById(R.id.opcionA);
        B = findViewById(R.id.opcionB);
        C = findViewById(R.id.opcionC);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                voto = "A"
            }
        });

    }
}