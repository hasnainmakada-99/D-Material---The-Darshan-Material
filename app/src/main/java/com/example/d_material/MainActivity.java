package com.example.d_material;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
//import render.animations.*;
import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN_TIME_OUT=1000;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageView=findViewById(R.id.imageView);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
//        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" + ""+"</font>"));
        YoYo.with(Techniques.ZoomIn)
                .duration(1000)
                .repeat(0)
                .playOn(findViewById(R.id.imageView));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this, Select_Branch_Sem_Language.class);
                startActivity(i);
                finish();

            }
        }, SPLASH_SCREEN_TIME_OUT);
    }

}

