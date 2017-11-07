package com.example.marvin.proyectoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button btnHorarios, btnLaboratorios, btnReglamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnHorarios=(Button)findViewById(R.id.btnHorarios);
        btnLaboratorios=(Button)findViewById(R.id.btnLaboratorios);
        btnReglamento=(Button)findViewById(R.id.btnReglamento);


        btnHorarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent objCarnetClave=new Intent(getApplicationContext(),Main3Activity.class);
                startActivityForResult(objCarnetClave,1);
            }
        });


        btnLaboratorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent objCarnetClave=new Intent(getApplicationContext(),Main4Activity.class);
                startActivityForResult(objCarnetClave,1);
            }
        });


        btnReglamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent objCarnetClave=new Intent(getApplicationContext(),Main5Activity.class);
                startActivityForResult(objCarnetClave,1);
            }
        });


    }
}
































