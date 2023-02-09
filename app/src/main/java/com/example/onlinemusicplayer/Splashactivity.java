package com.example.onlinemusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Objects;

public class Splashactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);
        Objects.requireNonNull(getSupportActionBar()).hide();//For Hiding The Action bar ..,
        Thread td=new Thread(){
            public void run(){
                try {
                    sleep(7000);//to set splashscreen delay in mill seconds (i.e)7000=7 sec..,
                }catch (Exception ex){
                    ex.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(Splashactivity.this,MainActivity.class);//To navigate to the next activity after 7sec
                    startActivity(intent);
                    finish();
                }
            }
        };td.start();
    }
}