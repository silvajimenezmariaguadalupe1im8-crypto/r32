package com.example.r3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class valoracion1 extends AppCompatActivity {
private EditText et1;
private RatingBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_valoracion1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                    return insets;
                });
            et1 = (EditText) findViewById(R.id.editNom);
            pb = (RatingBar) findViewById(R.id.powerBar);
    }
           public void Siguiente(View view){
               Intent sig = new Intent(this, valoracion2.class);
               float rating = pb.getRating();
               sig.putExtra("Rating", rating);
               sig.putExtra("dato",et1.getText().toString());
               startActivity(sig);

           }

}