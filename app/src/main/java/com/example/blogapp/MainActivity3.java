package com.example.blogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    private Button lf,lg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lf = findViewById(R.id.button5);
        lf.setOnClickListener(this);
        lg = findViewById(R.id.button6);
        lg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button5
        ) {

            Intent intent1 = new Intent(MainActivity3.this,MainActivity2.class);
            startActivity(intent1);
        }
        if(v.getId()==R.id.button6
        ) {

            Intent intent1 = new Intent(MainActivity3.this,MainActivity.class);
            startActivity(intent1);
        }
    }
}