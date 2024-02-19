package com.RahuriMarket.rahurimarket;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent i =new Intent(SplashScreen.this,MainActivity.class);
               startActivity(i);
            }
        },5000);
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
