package com.example.konversisuhuazfa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText vTxtCelcius,vTxtKelvin,vTxtFarenheit,vTxtReamur;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vTxtCelcius = (EditText) findViewById(R.id.txtCelcius);
        vTxtFarenheit = (EditText) findViewById(R.id.txtFarenheit);
        vTxtKelvin = (EditText) findViewById(R.id.txtKelvin);
        vTxtReamur = (EditText) findViewById(R.id.txtReamur);

        Button vBtnKonversi = (Button) findViewById(R.id.btnKonversi);
        vBtnKonversi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       String Celcius = vTxtCelcius.getText().toString().trim();

       double c = Double.parseDouble(Celcius);

       double kelvin = c + 273;
       double farenheit = 1.8 * c + 32;
       double reamur = 0.8 * c;

       vTxtKelvin.setText(kelvin+"");
       vTxtFarenheit.setText(farenheit+"");
       vTxtReamur.setText(reamur+"");

    }
}
