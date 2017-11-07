package com.example.marvin.proyectoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtCarnet,edtClave;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCarnet=(EditText)findViewById(R.id.edtCarnet);
        edtClave=(EditText)findViewById(R.id.edtClave);
        btnIngresar=(Button)findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Carnet=edtCarnet.getText().toString().trim();
                String Clave=edtClave.getText().toString().trim();
                if(TextUtils.isEmpty(Carnet)){
                    edtCarnet.setError(getResources().getString(R.string.msj_edtCarnet));
                    edtCarnet.requestFocus();
                }else if (TextUtils.isEmpty(Clave)){
                    edtClave.setError(getResources().getString(R.string.msj_edtClave));
                    edtClave.requestFocus();
                }else{
                    Intent objCarnetClave=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivityForResult(objCarnetClave,1);
                }
            }
        });

    }
}
