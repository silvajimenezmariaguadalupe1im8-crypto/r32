package com.example.r3;

import android.os.Bundle;
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
}