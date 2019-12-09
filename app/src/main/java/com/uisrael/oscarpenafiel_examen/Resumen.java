package com.uisrael.oscarpenafiel_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {
    TextView txtuser, txtnombre, txtpreuno, txtfut, txtbas,txtten, txtsi, txtno,txtmostrar;
    Bundle datos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        txtuser=(TextView) findViewById(R.id.idRusuario);
        txtnombre=(TextView) findViewById(R.id.idRnombre);
        txtpreuno=(TextView)findViewById(R.id.idPregunta1);
        txtfut=(TextView) findViewById(R.id.idPregunta2fut);
        txtbas=(TextView) findViewById(R.id.idPregunta2bas);
        txtten=(TextView) findViewById(R.id.idPregunta2ten);
        txtsi=(TextView) findViewById(R.id.idPregunta3si);
        txtno=(TextView) findViewById(R.id.idPregunta3no);
        datos=getIntent().getExtras();
     //   String nombreobtenido=datos.getString("nombre");
        String user=datos.getString("usuarioenviado");

     //   String nombre=getIntent().getStringExtra("nombre");
        String preguntauno=getIntent().getStringExtra("preguntauno");
        String futbol=getIntent().getStringExtra("futbol");
        String basket=getIntent().getStringExtra("basquet");
        String tenis=getIntent().getStringExtra("tenis");
        String Si=getIntent().getStringExtra("Si");
        String No=getIntent().getStringExtra("No");

        txtuser.setText("Usuario conectado: " + user);
     //   txtnombre.setText("Nombre:"+nombreobtenido);
        txtpreuno.setText("pregunta1: " + preguntauno);
        txtfut.setText("Su deporte es : " + futbol);
        txtbas.setText("Su deportes es: " + basket);
        txtten.setText("Su deportes es: " + tenis);
        txtsi.setText("Le gustaria estudiar: " +Si);
        txtno.setText("Le gustaria estudiar: " + No);

    }
}
