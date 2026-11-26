package com.example.r3;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Calculadora extends AppCompatActivity {

    private TextView tvResultado;
    private Spinner spUnidades;
    private ImageView btnRegresar;

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private Button btnPunto, btnClr, btnDel, btnPorcentaje, btnSuma, btnResta, btnMult, btnDiv, btnIgual;

    double num1 = 0;
    String operacion = "";
    boolean limpiarPantalla = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculadora);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvResultado = findViewById(R.id.tvResultado);
        spUnidades = findViewById(R.id.spUnidades);
        btnRegresar = findViewById(R.id.btnRegresar);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnPunto = findViewById(R.id.btnPunto);
        btnClr = findViewById(R.id.btnClr);
        btnDel = findViewById(R.id.btnDel);
        btnPorcentaje = findViewById(R.id.btnporcentaje);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);
        btnIgual = findViewById(R.id.btnIgual);

        String[] opciones = {"Watts", "Ampers", "Kilowatts"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                opciones
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spUnidades.setAdapter(adapter);

        btnRegresar.setOnClickListener(v -> finish());
        {

            // public void onClick(View v) {
            finish();


            // btnPunto.setOnClickListener(v -> {
            String actual = tvResultado.getText().toString();
            if (limpiarPantalla) {
                tvResultado.setText("0.");
                limpiarPantalla = false;
            } else if (!actual.contains(".")) {
                tvResultado.setText(actual + ".");
            }
            //   });

        }

// btnClr.setOnClickListener(v -> {
        //     num1 = 0;
        //   operacion = "";
        // limpiarPantalla = true;
        // tvResultado.setText("0");
        // });

    }
}