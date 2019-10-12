package com.example.speccomputer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ComputerActivity extends AppCompatActivity {

    private EditText ramInput ;
    private EditText procInput ;
    private EditText vgaInput ;
    private EditText moboInput ;
    private EditText psuInput ;
    private EditText casingInput ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        ramInput = findViewById(R.id.input_ram) ;
        procInput = findViewById(R.id.input_proc) ;
        vgaInput = findViewById(R.id.input_vga) ;
        moboInput = findViewById(R.id.input_mobo) ;
        psuInput = findViewById(R.id.input_psu) ;
        casingInput = findViewById(R.id.input_casing) ;
    }
}
