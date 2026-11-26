package com.example.r3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class calculadora_semanal extends AppCompatActivity {

private TextView textViewCantEnergia;
private CheckBox com, cel, tel, lav, mic, nin, play, xbox, secadora, impresora, plancha, refrigerador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculadora_semanal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView btnRegresar = findViewById(R.id.reg);

        btnRegresar.setOnClickListener(v -> finish());

        textViewCantEnergia = (TextView) findViewById(R.id.textViewCantEnergia);
        com = (CheckBox) findViewById(R.id.com);
        cel = (CheckBox) findViewById(R.id.cel);
        tel = (CheckBox) findViewById(R.id.tel);
        lav = (CheckBox) findViewById(R. id.lav);
        mic = (CheckBox) findViewById(R.id.mic);
       nin= (CheckBox) findViewById(R.id.nin);
       play= (CheckBox) findViewById(R.id.play);
       xbox= (CheckBox) findViewById(R.id.xbox);
       secadora= (CheckBox) findViewById(R.id.secadora);
       impresora= (CheckBox) findViewById(R.id.impresora);
       plancha= (CheckBox) findViewById(R.id.plancha);
       refrigerador= (CheckBox) findViewById(R.id.refrigerador);


    }
    public void opciones (View view) {
        double tkwh = 0.0;

        //Dispositivos con posibles usos de 10hrs

        if (com.isChecked()) {
            double kwhcom = (150.0 * 10.0) / 1000.0;
            tkwh = tkwh + kwhcom;
        }

        if (cel.isChecked()) {
            double kwhcel = (15.0 * 10.0) / 1000.0;
            tkwh = tkwh + kwhcel;
        }

        if (tel.isChecked()) {
            double kwhtel = (100.0 * 10.0) / 1000.0;
            tkwh = tkwh + kwhtel;

        }

        if (refrigerador.isChecked()) {
            double kwhrefri = (150.0 * 10.0) / 1000.0;
            tkwh = tkwh + kwhrefri;
        }

        if (nin.isChecked()) {
            double kwhnin = (18.0 * 10.0) / 1000.0;
            tkwh = tkwh + kwhnin;
        }

        if (play.isChecked()) {
            double kwhplay = (180.0 * 10.0) / 1000.0;
            tkwh = tkwh + kwhplay;
        }

        if (xbox.isChecked()) {
            double kwhxbox = (180.0 * 10.0) / 1000.0;
            tkwh = tkwh + kwhxbox;
        }

        //Dispositivos con posibles usos de 2hrs

        if (lav.isChecked()) {
            double kwhlav = (500.0 * 2.0) / 1000.0;
            tkwh = tkwh + kwhlav;
        }

        if (mic.isChecked()) {
            double kwhmic = (1200.0 * 2.0) / 1000.0;
            tkwh = tkwh + kwhmic;
        }


        if (secadora.isChecked()) {
            double kwhxsec = (2000.0 * 2.0) / 1000.0;
            tkwh = tkwh + kwhxsec;
        }


        if (impresora.isChecked()) {
            double kwhim = (50.0 * 2.0) / 1000.0;
            tkwh = tkwh + kwhim;
        }

        if (plancha.isChecked()) {
            double kwhp = (1200.0 * 2.0) / 1000.0;
            tkwh = tkwh + kwhp;
        }


String resultado = String.valueOf(tkwh);
        textViewCantEnergia.setText(resultado +" Kwh");
    }

    public void pantalla_principal(View view){

        Intent pp = new Intent(this, MainActivity.class);
        startActivity(pp);
    }
    public void calc6(View view){
        Intent cc6 = new Intent(this,Calculadora.class);
        startActivity(cc6);

    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"¿Quieres calcular la energía de un solo dispositivo? Ve al apartado Calculadora",Toast.LENGTH_LONG).show();
    }
}