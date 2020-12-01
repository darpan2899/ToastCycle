package com.example.toastcycle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Chronometer chronometer;
    int i=0,duration=10,secondDuration=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer=(Chronometer)findViewById(R.id.chronometer);

        chronometer.start();
        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onChronometerTick(Chronometer chronometer) {

                i++;
                if (i >= duration) {
                    Toast toast1 = Toast.makeText(MainActivity.this, "Message " + (i / 10), Toast.LENGTH_SHORT);
                    duration = duration + 10;
                    View view = toast1.getView();
                    view.setPadding(10,10,10,10);
                    view.setBackgroundColor(Color.parseColor("#0D82DF"));
                    toast1.show();
                }
                else
                {
                    if(i> secondDuration)
                    {
                        Toast toast2 = Toast.makeText(MainActivity.this, "Alt Message " + (i / 10), Toast.LENGTH_SHORT);
                        secondDuration = secondDuration + 3;
                        View view = toast2.getView();
                        view.setPadding(10,10,10,10);
                        view.setBackgroundColor(Color.parseColor("#F44336"));
                        toast2.show();
                    }
                }
            }
        });

    }
}
