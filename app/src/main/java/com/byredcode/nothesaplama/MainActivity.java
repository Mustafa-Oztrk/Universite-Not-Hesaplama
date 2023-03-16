package com.byredcode.nothesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText vizeNot, finalNot;
    TextView notSonuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vizeNot = findViewById(R.id.vizeEdit);
        finalNot = findViewById(R.id.finalEdit);
        notSonuc = findViewById(R.id.sonucText);
    }

    public void buttonHesaplama(View view){
        double vize =Integer.parseInt(vizeNot.getText().toString());
        double fianl= Integer.parseInt(finalNot.getText().toString());

        double sonuc = (vize * 0.4) + (fianl * 0.6);

        notSonuc.setText("Sonuç :"+ String.format( "%.2f", sonuc ));
        }
}