package com.example.speccomputer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SpecActivity extends AppCompatActivity {

    private EditText ramInput ;
    private EditText procInput ;
    private EditText vgaInput ;
    private EditText moboInput ;
    private EditText psuInput ;
    private EditText casingInput ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spec);
        ramInput = findViewById(R.id.input_ram) ;
        procInput = findViewById(R.id.input_proc) ;
        vgaInput = findViewById(R.id.input_vga) ;
        moboInput = findViewById(R.id.input_mobo) ;
        psuInput = findViewById(R.id.input_psu) ;
        casingInput = findViewById(R.id.input_casing) ;
    }

    public static final String RAM_KEY = "ram" ;
    public static final String PROC_KEY = "processor" ;
    public static final String VGA_KEY = "vga" ;
    public static final String MOBO_KEY = "motherboard" ;
    public static final String PSU_KEY = "psu" ;
    public static final String CASING_KEY = "casing" ;

    public void handleSubmit (View view) {
        String ram = ramInput.getText().toString() ;
        String processor = procInput.getText().toString() ;
        String vga = vgaInput.getText().toString() ;
        String motherboard= moboInput.getText().toString() ;
        String psu = psuInput.getText().toString() ;
        String casing = casingInput.getText().toString() ;

        Intent intent = new Intent (this, ProfileSpecActivity.class) ;
        intent.putExtra(RAM_KEY,ram) ;
        intent.putExtra(PROC_KEY,processor) ;
        intent.putExtra(VGA_KEY,vga) ;
        intent.putExtra(MOBO_KEY,motherboard) ;
        intent.putExtra(PSU_KEY,psu) ;
        intent.putExtra(CASING_KEY,casing) ;
    }

}
