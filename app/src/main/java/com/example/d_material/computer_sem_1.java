package com.example.d_material;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;

public class computer_sem_1 extends AppCompatActivity {
Button english;
Button Gujarati;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem1);
        setTitle(Html.fromHtml("<font color=\"#173884\">"+"Computer Engineering Sem 1"));
        english=findViewById(R.id.English);
    }
    public void English(View view){
        Intent intent=new Intent(this, computer_sem_1_english.class);
        startActivity(intent);
    }
}