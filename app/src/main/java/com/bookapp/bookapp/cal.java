package com.bookapp.bookapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class cal extends AppCompatActivity {
    ImageButton imgbtn, imgback;
    EditText num1,num2;
    TextView result;
    AppCompatButton add,sub,mul,div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        imgbtn=findViewById(R.id.logoutBtn);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cal.this,MainActivity.class));
            }
        });
        imgback=findViewById(R.id.backBtn);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cal.this,More.class));
            }
        });



        num1=findViewById(R.id.Edtfst);
        num2=findViewById(R.id.Edtscnd);

        add=findViewById(R.id.mBtnAdd);
        sub=findViewById(R.id.mBtnSubtrac);
        mul=findViewById(R.id.mBtnMultiple);
        div=findViewById(R.id.mBtnDivide);

        result=findViewById(R.id.TxtResult);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fno=num1.getText().toString();
                String sno=num2.getText().toString();
                if(fno.equals("")){
                    num1.setError("Plz Enter num1");
                }
                else if(sno.equals("")){
                    num2.setError("Plz Enter num2");
                }
                else {
                    Integer A=Integer.parseInt(fno);
                    Integer B=Integer.parseInt(sno);
                    int Result = A+B;
                    result.setText(String.valueOf(Result));
                    Toast.makeText(cal.this, "Add...", Toast.LENGTH_SHORT).show();
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fno=num1.getText().toString();
                String sno=num2.getText().toString();
                if(fno.equals("")){
                    num1.setError("Plz Enter num1");
                }
                else if(sno.equals("")){
                    num2.setError("Plz Enter num2");
                }
                else {
                    Integer A=Integer.parseInt(fno);
                    Integer B=Integer.parseInt(sno);
                    int Result = A-B;
                    result.setText(String.valueOf(Result));
                    Toast.makeText(cal.this, "sub...", Toast.LENGTH_SHORT).show();
                }
            }


        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fno=num1.getText().toString();
                String sno=num2.getText().toString();
                if(fno.equals("")){
                    num1.setError("Plz Enter num1");
                }
                else if(sno.equals("")){
                    num2.setError("Plz Enter num2");
                }
                else {
                    Integer A=Integer.parseInt(fno);
                    Integer B=Integer.parseInt(sno);
                    int Result = A*B;
                    result.setText(String.valueOf(Result));
                    Toast.makeText(cal.this, "mlp...", Toast.LENGTH_SHORT).show();
                }
            }

        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fno=num1.getText().toString();
                String sno=num2.getText().toString();
                if(fno.equals("")){
                    num1.setError("Plz Enter num1");
                }
                else if(sno.equals("")){
                    num2.setError("Plz Enter num2");
                }
                else {
                    Integer A=Integer.parseInt(fno);
                    Integer B=Integer.parseInt(sno);
                    int Result = A/B;
                    result.setText(String.valueOf(Result));
                    Toast.makeText(cal.this, "div...", Toast.LENGTH_SHORT).show();
                }
            }

        });






    }
}