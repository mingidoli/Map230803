package com.safetymap.ulsan.jungbu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import java.security.AccessController;

public class introActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    public void sendMessageMap(View view) {
        Intent intent = new Intent(getApplicationContext(),
                MapsActivity.class);
        startActivity(intent);
    }

    public void sendMesaageList(View view) {
    }

    public void onClick2(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0522414346"));
        startActivity(intent);
    }

    public void onClick11(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://junggu.ulsan.safems.co.kr"));
        startActivity(intent);
    }

    public void onClick12(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://patrol.police.go.kr/usr/main.do"));
        startActivity(intent);
    }
}



