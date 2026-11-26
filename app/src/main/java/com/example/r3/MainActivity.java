package com.example.r3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void CalSem(View view){
        Intent cal=new Intent(this,calculadora_semanal.class);
        startActivity(cal);
    }
    public void art1(View view){
        Intent a1= new Intent(this,Art1.class);
        startActivity(a1);
    }
    public void art2(View view){
        Intent a2 = new Intent(this,Articulo2.class);
        startActivity(a2);
    }
    public void art4(View view){
        Intent a4 = new Intent(this, Articulo4.class);
        startActivity(a4);
    }

}