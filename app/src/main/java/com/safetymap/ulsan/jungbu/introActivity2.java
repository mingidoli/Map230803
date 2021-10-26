package com.safetymap.ulsan.jungbu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class introActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro2);

        Handler x = new Handler();
        x.postDelayed(new SplashHandler(), 3500);
    }

    public class SplashHandler implements Runnable {
        public void run() {
            Intent intent = new Intent(getApplicationContext(),
                    introActivity.class);
            startActivity(intent);
            finish();
        }
    }
}