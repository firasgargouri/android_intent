package com.nsc.params;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RenvoiMessageActivity extends AppCompatActivity {
    EditText txtMessage;
    Button btnRenvoiMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renvoi_message);

        txtMessage=(EditText) findViewById(R.id.txtMessage);
        btnRenvoiMessage=(Button) findViewById(R.id.btnRenvoiMessage);
    }
}