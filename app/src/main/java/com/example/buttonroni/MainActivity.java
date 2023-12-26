package com.example.buttonroni;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        btn.setBackgroundColor(Color.MAGENTA);
        btn.setTextColor(Color.DKGRAY);
        btn.setPadding(50,50,50,50);
    }

    public void change(View view) {
        btn.setBackgroundColor(Color.GREEN);
        btn.setText("clicked");
    }
}