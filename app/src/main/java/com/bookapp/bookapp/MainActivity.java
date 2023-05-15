package com.bookapp.bookapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bookapp.bookapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    AppCompatButton btn;
    //view binding
    private ActivityMainBinding binding;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());

            //handle loginBtn click, start login screen
            binding.loginBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                }
            });
            //handle skipBtn click, start continue without login screen
         //   binding.skipBtn.setOnClickListener(new View.OnClickListener() {
           //     @Override
             //   public void onClick(View v) {
               //     startActivity(new Intent(MainActivity.this, DashboardUserActivity.class));

                //}
            //});
        btn=findViewById(R.id.mor);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,More.class));
            }
        });



    }
}
