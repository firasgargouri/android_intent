package com.nsc.params;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class PassageParamsActivity extends AppCompatActivity {
    EditText txtParam1Recu;
    EditText txtParam2Recu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passage_params);

        txtParam1Recu=(EditText) findViewById(R.id.txtParam1Recu);
        txtParam2Recu=(EditText) findViewById(R.id.txtParam2Recu);
    }
}