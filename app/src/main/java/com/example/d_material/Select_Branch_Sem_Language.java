package com.example.d_material;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Objects;

public class Select_Branch_Sem_Language extends AppCompatActivity {
    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    Button save;
    JSONArray result;
    ArrayList<String> branch_name;
    ArrayList<String> semester_name;
    ArrayList<String> language;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_branch_sem_language);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" + getString(R.string.app_name)+"</font>"));
        spinner1=findViewById(R.id.Select_Branch);
        spinner2=findViewById(R.id.Select_Sem);
        spinner3=findViewById(R.id.Select_Language);
        save=findViewById(R.id.Save_Button);
        branch_name=new ArrayList<String>();
        semester_name=new ArrayList<String>();
        language=new ArrayList<String>();
        Get_Branch();
        Get_Semester();
        getlanguage();
    }

    // For Fetching Branch
    public void Get_Branch(){
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY);
                    Get_Branch_Names(result);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    // For Fetching Branch_Names
    public void Get_Branch_Names(JSONArray jo){
        for (int i = 0; i <jo.length() ; i++) {
            try {
                JSONObject j = jo.getJSONObject(i);
                branch_name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME));
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getApplicationContext() ,android.R.layout.simple_list_item_1, branch_name);
        spinner1.setAdapter(arrayAdapter);
    }

    // For Fetching Semester
    public void Get_Semester(){
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH2, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY2);
                    Get_Semester_Names(result);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    // For Fetching Semester
    public void Get_Semester_Names(JSONArray jo){
        for (int i = 0; i <jo.length() ; i++) {
            try {
                JSONObject j = jo.getJSONObject(i);
                semester_name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME2));
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getApplicationContext() ,android.R.layout.simple_list_item_1, semester_name);
        spinner2.setAdapter(arrayAdapter);
    }

    // For fetching language
    public void getlanguage(){
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH7, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY7);
                    fetch_languages(result);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    // for fetching languages

    public void fetch_languages(JSONArray jo){
        for (int i = 0; i <jo.length() ; i++) {
            try {
                JSONObject j = jo.getJSONObject(i);
                language.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME7));
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getApplicationContext() ,android.R.layout.simple_list_item_1, language);
        spinner3.setAdapter(arrayAdapter);
    }

    // For Submit Button
    public void save_button(View view){
        String Branch_Name=spinner1.getSelectedItem().toString();
        String Semester_Name=spinner2.getSelectedItem().toString();
        String language= spinner3.getSelectedItem().toString();

        if(Branch_Name.equals("Computer Engineering")) {
            if (Semester_Name.equals("Semester 1")) {
                if (language.equals("English")) {
//                    Intent intent = new Intent(getApplicationContext(), computer_sem_1_english.class);
//                    startActivity(intent);
                } else if (language.equals("Gujarati")) {
//                    Intent intent = new Intent(getApplicationContext(), computer_sem_1_Gujarati.class);
//                    startActivity(intent);
                }
            }
            if (Semester_Name.equals("Semester 3")) {
                if (language.equals("English")) {
                    Intent intent = new Intent(getApplicationContext(), Computer_Sem_3_English.class);
                    startActivity(intent);
                } else if (language.equals("Gujarati")) {
                    Intent intent = new Intent(getApplicationContext(), Computer_Sem_3_Gujarati.class);
                    startActivity(intent);
                }
            }
        }
            else if(Branch_Name.equals("Select Branch") || Semester_Name.equals("Select Semester")){
                Toast.makeText(getApplicationContext(), "Please Select Branch & Semester", Toast.LENGTH_SHORT).show();
            }

            else if(Branch_Name.equals("Select Branch") || Semester_Name.equals("Select Semester")){
            Toast.makeText(getApplicationContext(), "Please Select Branch & Semester", Toast.LENGTH_SHORT).show();
        }
    }
}