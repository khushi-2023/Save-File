package com.bookapp.bookapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class More extends AppCompatActivity {
    ConstraintLayout con1,con2,con3,con4;
    ImageButton imgbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        con1=findViewById(R.id.c1);
        con2=findViewById(R.id.c2);
        con3=findViewById(R.id.c3);
        con4=findViewById(R.id.c4);
        imgbtn=findViewById(R.id.backBtn);

        con1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,cal.class));
            }
        });

        con2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,wach.class));
            }
        });
        con3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,pincode.class));
            }
        });

        con4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,spe.class));
            }
        });

        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,MainActivity.class));
            }
        });

    }
}