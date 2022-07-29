package com.example.blogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private Button ld,le;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ld= findViewById(R.id.button3);
        le= findViewById(R.id.button4);
        ld.setOnClickListener(this);
        le.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button3
        ) {

            Intent intent1 = new Intent(MainActivity2.this,MainActivity.class);
            startActivity(intent1);
        }
        if(v.getId()==R.id.button4
        ) {

            Intent intent1 = new Intent(MainActivity2.this,MainActivity3.class);
            startActivity(intent1);
        }
    }
}