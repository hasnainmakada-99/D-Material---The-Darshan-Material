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
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH1, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY1);
                    Get_Branch_Names(result);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
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
                branch_name.add(j.getString("branch"));
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
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH1, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY1);
                    Get_Semester_Names(result);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
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
                semester_name.add(j.getString("semester"));
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
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH1, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY1);
                    fetch_languages(result);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
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
                language.add(j.getString("language"));
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
        if(Branch_Name.equals("Select Branch") || Semester_Name.equals("Select Semester"))
        {
            Toast.makeText(getApplicationContext(), "Please Select Branch & Semester", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(getApplicationContext(), Subjects_Activity.class);
            Bundle bundle = new Bundle();
            bundle.putString("Branch", spinner1.getSelectedItem().toString());
            bundle.putString("Semester", spinner2.getSelectedItem().toString());
            bundle.putString("language", spinner3.getSelectedItem().toString());
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}