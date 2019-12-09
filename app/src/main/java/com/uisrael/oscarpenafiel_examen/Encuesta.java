package com.uisrael.oscarpenafiel_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Encuesta extends AppCompatActivity {

    EditText pregUno;
    Button Registrar;
    CheckBox cbFut,cbBask, cbTen;
    RadioGroup radioGroup;
    RadioButton rbSi,rbNo;
    Bundle datos;
    TextView usuarioe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        pregUno = (EditText) findViewById(R.id.edtPregUno);

        cbFut = (CheckBox) findViewById(R.id.chbFut);
        cbBask = (CheckBox) findViewById(R.id.chbBas);
        cbTen = (CheckBox) findViewById(R.id.chbTen);

        radioGroup = (RadioGroup) findViewById(R.id.idRadioG);
        rbSi = findViewById(R.id.rbtSi);
        rbNo = findViewById(R.id.rbtNo);

        Registrar = (Button) findViewById(R.id.btnEnviar);
        usuarioe = (TextView) findViewById(R.id.idUsuarioEncuesta);


        datos = getIntent().getExtras();
        String user = datos.getString("usuarioenviado");
        usuarioe.setText("Usuario conectado: " + user);


        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Encuesta.this, Resumen.class);
                intent.putExtra("preguntauno", pregUno.getText().toString());

                startActivity(intent);
                if (cbFut.isChecked() && cbBask.isChecked() && cbTen.isChecked()) {
                    intent.putExtra("futbol", cbFut.getText().toString() + "basquet" + cbBask.getText().toString() + "tenis" + cbTen.getText().toString());
                    startActivity(intent);

                } else if (cbFut.isChecked() && cbBask.isChecked()) {
                    intent.putExtra("futbol", cbFut.getText().toString() + "basquet" + cbBask.getText().toString());
                    startActivity(intent);
                } else if (cbFut.isChecked() && cbTen.isChecked()) {
                    intent.putExtra("futbol", cbFut.getText().toString() + "tenis" + cbTen.getText().toString());
                    startActivity(intent);

                } else if (cbBask.isChecked() && cbTen.isChecked()) {
                    intent.putExtra("basquet", cbBask.getText().toString() + "tenis" + cbTen.getText().toString());
                    startActivity(intent);

                } else if (cbTen.isChecked()) {
                    intent.putExtra("tenis", cbTen.getText().toString());
                    startActivity(intent);
                } else if (cbBask.isChecked()) {
                    intent.putExtra("basquet", cbBask.getText().toString());
                    startActivity(intent);
                } else if (cbFut.isChecked()) {
                    intent.putExtra("futbol", cbFut.getText().toString());
                    startActivity(intent);

                }
                if (rbSi.isChecked()) {
                    intent.putExtra("Si", rbSi.getText().toString());
                    startActivity(intent);
                } else if (rbNo.isChecked()) {
                    intent.putExtra("No", rbNo.getText().toString());
                    startActivity(intent);
                }


            }
        });


    }

}
