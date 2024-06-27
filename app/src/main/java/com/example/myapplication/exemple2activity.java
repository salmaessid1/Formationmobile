package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class exemple2activity extends AppCompatActivity {

    //declaration de variables
    private ImageView image;
    private Button btnShow , btnHide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemple2activity);

        //affectation des views
        image = findViewById(R.id.imageToHideAndShow);
        btnShow = findViewById(R.id.btnshow);
        btnHide = findViewById(R.id.btnhide);

        //first case
        btnShow.setOnClickListener(v ->{
            //action after click to button
            image.setVisibility(View.VISIBLE);
        });
        //second case
        btnHide.setOnClickListener(v ->{
            //action after click to button
            image.setVisibility(View.INVISIBLE);
        });
    }
}