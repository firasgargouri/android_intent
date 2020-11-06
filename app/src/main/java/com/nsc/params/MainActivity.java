package com.nsc.params;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnApropos;
    Button btnPassParam;
    Button btnRecMessage;
    EditText txtParam1Envoi;
    EditText txtParam2Envoi;
    EditText txtMessageRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnApropos=(Button) findViewById(R.id.btnApropos);
        btnPassParam=(Button) findViewById(R.id.btnPassParam);
        btnRecMessage=(Button) findViewById(R.id.btnRecMessage);
        txtMessageRes=(EditText) findViewById(R.id.txtMessageRes);
        txtParam1Envoi=(EditText) findViewById(R.id.txtParam1Envoi);
        txtParam2Envoi=(EditText) findViewById(R.id.txtParam2Envoi);

        txtParam1Envoi.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                
            }
        });

        btnApropos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),AproposActivity.class);
                startActivity(i);
            }
        });
        btnApropos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pp= new Intent(getApplicationContext(),PassageParamsActivity.class);
                pp.putExtra('param1')
                startActivity(pp);
            }
        });
    }
}