package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class welcomeactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomeactivity);

        Thread thread = new Thread(){

            public void run(){
                try {
                    sleep(2000);

                }catch (Exception e){

                    e.printStackTrace();

                }finally {
                    Intent i = new Intent(welcomeactivity.this,MainActivity.class);
                    startActivity(i);
                    finish();

                }

            }
        };thread.start();
    }
}