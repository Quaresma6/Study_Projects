package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sphere extends AppCompatActivity {

    EditText sphereRadius;
    TextView txtResult, txtTitle;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        sphereRadius = findViewById(R.id.editTextText_sphere);
        txtTitle = findViewById(R.id.txtTitle);
        txtResult = findViewById(R.id.txtResult);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius = sphereRadius.getText().toString();

                int r = Integer.parseInt(radius);

                double volume = (4/3) * 3.14159 *r*r*r;
                txtResult.setText("V = "+volume+" m^3");
            }
        });


    }
}