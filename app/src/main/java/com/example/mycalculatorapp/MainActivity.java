package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View v){
        EditText num1=findViewById(R.id.firstnumber);
        int f1= Integer.parseInt(num1.getText().toString());
        EditText num2=findViewById(R.id.secondnumber);
        int f2=Integer.parseInt(num2.getText().toString());
        TextView out=findViewById(R.id.answer);
        out.setText("Addition is" +(f1+f2));
    }

    public void sub(View v){
        EditText num1=findViewById(R.id.firstnumber);
        int f1= Integer.parseInt(num1.getText().toString());
        EditText num2=findViewById(R.id.secondnumber);
        int f2=Integer.parseInt(num2.getText().toString());
        TextView out=findViewById(R.id.answer);
        out.setText("Subtraction is" +(f1-f2));
    }

    public void mul(View v){
        EditText num1=findViewById(R.id.firstnumber);
        int f1= Integer.parseInt(num1.getText().toString());
        EditText num2=findViewById(R.id.secondnumber);
        int f2=Integer.parseInt(num2.getText().toString());
        TextView out=findViewById(R.id.answer);
        out.setText("Multiplication is" +(f1*f2));
    }

    public void div(View v){
        EditText num1=findViewById(R.id.firstnumber);
        int f1= Integer.parseInt(num1.getText().toString());
        EditText num2=findViewById(R.id.secondnumber);
        int f2=Integer.parseInt(num2.getText().toString());
        TextView out=findViewById(R.id.answer);
        out.setText("division is" +(f1/f2));
    }
}