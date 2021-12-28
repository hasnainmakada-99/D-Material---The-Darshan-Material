package com.example.d_material;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;

public class electrical_engineering extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical_engineering);
        setTitle(Html.fromHtml("<font color=\"#173884\">"+"Electrical Engineering"));
    }
}