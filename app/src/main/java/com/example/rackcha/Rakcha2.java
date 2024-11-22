package com.example.rackcha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rakcha2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rakcha2);
        Button bt1 =(Button)findViewById(R.id.b1);
        bt1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent bav = new Intent(Rakcha2.this,avl.class);
                startActivity(bav);

            }

        });



        Button bt2 =(Button) findViewById(R.id.b2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bmr=new Intent(Rakcha2.this,mrl.class);
                startActivity(bmr);
            }
        });
        Button bt3=(Button) findViewById(R.id.b3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btl= new Intent(Rakcha2.this,tl.class);
                startActivity(btl);
            }
        });
        Button bt4=(Button) findViewById(R.id.b4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent blg= new Intent(Rakcha2.this,lg.class);
                startActivity(blg);
            }
        });
    }

}