package com.example.lenovo.javanotes;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    Timer timer=new Timer();
    timer.schedule(new TimerTask() {
        @Override
        public void run() {
            Intent intent=new Intent(SplashScreen.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    },3000);
    }
}
