package com.example.rackcha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.nio.Buffer;

public class Rackcha1 extends AppCompatActivity {
    public static final String NAME ="name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rackcha1);
        Intent it = getIntent();


        Button next=(Button) findViewById(R.id.b);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b=new Intent(Rackcha1.this,Rakcha2.class);
                startActivity(b);
            }
        });
    }
}