package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnPenjumlahan = findViewById(R.id.btn_penjumlahan);
        btnPenjumlahan.setOnClickListener(this);

        Button btnPengurangan = findViewById(R.id.btn_pengurangan);
        btnPengurangan.setOnClickListener(this);

        Button btnIdentitas = findViewById(R.id.btn_identitas);
        btnIdentitas.setOnClickListener(this);

        Button btnDialNumber = findViewById(R.id.btn_dial_number);
        btnDialNumber.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())  {
            case R.id.btn_penjumlahan:
                Intent moveIntent = new Intent(MainActivity.this, Penjumlahan.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_pengurangan:
                Intent pengurangan = new Intent(MainActivity.this, Pengurangan.class);
                startActivity(pengurangan);
                break;

            case R.id.btn_dial_number:
                String phoneNumber ="089504217354";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;

            case R.id.btn_identitas:
                Intent identitas = new Intent(MainActivity.this, Identitas.class);
                startActivity(identitas);
                break;


        }
    }
}