package com.example.speccomputer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileSpecActivity extends AppCompatActivity {

    private TextView ramText;
    private TextView procText;
    private TextView vgaText;
    private TextView moboText;
    private TextView psuText;
    private TextView casingText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_spec);
        ramText = findViewById(R.id.text_ram);
        procText = findViewById(R.id.text_proc);
        vgaText = findViewById(R.id.text_vga);
        moboText = findViewById(R.id.text_mobo);
        psuText = findViewById(R.id.text_psu);
        casingText = findViewById(R.id.text_casing);

        Bundle extras = getIntent().getExtras();
        String ram = extras.getString(SpecActivity.RAM_KEY);
        String processor = extras.getString(SpecActivity.PROC_KEY);
        String vga = extras.getString(SpecActivity.VGA_KEY);
        String motherboard = extras.getString(SpecActivity.MOBO_KEY);
        String psu = extras.getString(SpecActivity.PSU_KEY);
        String casing = extras.getString(SpecActivity.CASING_KEY);
        if (extras != null) {
            ramText.setText(ram);
            procText.setText(processor);
            vgaText.setText(vga);
            moboText.setText(motherboard);
            psuText.setText(psu);
            casingText.setText(casing);

        }
    }
}
