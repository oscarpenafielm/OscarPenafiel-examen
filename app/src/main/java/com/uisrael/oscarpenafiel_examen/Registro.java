package com.uisrael.oscarpenafiel_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    EditText nombre, monto,pago;
    Button Guardar;
    TextView usuario;

    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        usuario=(TextView) findViewById(R.id.idUsuario);
        nombre=(EditText)findViewById(R.id.edtNombre);
        monto=(EditText)findViewById(R.id.edtMontoInicial);
        pago=(EditText)findViewById(R.id.edtPagoMensual);
        Guardar=(Button)findViewById(R.id.btnGuardar);


        datos=getIntent().getExtras();
        String user=datos.getString("usuarioenviado");
        usuario.setText("Usuario conectado: " + user);

        //nuevo
        final String usuariop= usuario.getText().toString();

        Guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String dato = nombre.getText().toString();
                String dato1 = monto.getText().toString();
                String dato2 = pago.getText().toString();
                Intent intent= new Intent(Registro.this,Encuesta.class);
                intent.putExtra("usuarioenviador",usuariop);
                intent.putExtra("nombre",dato);
                intent.putExtra("monto", dato1);
                intent.putExtra("pago", dato2);
                Toast.makeText(getApplicationContext(),"ELEMENTO GUARDADO CON EXITO: ",Toast.LENGTH_LONG).show();
                startActivity(intent);



            }
        });
    }
}