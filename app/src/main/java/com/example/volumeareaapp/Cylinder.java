package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {

    EditText cylinderRadius, cyclinderHeight;
    TextView txtResult, txtTitle;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        cylinderRadius= findViewById(R.id.editTextText_cylinder);
        txtTitle = findViewById(R.id.txtTitle);
        txtResult = findViewById(R.id.txtResult);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius = cylinderRadius.getText().toString();

                int r = Integer.parseInt(radius);

                double volume = (4/3) * 3.14159 *r*r*r;
                txtResult.setText("V = "+volume+" m^3");
            }
        });
    }
}