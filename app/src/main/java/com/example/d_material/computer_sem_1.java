package com.example.d_material;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;

public class computer_sem_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem1);
        setTitle(Html.fromHtml("<font color=\"#173884\">"+"Computer Engineering Sem 1"));
    }
}