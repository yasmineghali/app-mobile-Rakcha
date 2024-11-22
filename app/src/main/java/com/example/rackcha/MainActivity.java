package com.example.rackcha;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent it = new Intent(MainActivity.this,Rackcha1.class);
        Button btn =(Button) findViewById(R.id.loginbutton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText n=(EditText)findViewById(R.id.username);
                String us= n.getText().toString().trim();
                it.putExtras(Rackcha1.NAME,us);
                startActivity(it);
            }
        });
    }
}