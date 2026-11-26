package com.example.r3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class valoracion2 extends AppCompatActivity {
    private TextView tv1;
    private RatingBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_valoracion2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tv1 = (TextView) findViewById(R.id.txtNombreRec);
        String dato= getIntent().getStringExtra("dato");
        tv1.setText("Te agradecemos "+dato);
        float rating=getIntent().getFloatExtra("Rating",0);
        pb=(RatingBar) findViewById(R.id.ratingBar);
        pb.setRating(rating);
    }
    public void Regresar(View view){
        Intent reg= new Intent(this,MainActivity.class);
        startActivity(reg);
    }
}