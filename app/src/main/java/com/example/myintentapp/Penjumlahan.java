package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Penjumlahan extends AppCompatActivity implements View.OnClickListener {
    private EditText edtAngka1;
    private EditText edtAngka2;
    private Button btnCalculate;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjumlahan);
        edtAngka1 = findViewById(R.id.edt_angka1);
        edtAngka2 = findViewById(R.id.edt_angka2);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);

        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)  {
        if (v.getId() == R.id.btn_calculate)  {
            String inputAngka1 = edtAngka1.getText().toString().trim();
            String inputAngka2 = edtAngka2.getText().toString().trim();

            boolean isEmptyFields = false;
            boolean isInvalidDouble= false;

            if (TextUtils.isEmpty(inputAngka1)){
                isEmptyFields= true;
                edtAngka1.setError("Ora oleh ora ono isine");
            }

            if (TextUtils.isEmpty(inputAngka2)) {
                isEmptyFields = true;
                edtAngka1.setError("Ora oleh ora ono isine");
            }

            if (!isEmptyFields) {
                double penjumlahan =Double.valueOf(inputAngka1) +
                        Double.valueOf(inputAngka2);
                tvResult.setText(String.valueOf(penjumlahan));
            }
        }
    }
}