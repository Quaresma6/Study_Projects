package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Shape> shapeArrayList;

    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        shapeArrayList = new ArrayList<>();

        Shape s1 = new Shape(R.drawable.ic_launcher_background, "Sphere");
        Shape s2 = new Shape(R.drawable.ic_launcher_background, "Cylinder");
        Shape s3 = new Shape(R.drawable.ic_launcher_background, "Cube");
        Shape s4 = new Shape(R.drawable.ic_launcher_background, "Prism");

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);

        adapter = new MyCustomAdapter(shapeArrayList, getApplicationContext());

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0){
                    Intent i = new Intent(getApplicationContext(), Sphere.class);
                    startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(getApplicationContext(), Cylinder.class);
                    startActivity(i);
                }else if (position == 2) {
                    Intent i = new Intent(getApplicationContext(), Sphere.class);
                    startActivity(i);
                }else if (position == 3) {
                    Intent i = new Intent(getApplicationContext(), Sphere.class);
                    startActivity(i);
                }

            }
        });
    }
}