package com.example.d_material;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;

public class activity_Civil_Engineering extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_engineering);
        setTitle(Html.fromHtml("<font color=\"#173884\">"+"Civil Engineering"));
    }
}