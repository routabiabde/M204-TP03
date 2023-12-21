package com.example.m204_tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button buttonStart = findViewById(R.id.startMusic);
        Button buttonCancel = findViewById(R.id.stopMusic);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
              Intent myIntent = new Intent(MainActivity2.this,MusicService.class);
              startService(myIntent);
            }

        });
        buttonCancel.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent myIntent = new Intent(MainActivity2.this,MusicService.class);
                stopService(myIntent);
            }
        });

    }
}