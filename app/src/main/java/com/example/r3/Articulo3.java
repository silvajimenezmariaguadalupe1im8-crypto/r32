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

public class Articulo3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_articulo3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView btnRegresar = findViewById(R.id.reg);

        btnRegresar.setOnClickListener(v -> finish());
    }
    public void calculaSE(View view) {
        Intent calS = new Intent(this, calculadora_semanal.class);
        startActivity(calS);
    }
    public void iniCi(View view){
        Intent iniC = new Intent(this, MainActivity.class);
        startActivity(iniC);
    }
    public void calc3(View view) {
        Intent cc3 = new Intent(this, Calculadora.class);
        startActivity(cc3);
    }
}