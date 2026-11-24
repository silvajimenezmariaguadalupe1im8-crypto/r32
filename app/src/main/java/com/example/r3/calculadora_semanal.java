package com.example.r3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class calculadora_semanal extends AppCompatActivity {

private TextView textViewCantEnergia;

private ImageView reg, imcalculadora, iminicio, imcalendario;
private Button calcularS;
private CheckBox com, cel, tel, lav, mic, caf, horno, nin, play, xbox, secadora, freidora, impresora, plancha, refrigerador, licuadora, batidora;

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

       textViewCantEnergia= (TextView) findViewById(R.id.textViewCantEnergia);
       reg= (ImageView) findViewById(R.id.reg);
       imcalculadora= (ImageView) findViewById(R.id.imcalculadora);
       iminicio= (ImageView) findViewById(R.id.iminicio);
       imcalendario= (ImageView) findViewById(R.id.imcalendario);
       calcularS= (Button) findViewById(R.id.calcularS);
       com= (CheckBox) findViewById(R.id.com);
       cel= (CheckBox) findViewById(R.id.cel);
       tel= (CheckBox) findViewById(R.id.tel);
       lav= (CheckBox) findViewById(R.id.lav);
       mic = (CheckBox) findViewById(R.id.mic);
       caf= (CheckBox) findViewById(R.id.caf);
       horno= (CheckBox) findViewById(R.id.horno);
       nin= (CheckBox) findViewById(R.id.nin);
       play= (CheckBox) findViewById(R.id.play);
       xbox= (CheckBox) findViewById(R.id.xbox);
       secadora= (CheckBox) findViewById(R.id.secadora);
       freidora= (CheckBox) findViewById(R.id.freidora);
       impresora= (CheckBox) findViewById(R.id.impresora);
       plancha= (CheckBox) findViewById(R.id.plancha);
       refrigerador= (CheckBox) findViewById(R.id.refrigerador);
       licuadora= (CheckBox) findViewById(R.id.licuadora);
       batidora= (CheckBox) findViewById(R.id.batidora);

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

        if (caf.isChecked()) {
            double kwhcaf = (900.0 * 2.0) / 1000.0;
            tkwh = tkwh + kwhcaf;
        }

        if (horno.isChecked()) {
            double kwhhorno = (1500.0 * 2.0) / 1000.0;
            tkwh = tkwh + kwhhorno;
        }

        if (secadora.isChecked()) {
            double kwhxsec = (2000.0 * 2.0) / 1000.0;
            tkwh = tkwh + kwhxsec;
        }

        if (freidora.isChecked()) {
            double kwhf = (1500.0 * 2.0) / 1000.0;
            tkwh = tkwh + kwhf;
        }

        if (impresora.isChecked()) {
            double kwhim = (50.0 * 2.0) / 1000.0;
            tkwh = tkwh + kwhim;
        }

        if (plancha.isChecked()) {
            double kwhp = (1200.0 * 2.0) / 1000.0;
            tkwh = tkwh + kwhp;
        }

        if (licuadora.isChecked()) {
            double kwhli = (400.0 * 2.0) / 1000.0;
            tkwh = tkwh + kwhli;
        }

        if (batidora.isChecked()) {
            double kwhbat = (300.0 * 2.0) / 1000.0;
            tkwh = tkwh + kwhbat;
        }

String resultado = String.valueOf(tkwh);
        textViewCantEnergia.setText(resultado);
    }
}