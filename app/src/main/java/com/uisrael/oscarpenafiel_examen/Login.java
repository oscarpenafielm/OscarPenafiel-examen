package com.uisrael.oscarpenafiel_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    EditText user, pass;
    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user=(EditText) findViewById(R.id.edtUsuario);
        pass=(EditText) findViewById(R.id.edtContrasena);
        ingresar=(Button) findViewById(R.id.btnIniciar);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario=user.getText().toString();
                String password=pass.getText().toString();

                if(usuario.equals("estudiante2019")&& password.equals ("uisrael2019"))
                {
                    Intent intent= new Intent(getApplicationContext(),Registro.class);
                    intent.putExtra("usuarioenviado",usuario);
                    Toast.makeText(getApplicationContext(),"BIENVENIDO: "+ usuario,Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario o  Contraseña INCORRECTOS", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}
