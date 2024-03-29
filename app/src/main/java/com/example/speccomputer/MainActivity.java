package com.example.speccomputer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleComputer (View view) {
        Intent intent = new Intent(this, ProfileComputerActivity.class) ;
        startActivity(intent) ;
    }

    public void handleExit(View view) { finish();}

    public void handleSpecIntent (View view) {
        Intent intent = new Intent (this, SpecActivity.class) ;
        startActivity(intent);
    }
}
