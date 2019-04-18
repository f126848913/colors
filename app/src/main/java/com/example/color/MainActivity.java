package com.example.color;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txvR,txvG,txvB,txv;
    String text="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txvR=findViewById(R.id.tvr);
        txvG=findViewById(R.id.tvg);
        txvB=findViewById(R.id.tvb);
    }
    public void changeColor(View v){
        Random x=new Random();
        int red=x.nextInt(256);
        txvR.setText("RED："+red);

    }
}
