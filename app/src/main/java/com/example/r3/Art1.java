package com.example.r3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Art1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_art1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView btnRegresar = findViewById(R.id.reg);

        btnRegresar.setOnClickListener(v -> finish());

    }

    public void calc_sem (View view){

        Intent cs = new Intent(this, calculadora_semanal.class);
        startActivity(cs);
    }
    public void ini(View view){
        Intent in = new Intent(this,MainActivity.class);
        startActivity(in);
    }
    //Publicar para la calculadora
    public void calc1(View view) {
        Intent cc1 = new Intent(this, Calculadora.class);
        startActivity(cc1);
    }
    }
