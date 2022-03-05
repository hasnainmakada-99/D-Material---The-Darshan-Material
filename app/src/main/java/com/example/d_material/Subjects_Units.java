package com.example.d_material;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Objects;

public class Subjects_Units extends AppCompatActivity {
    RecyclerView recyclerView;
    JSONArray result;
    ArrayList<String> Unit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects_units);
        recyclerView=findViewById(R.id.recycle_view);
        Unit=new ArrayList<String>();
        Get_Unit_Name();
    }

    public void Get_Unit_Name(){
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(bundle.getString("Branch").equals("Computer Engineering")) {
            if (bundle.getString("Semester").equals("Semester 3")) {
                if (bundle.getString("language").equals("English")) {
                    if (bundle.getString("Subject").equals("3330701 - OPERATING SYSTEM")) {
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" + "Operating System" + "</font>"));
                        StringRequest stringRequest = new StringRequest(Fetch_Database_D_Material.URL_PATH8, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try {
                                    JSONObject jsonObject = new JSONObject(response);
                                    result = jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY8);
                                    Fetch_Unit_Name(result);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }, new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                error.printStackTrace();
                            }
                        });
                        RequestQueue requestQueue = Volley.newRequestQueue(this);
                        requestQueue.add(stringRequest);
                    } else if (bundle.getString("Subject").equals("3330702 - PROGRAMMING IN C++")) {
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" + "Programming in C++" + "</font>"));
                        StringRequest stringRequest = new StringRequest(Fetch_Database_D_Material.URL_PATH10, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try {
                                    JSONObject jsonObject = new JSONObject(response);
                                    result = jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY10);
                                    Fetch_Unit_Name(result);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }, new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                error.printStackTrace();
                            }
                        });
                        RequestQueue requestQueue = Volley.newRequestQueue(this);
                        requestQueue.add(stringRequest);
                    } else if (bundle.getString("Subject").contains("3330703 - DATABASE MANAGEMENT SYSTEM")) {
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" + "Database Management System" + "</font>"));
                        StringRequest stringRequest = new StringRequest(Fetch_Database_D_Material.URL_PATH11, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try {
                                    JSONObject jsonObject = new JSONObject(response);
                                    result = jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY11);
                                    Fetch_Unit_Name(result);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }, new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {

                            }
                        });
                        RequestQueue requestQueue = Volley.newRequestQueue(this);
                        requestQueue.add(stringRequest);
                    } else if (bundle.getString("Subject").contains("3330704 - DATA STRUCTURE")) {
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" + "Data Structures" + "</font>"));
                        StringRequest stringRequest = new StringRequest(Fetch_Database_D_Material.URL_PATH12, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try {
                                    JSONObject jsonObject = new JSONObject(response);
                                    result = jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY12);
                                    Fetch_Unit_Name(result);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }, new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                error.printStackTrace();
                            }
                        });
                        RequestQueue requestQueue = Volley.newRequestQueue(this);
                        requestQueue.add(stringRequest);
                    } else if (bundle.getString("Subject").contains("3330705 - MICROPROCESSOR & ASSEMBLY LANGUAGE PROGRAMMING")) {
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" + "Microprocessor & Assembly Language Programming" + "</font>"));
                        StringRequest stringRequest = new StringRequest(Fetch_Database_D_Material.URL_PATH13, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try {
                                    JSONObject jsonObject = new JSONObject(response);
                                    result = jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY13);
                                    Fetch_Unit_Name(result);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }, new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                error.printStackTrace();
                            }
                        });
                        RequestQueue requestQueue = Volley.newRequestQueue(this);
                        requestQueue.add(stringRequest);
                    }
                }

                else if(bundle.getString("language").equals("Gujarati")){
                    if (bundle.getString("Subject").equals("3330701 - OPERATING SYSTEM")) {
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Operating System"+"</font>"));
                        StringRequest stringRequest = new StringRequest(Fetch_Database_D_Material.URL_PATH9, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try {
                                    JSONObject jsonObject = new JSONObject(response);
                                    result = jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY9);
                                    Fetch_Unit_Name(result);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }, new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                error.printStackTrace();
                            }
                        });
                        RequestQueue requestQueue = Volley.newRequestQueue(this);
                        requestQueue.add(stringRequest);
                    }

                    else if(bundle.getString("Subject").equals("3330702 - PROGRAMMING IN C++")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Programming in C++"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH14, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY14);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3330703 - DATABASE MANAGEMENT SYSTEM")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Database Management System"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH15, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY15);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3330704 - DATA STRUCTURE")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Data Structures"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH16, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY16);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3330705 - MICROPROCESSOR & ASSEMBLY LANGUAGE PROGRAMMING")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Microprocessor & Assembly Language Programming"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH17, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY17);
                                    Fetch_Unit_Name(result);
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
                }
            }

            else if(bundle.getString("Semester").equals("Semester 4")){
                if(bundle.getString("language").equals("English")){
                    if(bundle.getString("Subject").contains("3340701 - ADVANCE DATABASE MANAGEMENT SYSTEM")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Advance Database Management System"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH19, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY19);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3340702 - COMPUTER NETWORKS")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Computer Networks"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH20, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY20);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3341603 - FUNDAMENTALS OF SOFTWARE DEVELOPMENT")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Fundamentals of Software Development"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH21, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY21);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3340704 - .NET PROGRAMMING")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +".Net Programming"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH27, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY27);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3340705 - COMPUTER ORGANIZATION AND ARCHITECTURE")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Computer Organization and Architecture"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH23, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY23);
                                    Fetch_Unit_Name(result);
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
                }

                else if(bundle.getString("language").equals("Gujarati")){
                    if(bundle.getString("Subject").contains("3340701 - ADVANCE DATABASE MANAGEMENT SYSTEM")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Advance Database Management System"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH24, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY24);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3340702 - COMPUTER NETWORKS")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Computer Networks"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH25, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY25);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3341603 - FUNDAMENTALS OF SOFTWARE DEVELOPMENT")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Fundamentals of Software Development"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH26, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY26);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3340704 - .NET PROGRAMMING")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +".Net Programming"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH22, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY22);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3340705 - COMPUTER ORGANIZATION AND ARCHITECTURE")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Computer Organization and Architecture"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH28, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY28);
                                    Fetch_Unit_Name(result);
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
                }
            }

            else if(bundle.getString("Semester").equals("Semester 5")){
                if(bundle.getString("language").equals("English")){
                    if(bundle.getString("Subject").contains("3350701 - COMPUTER MAINTENANCE AND TROUBLE SHOOTING")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Computer Maintenance and TroubleShooting"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH30, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY30);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3350702 - DYNAMIC WEB PAGE DEVELOPMENT")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Dynamic Webpage Development"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH32, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY32);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3350703 - JAVA PROGRAMMING")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Java Programming"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH34, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY34);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3350705 - MULTIMEDIA AND ANIMATION TECHNIQUES")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Multimedia Animation Techniques"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH36, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY36);
                                    Fetch_Unit_Name(result);
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
                }

                else if(bundle.getString("language").equals("Gujarati")){
                    if(bundle.getString("Subject").contains("3350701 - COMPUTER MAINTENANCE AND TROUBLE SHOOTING")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Computer Maintenance and TroubleShooting"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH31, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY31);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3350702 - DYNAMIC WEB PAGE DEVELOPMENT")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Dynamic Webpage Development"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH33, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY33);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3350703 - JAVA PROGRAMMING")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Java Programming"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH35, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY35);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3350705 - MULTIMEDIA AND ANIMATION TECHNIQUES")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Multimedia Animation Techniques"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH37, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY37);
                                    Fetch_Unit_Name(result);
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
                }
            }

            else if(bundle.getString("Semester").equals("Semester 6")){
                if(bundle.getString("language").equals("English")){
                    if(bundle.getString("Subject").contains("3360701 - ADVANCE JAVA PROGRAMMING")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Advance Java Programming"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH39, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY39);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3360705 - DYNAMIC WEBPAGE WITH SCRIPTING LANGUAGE")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Dynamic Webpage With Scripting Language"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH41, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY41);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3360706 - ADVANCE WEBPAGE TECHNOLOGY")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Advance Web Technology"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH43, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY43);
                                    Fetch_Unit_Name(result);
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
                }
                else if(bundle.getString("language").equals("Gujarati")){
                    if(bundle.getString("Subject").contains("3360701 - ADVANCE JAVA PROGRAMMING")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Advance Java Programming"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH40, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY40);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3360705 - DYNAMIC WEBPAGE WITH SCRIPTING LANGUAGE")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Dynamic Webpage With Scripting Language"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH42, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY42);
                                    Fetch_Unit_Name(result);
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

                    else if(bundle.getString("Subject").contains("3360706 - ADVANCE WEBPAGE TECHNOLOGY")){
                        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Advance Web Technology"+"</font>"));
                        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH44, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject jsonObject=new JSONObject(response);
                                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY44);
                                    Fetch_Unit_Name(result);
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
                }
            }
        }
    }

    // For Fetching Subjects_Name
    public void Fetch_Unit_Name(JSONArray jo) {
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(bundle.get("Branch").equals("Computer Engineering")) {
            if(bundle.getString("Semester").equals("Semester 3")) {
                if (bundle.getString("language").equals("English")) {
                    if (bundle.getString("Subject").equals("3330701 - OPERATING SYSTEM")) {
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME8));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2 = new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if (arrayList.get(position).equals("Unit 1 - Operating System Concepts")) {
                                    String Url = "https://drive.google.com/file/d/1UqS_TyWV-dJsVOMya4V0sfejV7vwIWtO/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 2 - Processor and Process Management")) {
                                    String Url = "https://drive.google.com/file/d/1F4kPMksVeEBXvTFWQAu_2gQmK4wpVzXX/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 3 - Memory Management")) {
                                    String Url = "https://drive.google.com/file/d/1sDYMg410yWAcWQsqjM5oYs1ZQo6ynT6K/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 4 - File and Disk Management")) {
                                    String Url = "https://drive.google.com/file/d/1Vxgu3tUqOMf7CDqV8XleCJYXIF1OEvJY/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 5 - Linux and Shell Programming")) {
                                    String Url = "https://drive.google.com/file/d/1VeUAotEcIErf5jTM8oXr3t-9C1Ad_DCF/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if (arrayList.get(position).equals("Unit 1 - Operating System Concepts")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1UqS_TyWV-dJsVOMya4V0sfejV7vwIWtO";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 2 - Processor and Process Management")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1F4kPMksVeEBXvTFWQAu_2gQmK4wpVzXX";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 3 - Memory Management")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1sDYMg410yWAcWQsqjM5oYs1ZQo6ynT6K";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 4 - File and Disk Management")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1Vxgu3tUqOMf7CDqV8XleCJYXIF1OEvJY";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 5 - Linux and Shell Programming")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1VeUAotEcIErf5jTM8oXr3t-9C1Ad_DCF";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }


                            }
                        });
                        recyclerView.setAdapter(cd2);
                    } else if (bundle.getString("Subject").equals("3330702 - PROGRAMMING IN C++")) {
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME10));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2 = new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if (arrayList.get(position).equals("Unit 1 - Principles of Object Oriented Programming")) {
                                    String Url = "https://drive.google.com/file/d/1UqS_TyWV-dJsVOMya4V0sfejV7vwIWtO/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 2 - Functions in C++ and Working with objects")) {
                                    String Url = "https://drive.google.com/file/d/1K4nbqn69PIK6deLq0FFaumPWQp3vnG3Q/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 3 - Constructor and Destructor")) {
                                    String Url = "https://drive.google.com/file/d/19DPJ-dzDFD17edLX7Xr2hJPe38YqfFSt/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 4 - Inheritance")) {
                                    String Url = "https://drive.google.com/file/d/1rNK_NNrcdI2jUCOkyQPrOyj1MMCZZuxX/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 5 - Pointers, Virtual functions and Polymorphism")) {
                                    String Url = "https://drive.google.com/file/d/1wdY5bhc7t2s7YbW7ltZ-Bebb7WqNrMWL/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 6 - Managing Console I/O Operations")) {
                                    String Url = "https://drive.google.com/file/d/1b_4ADUaN972dk6voe2FAxpUtqKr5ucOI/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if (arrayList.get(position).equals("Unit 1 - Principles of Object Oriented Programming")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1NMYKp659lmk12w5XBW9aF-1fPYiPXpGV";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 2 - Functions in C++ and Working with objects")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1K4nbqn69PIK6deLq0FFaumPWQp3vnG3Q";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 3 - Constructor and Destructor")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=19DPJ-dzDFD17edLX7Xr2hJPe38YqfFSt";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 4 - Inheritance")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1rNK_NNrcdI2jUCOkyQPrOyj1MMCZZuxX";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 5 - Pointers, Virtual functions and Polymorphism")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1wdY5bhc7t2s7YbW7ltZ-Bebb7WqNrMWL";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 6 - Managing Console I/O Operations")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1b_4ADUaN972dk6voe2FAxpUtqKr5ucOI";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }
                        });
                        recyclerView.setAdapter(cd2);
                    } else if (bundle.getString("Subject").contains("3330703 - DATABASE MANAGEMENT SYSTEM")) {
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME11));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2 = new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if (arrayList.get(position).equals("Unit 1 – Introduction to Database System")) {
                                    String Url = "https://drive.google.com/file/d/1XEzSn1n6buxkDjNa6jSFbzw1NzvjHUf2/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 2 – Database System Architecture")) {
                                    String Url = "https://drive.google.com/file/d/1LID8Wg2cMjx9lxZdRUdHhOP11T0bIuSt/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 3 – Introduction to Structured Query Language (SQL)")) {
                                    String Url = "https://drive.google.com/file/d/1Dss_Z7GqhcfqqigsnqkI2NONyGN85Mvz/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 4 – Relational Algebra and implementation using SQL")) {
                                    String Url = "https://drive.google.com/file/d/1g6TAVX0j1jI5K224sbJGUvV58Kfk5dFZ/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).contains("Unit 5 – Database Integrity Constraints")) {
                                    String Url = "https://drive.google.com/file/d/1aWbeBejUivkL-lbN-__Kvp-us3G6hbKi/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 6 – Entity Relational Model")) {
                                    String Url = "https://drive.google.com/file/d/1qmwRX5v0C-yxoKv0ewarcbXWUaqA9_aM/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if (arrayList.get(position).equals("Unit 1 – Introduction to Database System")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1XEzSn1n6buxkDjNa6jSFbzw1NzvjHUf2";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 2 – Database System Architecture")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1LID8Wg2cMjx9lxZdRUdHhOP11T0bIuSt";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 3 – Introduction to Structured Query Language (SQL)")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1Dss_Z7GqhcfqqigsnqkI2NONyGN85Mvz";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 4 – Relational Algebra and implementation using SQL")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1g6TAVX0j1jI5K224sbJGUvV58Kfk5dFZ";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).contains("Unit 5 – Database Integrity Constraints")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1aWbeBejUivkL-lbN-__Kvp-us3G6hbKi";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 6 – Entity Relational Model")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1qmwRX5v0C-yxoKv0ewarcbXWUaqA9_aM";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    } else if (bundle.getString("Subject").contains("3330704 - DATA STRUCTURE")) {
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME12));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2 = new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if (arrayList.get(position).equals("Unit 1 – Basic Concept of Data Structures")) {
                                    String Url = "https://drive.google.com/file/d/1Oe9GgstIBZe9S9UkCF5BMavMxtbERDq6/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 2 – Strings")) {
                                    String Url = "https://drive.google.com/file/d/1bjC56c4vq4UHQoIwMxWhY00rgOk5tq7L/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 3 – Stack and Queues")) {
                                    String Url = "https://drive.google.com/file/d/1CLY3HUKRcwJX8judToIiOfQxaBtuqOGp/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 4 – Linked List")) {
                                    String Url = "https://drive.google.com/file/d/1kbTH6XX4DppJUbNIXasdkEY730I8Wzan/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).contains("Unit 5 – Sorting and Hashing")) {
                                    String Url = "https://drive.google.com/file/d/1TTLAt7ZaEBL4630BkuBjGEyzmWEQRoCq/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).contains("Unit 6 – Trees")) {
                                    String Url = "https://drive.google.com/file/d/1druKOpoGh9twNsju0tGSiARxSlilzoOd/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if (arrayList.get(position).equals("Unit 1 – Basic Concept of Data Structures")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1Oe9GgstIBZe9S9UkCF5BMavMxtbERDq6";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 2 – Strings")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1bjC56c4vq4UHQoIwMxWhY00rgOk5tq7L";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 3 – Stack and Queues")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1CLY3HUKRcwJX8judToIiOfQxaBtuqOGp";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 4 – Linked List")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1kbTH6XX4DppJUbNIXasdkEY730I8Wzan";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).contains("Unit 5 – Sorting and Hashing")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1TTLAt7ZaEBL4630BkuBjGEyzmWEQRoCq";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).contains("Unit 6 – Trees")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1druKOpoGh9twNsju0tGSiARxSlilzoOd";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    } else if (bundle.getString("Subject").contains("3330705 - MICROPROCESSOR & ASSEMBLY LANGUAGE PROGRAMMING")) {
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME13));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2 = new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if (arrayList.get(position).equals("Unit 1 – Introduction of Microprocessor")) {
                                    String Url = "https://drive.google.com/file/d/1PeMqHDBXQRFa0l8j9yM6XUNmKBGEbQiP/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 3 – 8085 Instruction set")) {
                                    String Url = "https://drive.google.com/file/d/1P88NvD8a19W8m8LRkvJXBiMgS8vf5BZg/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).contains("Unit 5 – 8085 Interrupts")) {
                                    String Url = "https://drive.google.com/file/d/1oQBBStdYPibSjw-DQyuVz2dgFCF3I5_9/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).contains("Unit 6 – Introduction to Advanced Microprocessor")) {
                                    String Url = "https://drive.google.com/file/d/1BJqTIesMqJQ-zvmRz9IRuKS3QsMnhQvE/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if (arrayList.get(position).equals("Unit 1 – Introduction of Microprocessor")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1PeMqHDBXQRFa0l8j9yM6XUNmKBGEbQiP";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 3 – 8085 Instruction set")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1P88NvD8a19W8m8LRkvJXBiMgS8vf5BZg";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 5 – 8085 Interrupts")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1oQBBStdYPibSjw-DQyuVz2dgFCF3I5_9";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).contains("Unit 6 – Introduction to Advanced Microprocessor")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1BJqTIesMqJQ-zvmRz9IRuKS3QsMnhQvE";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }
                }

                else if(bundle.getString("language").equals("Gujarati")){
                    if (bundle.getString("Subject").equals("3330701 - OPERATING SYSTEM")) {
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME9));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).equals("Unit 1 - Operating System Concepts")){
                                    String Url="https://drive.google.com/file/d/1MePKX1y-i-3psbeVU9DI3lnkAwu6Ofv_/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 2 - Processor and Process Management")) {
                                    String Url = "https://drive.google.com/file/d/187h95ox2U5rnDbbtpia2ma3wK7sL7IyY/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 3 - Memory Management")){
                                    String Url="https://drive.google.com/file/d/1ut4N629HYsUIPy8sWa-GgVbY9Iypp1w5/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - File & Disk Management")){
                                    String Url="https://drive.google.com/file/d/1k5Oa_TPwZiAmbtjU68a9EAWLVXKTutOP/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 5 - Linux and Shell Programming")){
                                    String Url="https://drive.google.com/file/d/1VeUAotEcIErf5jTM8oXr3t-9C1Ad_DCF/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).equals("Unit 1 - Operating System Concepts")){
                                    String Url="https://drive.google.com/uc?export=download&id=1MePKX1y-i-3psbeVU9DI3lnkAwu6Ofv_";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 2 - Processor and Process Management")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=187h95ox2U5rnDbbtpia2ma3wK7sL7IyY";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 3 - Memory Management")){
                                    String Url="https://drive.google.com/uc?export=download&id=1ut4N629HYsUIPy8sWa-GgVbY9Iypp1w5";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - File & Disk Management")){
                                    String Url="https://drive.google.com/uc?export=download&id=1k5Oa_TPwZiAmbtjU68a9EAWLVXKTutOP";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 5 - Linux and Shell Programming")){
                                    String Url="https://drive.google.com/uc?export=download&id=1VeUAotEcIErf5jTM8oXr3t-9C1Ad_DCF";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }


                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }

                    else if(bundle.getString("Subject").equals("3330702 - PROGRAMMING IN C++")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME14));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).equals("Unit 1 - Principles of Object Oriented Programming")){
                                    String Url="https://drive.google.com/file/d/1tXCFcdnAUygUPGsZyJtQqMJiEl_T8vGH/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 2 - Functions in C++ and Working with objects")) {
                                    String Url = "https://drive.google.com/file/d/1uF54UIFRo2prhBXsrpCI91bU-mqkKHTW/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 3 - Constructor and Destructor")){
                                    String Url="https://drive.google.com/file/d/18OL5ePPC-YmsCH1ddFcPKyI3zdQ4d5KP/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Inheritance")){
                                    String Url="https://drive.google.com/file/d/1-GW7-LgaS_qeSLfJGmjDPCYtksV8Grkn/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 5 - Pointers, Virtual functions and Polymorphism")){
                                    String Url="https://drive.google.com/file/d/1QJXG6eoNY3AsOz7nyhjjpHBDzAKrttek/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 6 - Managing Console I/O Operations")){
                                    String Url="https://drive.google.com/file/d/1LdJQjKaiaudsK-BFhU61Cl7c74nAuBae/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).equals("Unit 1 - Principles of Object Oriented Programming")){
                                    String Url="https://drive.google.com/uc?export=download&id=1tXCFcdnAUygUPGsZyJtQqMJiEl_T8vGH";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 2 - Functions in C++ and Working with objects")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1uF54UIFRo2prhBXsrpCI91bU-mqkKHTW";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 3 - Constructor and Destructor")){
                                    String Url="https://drive.google.com/uc?export=download&id=18OL5ePPC-YmsCH1ddFcPKyI3zdQ4d5KP";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Inheritance")){
                                    String Url="https://drive.google.com/uc?export=download&id=1-GW7-LgaS_qeSLfJGmjDPCYtksV8Grkn";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 5 - Pointers, Virtual functions and Polymorphism")){
                                    String Url="https://drive.google.com/uc?export=download&id=1QJXG6eoNY3AsOz7nyhjjpHBDzAKrttek";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 6 - Managing Console I/O Operations")){
                                    String Url="https://drive.google.com/uc?export=download&id=1LdJQjKaiaudsK-BFhU61Cl7c74nAuBae";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }

                    else if(bundle.getString("Subject").contains("3330703 - DATABASE MANAGEMENT SYSTEM")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME15));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).equals("Unit 1 – Introduction to Database System")){
                                    String Url="https://drive.google.com/file/d/1NMyD6IOk66GP5R_uBIS7UTiSKBBJtsdr/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 2 – Database System Architecture")) {
                                    String Url = "https://drive.google.com/file/d/1uaIrY5xtphQFjC6csdHoTCvPUzNeufth/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 3 – Introduction to Structured Query Language (SQL)")){
                                    String Url="https://drive.google.com/file/d/1aIikSz3QU72fZ7OCwjXeRnNEYzdwwIOC/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 – Relational Algebra and implementation using SQL")){
                                    String Url="https://drive.google.com/file/d/1VUvmQ_-xN-2cqGZj973S24GdBEdF47UE/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 – Database Integrity Constraints")){
                                    String Url="https://drive.google.com/file/d/1d2nOFeFolctU_875RQ62avShDnXzC8xr/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 6 – Entity Relational Model")){
                                    String Url="https://drive.google.com/file/d/1bNHvHxTfMIxQND9liS5LoETT7t7rVi1m/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).equals("Unit 1 – Introduction to Database System")){
                                    String Url="https://drive.google.com/uc?export=download&id=1NMyD6IOk66GP5R_uBIS7UTiSKBBJtsdr";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 2 – Database System Architecture")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1uaIrY5xtphQFjC6csdHoTCvPUzNeufth";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 3 – Introduction to Structured Query Language (SQL)")){
                                    String Url="https://drive.google.com/uc?export=download&id=1aIikSz3QU72fZ7OCwjXeRnNEYzdwwIOC";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 – Relational Algebra and implementation using SQL")){
                                    String Url="https://drive.google.com/uc?export=download&id=1VUvmQ_-xN-2cqGZj973S24GdBEdF47UE";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 – Database Integrity Constraints")){
                                    String Url="https://drive.google.com/uc?export=download&id=1d2nOFeFolctU_875RQ62avShDnXzC8xr";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 6 – Entity Relational Model")){
                                    String Url="https://drive.google.com/uc?export=download&id=1bNHvHxTfMIxQND9liS5LoETT7t7rVi1m";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }

                    else if(bundle.getString("Subject").contains("3330704 - DATA STRUCTURE")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME16));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2 = new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if (arrayList.get(position).equals("Unit 1 – Basic Concept of Data Structures")) {
                                    String Url = "https://drive.google.com/file/d/1FakM0r5s9dmIVpAg1M2nJwALcLzOE4AW/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 2 – Strings")) {
                                    String Url = "https://drive.google.com/file/d/1kozZgZItb0sCra0v7k3OALpiD6IQu6yh/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 3 – Stack and Queues")) {
                                    String Url = "https://drive.google.com/file/d/10k219Zgsw5-mSgs_4sJ2eKU0Bb9xUcut/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 4 – Linked List")) {
                                    String Url = "https://drive.google.com/file/d/1OyuHRyynY26llQyvk_tPNDrYGNwC50he/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).contains("Unit 5 – Sorting and Hashing")) {
                                    String Url = "https://drive.google.com/file/d/1_Hn53f-fkW6PU35ytLZKjqY91eAx8wOj/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).contains("Unit 6 – Trees")) {
                                    String Url = "https://drive.google.com/file/d/1SLQYwF4yBaJVr8Fdd7dOPZKtD61lSZCp/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if (arrayList.get(position).equals("Unit 1 – Basic Concept of Data Structures")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1FakM0r5s9dmIVpAg1M2nJwALcLzOE4AW";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 2 – Strings")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1kozZgZItb0sCra0v7k3OALpiD6IQu6yh";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 3 – Stack and Queues")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=10k219Zgsw5-mSgs_4sJ2eKU0Bb9xUcut";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).equals("Unit 4 – Linked List")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1OyuHRyynY26llQyvk_tPNDrYGNwC50he";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).contains("Unit 5 – Sorting and Hashing")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1_Hn53f-fkW6PU35ytLZKjqY91eAx8wOj";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                } else if (arrayList.get(position).contains("Unit 6 – Trees")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1SLQYwF4yBaJVr8Fdd7dOPZKtD61lSZCp";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }

                    else if(bundle.getString("Subject").contains("3330705 - MICROPROCESSOR & ASSEMBLY LANGUAGE PROGRAMMING")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME17));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).equals("Unit 1 – Introduction of Microprocessor")){
                                    String Url="https://drive.google.com/file/d/1urv5vOc7LVpZTdMl085oT7N9BOwxpHiK/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 3 – 8085 Instruction set")){
                                    String Url="https://drive.google.com/file/d/157cAlGFzjkZI9skWz0_B4IFNc_RdnO1-/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 – 8085 Interrupts")){
                                    String Url="https://drive.google.com/file/d/1iz-aYQEZowpkr0srsLvzB-54mjZPz3F7/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 6 – Introduction to Advanced Microprocessor")){
                                    String Url="https://drive.google.com/file/d/1y-7XdUrC4EfcZ85o114D2AwpJ2_PSa8Z/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).equals("Unit 1 – Introduction of Microprocessor")){
                                    String Url="https://drive.google.com/uc?export=download&id=1urv5vOc7LVpZTdMl085oT7N9BOwxpHiK";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 3 – 8085 Instruction set")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=157cAlGFzjkZI9skWz0_B4IFNc_RdnO1-";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 5 – 8085 Interrupts")){
                                    String Url="https://drive.google.com/uc?export=download&id=1iz-aYQEZowpkr0srsLvzB-54mjZPz3F7";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 6 – Introduction to Advanced Microprocesso")){
                                    String Url="https://drive.google.com/uc?export=download&id=1y-7XdUrC4EfcZ85o114D2AwpJ2_PSa8Z";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }
                }
            }

            else if(bundle.getString("Semester").equals("Semester 4")){
                if(bundle.getString("language").equals("English")){
                    if(bundle.getString("Subject").contains("3340701 - ADVANCE DATABASE MANAGEMENT SYSTEM")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME19));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).equals("Unit 1 - Advanced SQL")){
                                    String Url="https://drive.google.com/file/d/1zSQTLgNvqe_RiciQs20ymYE0DKS70rK9/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 2 - PL/SQL and Triggers")) {
                                    String Url = "https://drive.google.com/file/d/1L-Jv8cMD930U9VPNEe6uIESsGuojz5SN/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 3 - Functional Dependency and Decomposition")){
                                    String Url="https://drive.google.com/file/d/1lq95WBVtbVABoeprEdl6QZ7tCx3c4waq/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Normalization")){
                                    String Url="https://drive.google.com/file/d/1S88B758n8zIS681w5RuGhgB11ZVAxBuH/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Transaction Processing")){
                                    String Url="https://drive.google.com/file/d/1130NodC0p-H1dKfyFJnbkOq0y08y5tTb/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).equals("Unit 1 - Advanced SQL")){
                                    String Url="https://drive.google.com/uc?export=download&id=1zSQTLgNvqe_RiciQs20ymYE0DKS70rK9";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 2 - PL/SQL and Triggers")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1L-Jv8cMD930U9VPNEe6uIESsGuojz5SN";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 3 - Functional Dependency and Decomposition")){
                                    String Url="https://drive.google.com/uc?export=download&id=1lq95WBVtbVABoeprEdl6QZ7tCx3c4waq";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Normalization")){
                                    String Url="https://drive.google.com/uc?export=download&id=1S88B758n8zIS681w5RuGhgB11ZVAxBuH";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Transaction Processing")){
                                    String Url="https://drive.google.com/uc?export=download&id=1130NodC0p-H1dKfyFJnbkOq0y08y5tTb";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }

                    else if(bundle.getString("Subject").contains("3340702 - COMPUTER NETWORKS")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME20));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).equals("Unit 1 - Basics Of Computer Network")){
                                    String Url="https://drive.google.com/file/d/1bKYgGH04-sAduEV_7pZocjDiNM7dhX-s/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - The Reference Model for Network Communication")) {
                                    String Url = "https://drive.google.com/file/d/1jJgaDfKqZqQFFGNlstscsV1S4GM5dpKR/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 3 - Transmission Media")){
                                    String Url="https://drive.google.com/file/d/1A2B9dvmzvciyY6bjtc7crGrMI0Ansh-E/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Network Devices")){
                                    String Url="https://drive.google.com/file/d/1FHiyDJbAfaO4higupqdJnSQF3OS6XDRb/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - IP Protocol and Network Applications")){
                                    String Url="https://drive.google.com/file/d/18xVmQqS4Y0nwfKAD8ohQfZwPIM6e-3lO/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).equals("Unit 1 - Basics Of Computer Network")){
                                    String Url="https://drive.google.com/uc?export=download&id=1bKYgGH04-sAduEV_7pZocjDiNM7dhX-s";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - The Reference Model for Network Communication")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1jJgaDfKqZqQFFGNlstscsV1S4GM5dpKR";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 3 - Transmission Media")){
                                    String Url="https://drive.google.com/uc?export=download&id=1A2B9dvmzvciyY6bjtc7crGrMI0Ansh-E";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Network Devices")){
                                    String Url="https://drive.google.com/uc?export=download&id=1FHiyDJbAfaO4higupqdJnSQF3OS6XDRb";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - IP Protocol and Network Applications")){
                                    String Url="https://drive.google.com/uc?export=download&id=18xVmQqS4Y0nwfKAD8ohQfZwPIM6e-3lO";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }

                    else if(bundle.getString("Subject").contains("3341603 - FUNDAMENTALS OF SOFTWARE DEVELOPMENT")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME21));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).equals("Unit 1 - Software Development Process")){
                                    String Url="https://drive.google.com/file/d/1tjhqEr9YPvQSNapeELTWagZHH6BXVgaR/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 2 - Software Analysis and Design")) {
                                    String Url = "https://drive.google.com/file/d/1xuDGxLpsbY2En_zGpjOjZ8NSeeZA3LWM/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 3 - Software Project Management")){
                                    String Url="https://drive.google.com/file/d/1iBYgZVwrAR_Um__BdzHtwsh3jlPk_IZE/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Software Coding and Testing")){
                                    String Url="https://drive.google.com/file/d/155VQoOFoDsV1wgcnosmLJfhPDD2pTgk6/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).equals("Unit 1 - Software Development Process")){
                                    String Url="https://drive.google.com/uc?export=download&id=1tjhqEr9YPvQSNapeELTWagZHH6BXVgaR";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 2 - Software Analysis and Design")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1xuDGxLpsbY2En_zGpjOjZ8NSeeZA3LWM";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 3 - Software Project Management")){
                                    String Url="https://drive.google.com/uc?export=download&id=1iBYgZVwrAR_Um__BdzHtwsh3jlPk_IZE";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Software Coding and Testing")){
                                    String Url="https://drive.google.com/uc?export=download&id=155VQoOFoDsV1wgcnosmLJfhPDD2pTgk6";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }

                    else if(bundle.getString("Subject").contains("3340704 - .NET PROGRAMMING")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME27));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Introduction to Microsoft .NET framework")){
                                    String Url="https://drive.google.com/file/d/1LGJaS8QbqD0tm1OZN8cQ_ldqC5vUk3QB/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 2 - Introduction to Windows Common Controls")) {
                                    String Url = "https://drive.google.com/file/d/18z6wesIyi4kfQNpeA2nOvVm642JbuDuV/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 3 - Additional controls and Menus Of Windows")){
                                    String Url="https://drive.google.com/file/d/1YoQPh-qc_F-KoQKRzFPJ7L6lcC9fcuHs/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Advanced Features of VB.Net")){
                                    String Url="https://drive.google.com/file/d/1bHBdrAuYN7HGO5ypRU36zmCTb4zKEC51/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Inbuilt Functions and Database access using ADO.NET")){
                                    String Url="https://drive.google.com/file/d/1rEsvtMt52NQneNvgkdRZt-kLAMkEX2D9/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Introduction to Microsoft .NET framework")){
                                    String Url="https://drive.google.com/uc?export=download&id=1LGJaS8QbqD0tm1OZN8cQ_ldqC5vUk3QB";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 2 - Introduction to Windows Common Controls")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=18z6wesIyi4kfQNpeA2nOvVm642JbuDuV";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 3 - Additional controls and Menus Of Windows")){
                                    String Url="https://drive.google.com/uc?export=download&id=1YoQPh-qc_F-KoQKRzFPJ7L6lcC9fcuHs";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Advanced Features of VB.Net")){
                                    String Url="https://drive.google.com/uc?export=download&id=1bHBdrAuYN7HGO5ypRU36zmCTb4zKEC51";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Inbuilt Functions and Database access using ADO.NET")){
                                    String Url="https://drive.google.com/uc?export=download&id=1rEsvtMt52NQneNvgkdRZt-kLAMkEX2D9";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }

                    else if(bundle.getString("Subject").contains("3340705 - COMPUTER ORGANIZATION AND ARCHITECTURE")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME23));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).equals("Unit 1 – Introduction to Database System")){
                                    String Url="https://drive.google.com/file/d/1NMyD6IOk66GP5R_uBIS7UTiSKBBJtsdr/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 2 – Database System Architecture")) {
                                    String Url = "https://drive.google.com/file/d/1uaIrY5xtphQFjC6csdHoTCvPUzNeufth/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 3 – Introduction to Structured Query Language (SQL)")){
                                    String Url="https://drive.google.com/file/d/1aIikSz3QU72fZ7OCwjXeRnNEYzdwwIOC/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 – Relational Algebra and implementation using SQL")){
                                    String Url="https://drive.google.com/file/d/1VUvmQ_-xN-2cqGZj973S24GdBEdF47UE/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 – Database Integrity Constraints")){
                                    String Url="https://drive.google.com/file/d/1d2nOFeFolctU_875RQ62avShDnXzC8xr/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 6 – Entity Relational Model")){
                                    String Url="https://drive.google.com/file/d/1bNHvHxTfMIxQND9liS5LoETT7t7rVi1m/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).equals("Unit 1 – Introduction to Database System")){
                                    String Url="https://drive.google.com/uc?export=download&id=1NMyD6IOk66GP5R_uBIS7UTiSKBBJtsdr";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 2 – Database System Architecture")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1uaIrY5xtphQFjC6csdHoTCvPUzNeufth";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 3 – Introduction to Structured Query Language (SQL)")){
                                    String Url="https://drive.google.com/uc?export=download&id=1aIikSz3QU72fZ7OCwjXeRnNEYzdwwIOC";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 – Relational Algebra and implementation using SQL")){
                                    String Url="https://drive.google.com/uc?export=download&id=1VUvmQ_-xN-2cqGZj973S24GdBEdF47UE";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 – Database Integrity Constraints")){
                                    String Url="https://drive.google.com/uc?export=download&id=1d2nOFeFolctU_875RQ62avShDnXzC8xr";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).equals("Unit 6 – Entity Relational Model")){
                                    String Url="https://drive.google.com/uc?export=download&id=1bNHvHxTfMIxQND9liS5LoETT7t7rVi1m";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }
                }

                else if(bundle.getString("language").equals("Gujarati")){
                        if(bundle.getString("Subject").contains("3340701 - ADVANCE DATABASE MANAGEMENT SYSTEM")){
                            for (int i = 0; i < jo.length(); i++) {
                                try {
                                    JSONObject j = jo.getJSONObject(i);
                                    Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME24));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                            Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                                @Override
                                public void onitemclick(ArrayList<String> arrayList, int position) {

                                }

                                @Override
                                public void onbutton2click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).equals("Unit 1 - Advanced SQL")){
                                        String Url="https://drive.google.com/file/d/1jndmUiwpOG33Bn1Fl7RzUmxTCEn0sWYh/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).equals("Unit 2 - PL/SQL and Triggers")) {
                                        String Url = "https://drive.google.com/file/d/15XmwPlG93yLWOB0EoYz_eDHQtcdGfNCJ/view?usp=sharing";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 3 - Functional Dependency and Decomposition")){
                                        String Url="https://drive.google.com/file/d/1AKvEzA6hgmWldXa4JArYKLXs0X1JXNVA/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 4 - Normalization")){
                                        String Url="https://drive.google.com/file/d/1AlD5ZHfc1OKal1joplWZlM8Tr1keGjrP/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 5 - Transaction Processing")){
                                        String Url="https://drive.google.com/file/d/1nvDQoyYxhaRJjUAojsFCnpR7lCt_pVLP/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                }

                                @Override
                                public void onbutton3click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).equals("Unit 1 - Advanced SQL")){
                                        String Url="https://drive.google.com/uc?export=download&id=1jndmUiwpOG33Bn1Fl7RzUmxTCEn0sWYh";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).equals("Unit 2 - PL/SQL and Triggers")) {
                                        String Url = "https://drive.google.com/uc?export=download&id=15XmwPlG93yLWOB0EoYz_eDHQtcdGfNCJ";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 3 - Functional Dependency and Decomposition")){
                                        String Url="https://drive.google.com/uc?export=download&id=1AKvEzA6hgmWldXa4JArYKLXs0X1JXNVA";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 4 - Normalization")){
                                        String Url="https://drive.google.com/uc?export=download&id=1AlD5ZHfc1OKal1joplWZlM8Tr1keGjrP";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 5 - Transaction Processing")){
                                        String Url="https://drive.google.com/uc?export=download&id=1nvDQoyYxhaRJjUAojsFCnpR7lCt_pVLP";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                }
                            });
                            recyclerView.setAdapter(cd2);
                        }

                        else if(bundle.getString("Subject").contains("3340702 - COMPUTER NETWORKS")){
                            for (int i = 0; i < jo.length(); i++) {
                                try {
                                    JSONObject j = jo.getJSONObject(i);
                                    Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME25));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                            Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                                @Override
                                public void onitemclick(ArrayList<String> arrayList, int position) {

                                }

                                @Override
                                public void onbutton2click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).equals("Unit 1 - Basics Of Computer Network")){
                                        String Url="https://drive.google.com/file/d/1J9dxJr_KLk2GW0toSr-9C5PXkWaq_1JL/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 2 - The Reference Model for Network Communication")) {
                                        String Url = "https://drive.google.com/file/d/1nfCfU8nZbvm-USpY4ye4dEX3H2yMlj3x/view?usp=sharing";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 3 - Transmission Media")){
                                        String Url="https://drive.google.com/file/d/1sFc2ZFnDY9ynLqUMxD8GIbcG4i17blkp/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 4 - Network Devices")){
                                        String Url="https://drive.google.com/file/d/17o9uUphdUiPbcRREJKfGJUxzm6QHsqpz/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 5 - IP Protocol and Network Applications")){
                                        String Url="https://drive.google.com/file/d/1ECbyudvrQ77tNxKCEmf5TbeCMYFSWlcW/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                }

                                @Override
                                public void onbutton3click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).equals("Unit 1 - Basics Of Computer Network")){
                                        String Url="https://drive.google.com/uc?export=download&id=1J9dxJr_KLk2GW0toSr-9C5PXkWaq_1JL";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 2 - The Reference Model for Network Communication")) {
                                        String Url = "https://drive.google.com/uc?export=download&id=1nfCfU8nZbvm-USpY4ye4dEX3H2yMlj3x";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 3 - Transmission Media")){
                                        String Url="https://drive.google.com/uc?export=download&id=1sFc2ZFnDY9ynLqUMxD8GIbcG4i17blkp";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 4 - Network Devices")){
                                        String Url="https://drive.google.com/uc?export=download&id=17o9uUphdUiPbcRREJKfGJUxzm6QHsqpz";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 5 - IP Protocol and Network Applications")){
                                        String Url="https://drive.google.com/uc?export=download&id=1ECbyudvrQ77tNxKCEmf5TbeCMYFSWlcW";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                }
                            });
                            recyclerView.setAdapter(cd2);
                        }

                        else if(bundle.getString("Subject").contains("3341603 - FUNDAMENTALS OF SOFTWARE DEVELOPMENT")){
                            for (int i = 0; i < jo.length(); i++) {
                                try {
                                    JSONObject j = jo.getJSONObject(i);
                                    Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME26));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                            Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                                @Override
                                public void onitemclick(ArrayList<String> arrayList, int position) {

                                }

                                @Override
                                public void onbutton2click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).equals("Unit 1 - Software Development Process")){
                                        String Url="https://drive.google.com/file/d/1W-4nFiow0X2qPRM2soc0vTnbfRvw7PuG/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).equals("Unit 2 - Software Analysis and Design")) {
                                        String Url = "https://drive.google.com/file/d/1L8f15eZpRSokocJT0gmUsa-lRz5TDZks/view?usp=sharing";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 3 - Software Project Management")){
                                        String Url="https://drive.google.com/file/d/1b-ebr2uHMYnDzBcebbGKxkDAG3QzjglV/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 4 - Software Coding and Testing")){
                                        String Url="https://drive.google.com/file/d/1Nc7bcEFE5DxUc3EsxUPAZSKOOG7_AD6Q/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                }

                                @Override
                                public void onbutton3click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).equals("Unit 1 - Software Development Process")){
                                        String Url="https://drive.google.com/uc?export=download&id=1W-4nFiow0X2qPRM2soc0vTnbfRvw7PuG";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).equals("Unit 2 - Software Analysis and Design")) {
                                        String Url = "https://drive.google.com/uc?export=download&id=1L8f15eZpRSokocJT0gmUsa-lRz5TDZks";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 3 - Software Project Management")){
                                        String Url="https://drive.google.com/uc?export=download&id=1b-ebr2uHMYnDzBcebbGKxkDAG3QzjglV";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 4 - Software Coding and Testing")){
                                        String Url="https://drive.google.com/uc?export=download&id=1Nc7bcEFE5DxUc3EsxUPAZSKOOG7_AD6Q";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                }
                            });
                            recyclerView.setAdapter(cd2);
                        }

                        else if(bundle.getString("Subject").contains("3340704 - .NET PROGRAMMING")){
                            for (int i = 0; i < jo.length(); i++) {
                                try {
                                    JSONObject j = jo.getJSONObject(i);
                                    Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME22));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                            Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                                @Override
                                public void onitemclick(ArrayList<String> arrayList, int position) {

                                }

                                @Override
                                public void onbutton2click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).contains("Unit 1 - Introduction to Microsoft .NET framework")){
                                        String Url="https://drive.google.com/file/d/12Z4RVntRswlRCGMOC0eeFLRytKbLwMqE/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).equals("Unit 2 - Introduction to Windows Common Controls")) {
                                        String Url = "https://drive.google.com/file/d/1F_xml_RFzljf6nstwkoZ-5sI9ndu09xs/view?usp=sharing";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 3 - Additional controls and Menus Of Windows")){
                                        String Url="https://drive.google.com/file/d/1kiLnLRg5kzXBJ1t0gKTnne1KVMMhxJ0w/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 4 - Advanced Features of VB.Net")){
                                        String Url="https://drive.google.com/file/d/1_ePyepGvU_nB_0OVS9_4v0kzbfVGZjzn/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 5 - Inbuilt Functions and Database access using ADO.NET")){
                                        String Url="https://drive.google.com/file/d/1LW_bfvtVHrIHIlQwk2u0ttb1_m60EJ2p/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                }

                                @Override
                                public void onbutton3click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).contains("Unit 1 - Introduction to Microsoft .NET framework")){
                                        String Url="https://drive.google.com/uc?export=download&id=12Z4RVntRswlRCGMOC0eeFLRytKbLwMqE";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).equals("Unit 2 - Introduction to Windows Common Controls")) {
                                        String Url = "https://drive.google.com/uc?export=download&id=1F_xml_RFzljf6nstwkoZ-5sI9ndu09xs";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 3 - Additional controls and Menus Of Windows")){
                                        String Url="https://drive.google.com/uc?export=download&id=1kiLnLRg5kzXBJ1t0gKTnne1KVMMhxJ0w";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 4 - Advanced Features of VB.Net")){
                                        String Url="https://drive.google.com/uc?export=download&id=1_ePyepGvU_nB_0OVS9_4v0kzbfVGZjzn";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 5 - Inbuilt Functions and Database access using ADO.NET")){
                                        String Url="https://drive.google.com/uc?export=download&id=1LW_bfvtVHrIHIlQwk2u0ttb1_m60EJ2p";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                }
                            });
                            recyclerView.setAdapter(cd2);
                        }

                        else if(bundle.getString("Subject").contains("3340705 - COMPUTER ORGANIZATION AND ARCHITECTURE")){
                            for (int i = 0; i < jo.length(); i++) {
                                try {
                                    JSONObject j = jo.getJSONObject(i);
                                    Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME28));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                            Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                                @Override
                                public void onitemclick(ArrayList<String> arrayList, int position) {

                                }

                                @Override
                                public void onbutton2click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).equals("Unit 1 – Introduction to Database System")){
                                        String Url="https://drive.google.com/file/d/1NMyD6IOk66GP5R_uBIS7UTiSKBBJtsdr/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).equals("Unit 2 – Database System Architecture")) {
                                        String Url = "https://drive.google.com/file/d/1uaIrY5xtphQFjC6csdHoTCvPUzNeufth/view?usp=sharing";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 3 – Introduction to Structured Query Language (SQL)")){
                                        String Url="https://drive.google.com/file/d/1aIikSz3QU72fZ7OCwjXeRnNEYzdwwIOC/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 4 – Relational Algebra and implementation using SQL")){
                                        String Url="https://drive.google.com/file/d/1VUvmQ_-xN-2cqGZj973S24GdBEdF47UE/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 5 – Database Integrity Constraints")){
                                        String Url="https://drive.google.com/file/d/1d2nOFeFolctU_875RQ62avShDnXzC8xr/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).equals("Unit 6 – Entity Relational Model")){
                                        String Url="https://drive.google.com/file/d/1bNHvHxTfMIxQND9liS5LoETT7t7rVi1m/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                }

                                @Override
                                public void onbutton3click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).equals("Unit 1 – Introduction to Database System")){
                                        String Url="https://drive.google.com/uc?export=download&id=1NMyD6IOk66GP5R_uBIS7UTiSKBBJtsdr";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).equals("Unit 2 – Database System Architecture")) {
                                        String Url = "https://drive.google.com/uc?export=download&id=1uaIrY5xtphQFjC6csdHoTCvPUzNeufth";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 3 – Introduction to Structured Query Language (SQL)")){
                                        String Url="https://drive.google.com/uc?export=download&id=1aIikSz3QU72fZ7OCwjXeRnNEYzdwwIOC";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 4 – Relational Algebra and implementation using SQL")){
                                        String Url="https://drive.google.com/uc?export=download&id=1VUvmQ_-xN-2cqGZj973S24GdBEdF47UE";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 5 – Database Integrity Constraints")){
                                        String Url="https://drive.google.com/uc?export=download&id=1d2nOFeFolctU_875RQ62avShDnXzC8xr";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).equals("Unit 6 – Entity Relational Model")){
                                        String Url="https://drive.google.com/uc?export=download&id=1bNHvHxTfMIxQND9liS5LoETT7t7rVi1m";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                }
                            });
                            recyclerView.setAdapter(cd2);
                        }
                    }
            }

            else if(bundle.getString("Semester").equals("Semester 5")){
                if(bundle.getString("language").equals("English")){
                    if(bundle.getString("Subject").contains("3350701 - COMPUTER MAINTENANCE AND TROUBLE SHOOTING")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME30));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Inside the PC: Core Components")){
                                    String Url="https://drive.google.com/file/d/1nIWtybbHsQMLDdI68F6RI5gdIDHjscQl/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - Hard Disk Drive and Controller, DVD Drives")) {
                                    String Url = "https://drive.google.com/file/d/16Fus-P5aRiqJ_IlaJHw4Nrzh_l0jyn0k/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - Input Devices and Printers")){
                                    String Url="https://drive.google.com/file/d/1rGAIGY63_42zX4LNtNrg4I8ufFchW-LL/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 4 - Monitor and Display Adapters")){
                                    String Url="https://drive.google.com/file/d/1dQ8-crkuXIwd9pRpLd4sWtNCbnoeJR42/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Trouble Shooting and Preventive Maintenance")){
                                    String Url="https://drive.google.com/file/d/1T4CAldcCON7-JN2JzKhInXrHpl19WN9d/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Inside the PC: Core Components")){
                                    String Url="https://drive.google.com/uc?export=download&id=1nIWtybbHsQMLDdI68F6RI5gdIDHjscQl";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - Hard Disk Drive and Controller, DVD Drives")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=16Fus-P5aRiqJ_IlaJHw4Nrzh_l0jyn0k";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - Input Devices and Printers")){
                                    String Url="https://drive.google.com/uc?export=download&id=1rGAIGY63_42zX4LNtNrg4I8ufFchW-LL";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 4 - Monitor and Display Adapters")){
                                    String Url="https://drive.google.com/uc?export=download&id=1dQ8-crkuXIwd9pRpLd4sWtNCbnoeJR42";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Trouble Shooting and Preventive Maintenance")){
                                    String Url="https://drive.google.com/uc?export=download&id=1T4CAldcCON7-JN2JzKhInXrHpl19WN9d";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }

                    else if(bundle.getString("Subject").contains("3350702 - DYNAMIC WEB PAGE DEVELOPMENT")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME32));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Introduction to Html and CSS")){
                                    String Url="https://drive.google.com/file/d/1vsWleRAQfggxc7Ye7vKSVqJj0OIMffYJ/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - Working with Basic Building Blocks of PHP")) {
                                    String Url = "https://drive.google.com/file/d/1xPt1ZmWxEQkoHv1vCikiIK4-GFcdCmbY/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - Working with PHP Arrays and Functions")){
                                    String Url="https://drive.google.com/file/d/1wHVhvWkCvtQz4ANAjxfIB7mugveQZJ1C/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 4 - User Data Input Through Forms")){
                                    String Url="https://drive.google.com/file/d/1d6LHyWGxqkuK0EpwKV-A2STEPj5-_PLJ/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Establishing a Database Connection and Working with Database")){
                                    String Url="https://drive.google.com/file/d/1PWPixK8DLxgm4ZuOi0O6phKVslaOeXjp/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Introduction to Html and CSS")){
                                    String Url="https://drive.google.com/uc?export=download&id=1vsWleRAQfggxc7Ye7vKSVqJj0OIMffYJ";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - Working with Basic Building Blocks of PHP")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1xPt1ZmWxEQkoHv1vCikiIK4-GFcdCmbY";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - Working with PHP Arrays and Functions")){
                                    String Url="https://drive.google.com/uc?export=download&id=1wHVhvWkCvtQz4ANAjxfIB7mugveQZJ1C";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 4 - User Data Input Through Forms")){
                                    String Url="https://drive.google.com/uc?export=download&id=1d6LHyWGxqkuK0EpwKV-A2STEPj5-_PLJ";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Establishing a Database Connection and Working with Database")){
                                    String Url="https://drive.google.com/uc?export=download&id=1PWPixK8DLxgm4ZuOi0O6phKVslaOeXjp";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }

                    else if(bundle.getString("Subject").contains("3350703 - JAVA PROGRAMMING")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME34));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Introduction to JAVA")){
                                    String Url="https://drive.google.com/file/d/1YfNMaSc_nZUlG5WdSg8UlUWha09iK0cy/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - Building Blocks of the Language")) {
                                    String Url = "https://drive.google.com/file/d/19hNrUkAVOEnWkHZwoj1M9M2ieOq_7G7D/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - Object Oriented Programming Concepts")){
                                    String Url="https://drive.google.com/file/d/18J2ojHhvKcScEohn8JbecXe-mezRqJcJ/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 4 - Inheritance, Packages & Interfaces")){
                                    String Url="https://drive.google.com/file/d/1PfXHzoNhlzjUTwRl1D9QQ3jgtISsUxvV/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Exception Handling & Multithreaded Programming")){
                                    String Url="https://drive.google.com/file/d/10df4WbN_BrMoZKkXAbw9szWfiuozRqiq/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 6 - File Handling")){
                                    String Url="https://drive.google.com/file/d/1xBUV7fLrRzpWvTHCZtp6AxZ2Jdg9cThY/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Introduction to JAVA")){
                                    String Url="https://drive.google.com/uc?export=download&id=1YfNMaSc_nZUlG5WdSg8UlUWha09iK0cy";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - Building Blocks of the Language")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=19hNrUkAVOEnWkHZwoj1M9M2ieOq_7G7D";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - Object Oriented Programming Concepts")){
                                    String Url="https://drive.google.com/uc?export=download&id=18J2ojHhvKcScEohn8JbecXe-mezRqJcJ";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Inheritance, Packages & Interfaces")){
                                    String Url="https://drive.google.com/uc?export=download&id=1PfXHzoNhlzjUTwRl1D9QQ3jgtISsUxvV";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Exception Handling & Multithreaded Programming")){
                                    String Url="https://drive.google.com/uc?export=download&id=10df4WbN_BrMoZKkXAbw9szWfiuozRqiq";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 6 - File Handling")){
                                    String Url="https://drive.google.com/uc?export=download&id=1xBUV7fLrRzpWvTHCZtp6AxZ2Jdg9cThY";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }

                    else if(bundle.getString("Subject").contains("3350705 - MULTIMEDIA AND ANIMATION TECHNIQUES")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME36));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - The Elements of Design and Image Basics")){
                                    String Url="https://drive.google.com/file/d/1lwSY7LZ4PnmnPBgpUkoWl5gFAsrlAwqo/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - Photoshop tools for creating professional grade images")) {
                                    String Url = "https://drive.google.com/file/d/1Kl5HDKMSDTrvhpIKhM7-vycZFVWhiLHb/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - Flash Fundamentals")){
                                    String Url="https://drive.google.com/file/d/1So_J_0O2fJ1uNlLXUoCgNZ8vlPrVJL44/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 4 - Symbols, Animation And Organizing Projects")){
                                    String Url="https://drive.google.com/file/d/114NTVaeyD9WT5fHSVgfLDhgpoI1ro8FA/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Introduction To ActionScript")){
                                    String Url="https://drive.google.com/file/d/1ZTHg1BCoKDRHxeXURBDauzUryo7NnACu/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - The Elements of Design and Image Basics")){
                                    String Url="https://drive.google.com/uc?export=download&id=1lwSY7LZ4PnmnPBgpUkoWl5gFAsrlAwqo";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - Photoshop tools for creating professional grade images")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1Kl5HDKMSDTrvhpIKhM7-vycZFVWhiLHb";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - Flash Fundamentals")){
                                    String Url="https://drive.google.com/uc?export=download&id=1So_J_0O2fJ1uNlLXUoCgNZ8vlPrVJL44";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 4 - Symbols, Animation And Organizing Projects")){
                                    String Url="https://drive.google.com/uc?export=download&id=114NTVaeyD9WT5fHSVgfLDhgpoI1ro8FA";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Introduction To ActionScript")){
                                    String Url="https://drive.google.com/uc?export=download&id=1ZTHg1BCoKDRHxeXURBDauzUryo7NnACu";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }
                }

                else if(bundle.getString("language").equals("Gujarati")){
                        if(bundle.getString("Subject").contains("3350701 - COMPUTER MAINTENANCE AND TROUBLE SHOOTING")){
                            for (int i = 0; i < jo.length(); i++) {
                                try {
                                    JSONObject j = jo.getJSONObject(i);
                                    Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME31));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                            Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                                @Override
                                public void onitemclick(ArrayList<String> arrayList, int position) {

                                }

                                @Override
                                public void onbutton2click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).contains("Unit 1 - Inside the PC: Core Components")){
                                        String Url="https://drive.google.com/file/d/12S9lO9XoC2uYKEC9br1Xp6_gCcdR5JN6/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 2 - Hard Disk Drive and Controller, DVD Drives")) {
                                        String Url = "https://drive.google.com/file/d/1rCS_2-Bu3_oJRlfGAL76L3C9Sha9by1t/view?usp=sharing";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 3 - Input Devices and Printers")){
                                        String Url="https://drive.google.com/file/d/1Ubdm5nRUDYyGCSi4SMO9on_L0mVph3-H/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 4 - Monitor and Display Adapters")){
                                        String Url="https://drive.google.com/file/d/1oLjq3prWzvPRhNzyivvL77ZDonMh7kYV/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 5 - Trouble Shooting and Preventive Maintenance")){
                                        String Url="https://drive.google.com/file/d/1DAlC1qRHSpEs0VF7zFxPzi0Fj59o_zwl/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                }

                                @Override
                                public void onbutton3click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).contains("Unit 1 - Inside the PC: Core Components")){
                                        String Url="https://drive.google.com/uc?export=download&id=12S9lO9XoC2uYKEC9br1Xp6_gCcdR5JN6";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 2 - Hard Disk Drive and Controller, DVD Drives")) {
                                        String Url = "https://drive.google.com/uc?export=download&id=1rCS_2-Bu3_oJRlfGAL76L3C9Sha9by1t";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 3 - Input Devices and Printers")){
                                        String Url="https://drive.google.com/uc?export=download&id=1Ubdm5nRUDYyGCSi4SMO9on_L0mVph3-H";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 4 - Monitor and Display Adapters")){
                                        String Url="https://drive.google.com/uc?export=download&id=1oLjq3prWzvPRhNzyivvL77ZDonMh7kYV";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 5 - Trouble Shooting and Preventive Maintenance")){
                                        String Url="https://drive.google.com/uc?export=download&id=1DAlC1qRHSpEs0VF7zFxPzi0Fj59o_zwl";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                }
                            });
                            recyclerView.setAdapter(cd2);
                        }

                        else if(bundle.getString("Subject").contains("3350702 - DYNAMIC WEB PAGE DEVELOPMENT")){
                            for (int i = 0; i < jo.length(); i++) {
                                try {
                                    JSONObject j = jo.getJSONObject(i);
                                    Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME33));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                            Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                                @Override
                                public void onitemclick(ArrayList<String> arrayList, int position) {

                                }

                                @Override
                                public void onbutton2click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).contains("Unit 1 - Introduction to Html and CSS")){
                                        String Url="https://drive.google.com/file/d/1SWNAqsERmdbYaX4V6FP5DT6Dx1QlmCNL/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 2 - Working with Basic Building Blocks of PHP")) {
                                        String Url = "https://drive.google.com/file/d/1WBl4hinIApoW4JIGUnsQ9py5vkHmqVRu/view?usp=sharing";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 3 - Working with PHP Arrays and Functions")){
                                        String Url="https://drive.google.com/file/d/1h2HPreZjdIKEGkJaVu5z0E1AwbEbVVIB/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 4 - User Data Input Through Forms")){
                                        String Url="https://drive.google.com/file/d/1sbJVb1dhSG_oWg3VbMf6c09y5kYsHwem/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 5 - Establishing a Database Connection and Working with Database")){
                                        String Url="https://drive.google.com/file/d/1YPMJ8ZZeE08ZJQC5s-rr5Cgy2SAcHkOX/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                }

                                @Override
                                public void onbutton3click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).contains("Unit 1 - Introduction to Html and CSS")){
                                        String Url="https://drive.google.com/uc?export=download&id=1SWNAqsERmdbYaX4V6FP5DT6Dx1QlmCNL";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 2 - Working with Basic Building Blocks of PHP")) {
                                        String Url = "https://drive.google.com/uc?export=download&id=1WBl4hinIApoW4JIGUnsQ9py5vkHmqVRu";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 3 - Working with PHP Arrays and Functions")){
                                        String Url="https://drive.google.com/uc?export=download&id=1h2HPreZjdIKEGkJaVu5z0E1AwbEbVVIB";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 4 - User Data Input Through Forms")){
                                        String Url="https://drive.google.com/uc?export=download&id=1sbJVb1dhSG_oWg3VbMf6c09y5kYsHwem";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 5 - Establishing a Database Connection and Working with Database")){
                                        String Url="https://drive.google.com/uc?export=download&id=1YPMJ8ZZeE08ZJQC5s-rr5Cgy2SAcHkOX";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                }
                            });
                            recyclerView.setAdapter(cd2);
                        }

                        else if(bundle.getString("Subject").contains("3350703 - JAVA PROGRAMMING")){
                            for (int i = 0; i < jo.length(); i++) {
                                try {
                                    JSONObject j = jo.getJSONObject(i);
                                    Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME35));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                            Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                                @Override
                                public void onitemclick(ArrayList<String> arrayList, int position) {

                                }

                                @Override
                                public void onbutton2click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).contains("Unit 1 - Introduction to JAVA")){
                                        String Url="https://drive.google.com/file/d/1J2EoLuojPMwQM4B6QxFcLl-s-IvGKd5s/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 2 - Building Blocks of the Language")) {
                                        String Url = "https://drive.google.com/file/d/1nMuc7Kuohb7ZQS8_OJnctahgq_dErPmC/view?usp=sharing";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 3 - Object Oriented Programming Concepts")){
                                        String Url="https://drive.google.com/file/d/1wiMAmpwDhSP9Xo8MykJj6kq_p3y_5Q6x/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 4 - Inheritance, Packages & Interfaces")){
                                        String Url="https://drive.google.com/file/d/1Q-qMu1AOdOzU4fxrMxzNZxrChdkdsEXz/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 5 - Exception Handling & Multithreaded Programming")){
                                        String Url="https://drive.google.com/file/d/1MX0x-CXEwYEtHlVkCz7qPbiv4srfihrR/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 6 - File Handling")){
                                        String Url="https://drive.google.com/file/d/1OCIlO7IEm_g3Kh2vEKS3gajBatbW7MTr/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                }

                                @Override
                                public void onbutton3click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).contains("Unit 1 - Introduction to JAVA")){
                                        String Url="https://drive.google.com/uc?export=download&id=1J2EoLuojPMwQM4B6QxFcLl-s-IvGKd5s";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 2 - Building Blocks of the Language")) {
                                        String Url = "https://drive.google.com/uc?export=download&id=1nMuc7Kuohb7ZQS8_OJnctahgq_dErPmC";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 3 - Object Oriented Programming Concepts")){
                                        String Url="https://drive.google.com/uc?export=download&id=1wiMAmpwDhSP9Xo8MykJj6kq_p3y_5Q6x";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).equals("Unit 4 - Inheritance, Packages & Interfaces")){
                                        String Url="https://drive.google.com/uc?export=download&id=1Q-qMu1AOdOzU4fxrMxzNZxrChdkdsEXz";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 5 - Exception Handling & Multithreaded Programming")){
                                        String Url="https://drive.google.com/uc?export=download&id=1MX0x-CXEwYEtHlVkCz7qPbiv4srfihrR";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 6 - File Handling")){
                                        String Url="https://drive.google.com/uc?export=download&id=1OCIlO7IEm_g3Kh2vEKS3gajBatbW7MTr";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                }
                            });
                            recyclerView.setAdapter(cd2);
                        }

                        else if(bundle.getString("Subject").contains("3350705 - MULTIMEDIA AND ANIMATION TECHNIQUES")){
                            for (int i = 0; i < jo.length(); i++) {
                                try {
                                    JSONObject j = jo.getJSONObject(i);
                                    Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME37));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                            Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                                @Override
                                public void onitemclick(ArrayList<String> arrayList, int position) {

                                }

                                @Override
                                public void onbutton2click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).contains("Unit 1 - The Elements of Design and Image Basics")){
                                        String Url="https://drive.google.com/file/d/1v1Zqmmx7WhpP4-LP_FgRk3WO_BSWy6JZ/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 2 - Photoshop tools for creating professional grade images")) {
                                        String Url = "https://drive.google.com/file/d/1reFAhf2z3KIjIla5KyHO72d3R2XyTfYs/view?usp=sharing";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 3 - Flash Fundamentals")){
                                        String Url="https://drive.google.com/file/d/1D4GEqvPca8REfd6eH9b5DaDope4iksy3/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 4 - Symbols, Animation And Organizing Projects")){
                                        String Url="https://drive.google.com/file/d/1aeYGzj1jg9P-Pu3MvW2zCCH4MtvQ7VFn/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 5 - Introduction To ActionScript")){
                                        String Url="https://drive.google.com/file/d/1tW-rA0sApBbaPBJRsEnPkg-iPMC719-k/view?usp=sharing";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                }

                                @Override
                                public void onbutton3click(ArrayList<String> arrayList, int position) {
                                    if(arrayList.get(position).contains("Unit 1 - The Elements of Design and Image Basics")){
                                        String Url="https://drive.google.com/uc?export=download&id=1v1Zqmmx7WhpP4-LP_FgRk3WO_BSWy6JZ";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 2 - Photoshop tools for creating professional grade images")) {
                                        String Url = "https://drive.google.com/uc?export=download&id=1reFAhf2z3KIjIla5KyHO72d3R2XyTfYs";
                                        Intent intent = new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 3 - Flash Fundamentals")){
                                        String Url="https://drive.google.com/uc?export=download&id=1D4GEqvPca8REfd6eH9b5DaDope4iksy3";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }
                                    else if(arrayList.get(position).contains("Unit 4 - Symbols, Animation And Organizing Projects")){
                                        String Url="https://drive.google.com/uc?export=download&id=1aeYGzj1jg9P-Pu3MvW2zCCH4MtvQ7VFn";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                    else if(arrayList.get(position).contains("Unit 5 - Introduction To ActionScript")){
                                        String Url="https://drive.google.com/uc?export=download&id=1tW-rA0sApBbaPBJRsEnPkg-iPMC719-k";
                                        Intent intent=new Intent(Intent.ACTION_VIEW);
                                        intent.setData(Uri.parse(Url));
                                        startActivity(intent);
                                    }

                                }
                            });
                            recyclerView.setAdapter(cd2);
                        }
                }
            }

            else if(bundle.getString("Semester").equals("Semester 6")){
                if(bundle.getString("language").equals("English")){
                    if(bundle.getString("Subject").contains("3360701 - ADVANCE JAVA PROGRAMMING")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME39));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Java Applets")){
                                    String Url="https://drive.google.com/file/d/1-xXK79e6VQmpyZtRU8L7qn_2l_Z3U1Qm/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - Abstract Window Toolkit")) {
                                    String Url = "https://drive.google.com/file/d/1vVh5DLdMtFd6NFeN7jBIf477N8o7vrrF/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - Java Database Connectivity")){
                                    String Url="https://drive.google.com/file/d/1ane21sYnDZlWKRNmuVlDzUs46qJpdi9Q/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 4 - Servlets")){
                                    String Url="https://drive.google.com/file/d/1gcz2TjDKFjOJbjKqUygAS96h9b15mc_c/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Java Server Pages (JSP)")){
                                    String Url="https://drive.google.com/file/d/1pnY0boMvwzsutOkqpBwZP8A5ucs51Eul/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Java Applets")){
                                    String Url="https://drive.google.com/uc?export=download&id=1-xXK79e6VQmpyZtRU8L7qn_2l_Z3U1Qm";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - Abstract Window Toolkit")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1vVh5DLdMtFd6NFeN7jBIf477N8o7vrrF";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - Java Database Connectivity")){
                                    String Url="https://drive.google.com/uc?export=download&id=1ane21sYnDZlWKRNmuVlDzUs46qJpdi9Q";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Servlets")){
                                    String Url="https://drive.google.com/uc?export=download&id=1gcz2TjDKFjOJbjKqUygAS96h9b15mc_c";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Java Server Pages (JSP)")){
                                    String Url="https://drive.google.com/uc?export=download&id=1pnY0boMvwzsutOkqpBwZP8A5ucs51Eul";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }

                    else if(bundle.getString("Subject").contains("3360705 - DYNAMIC WEBPAGE WITH SCRIPTING LANGUAGE")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME41));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Form Designing using Canvas and CSS")){
                                    String Url="https://drive.google.com/file/d/1__mJoRtXN6rNVuRoyNmS5O4iSkFk8Tlh/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - Working with  JavaScript")) {
                                    String Url = "https://drive.google.com/file/d/1b5Y0G7B0lHmKbyLR8oeJ3C5PQvDvbIL1/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - Object Models in JavaScript")){
                                    String Url="https://drive.google.com/file/d/1tB1jq5olwJPxiGL4r4P3MDq0dLEgn7kH/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 4 - Working with jQuery")){
                                    String Url="https://drive.google.com/file/d/1T0Vwbq6iS_Wws5SfZL4NQWy_L7bEOQbU/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Working with Ajax")){
                                    String Url="https://drive.google.com/file/d/1lmIr1TH5z8-k-IWwwIxHx2q-eG5qdyrK/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Form Designing using Canvas and CSS")){
                                    String Url="https://drive.google.com/uc?export=download&id=1__mJoRtXN6rNVuRoyNmS5O4iSkFk8Tlh";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - Working with  JavaScript")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1b5Y0G7B0lHmKbyLR8oeJ3C5PQvDvbIL1";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - Object Models in JavaScript")){
                                    String Url="https://drive.google.com/uc?export=download&id=1tB1jq5olwJPxiGL4r4P3MDq0dLEgn7kH";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Working with jQuery")){
                                    String Url="https://drive.google.com/uc?export=download&id=1T0Vwbq6iS_Wws5SfZL4NQWy_L7bEOQbU";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Working with Ajax")){
                                    String Url="https://drive.google.com/uc?export=download&id=1lmIr1TH5z8-k-IWwwIxHx2q-eG5qdyrK";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }

                    else if(bundle.getString("Subject").contains("3360706 - ADVANCE WEBPAGE TECHNOLOGY")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME43));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Introduction to ASP.Net Web Programming & IDE")){
                                    String Url="https://drive.google.com/file/d/1_FC-kcb_k_n8xWEO1y-JLkbXZfuTFGlu/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - ASP.Net Server Controls")) {
                                    String Url = "https://drive.google.com/file/d/1ZbIWjtlbP7MXI66c0IKVepJ1yIMDobgk/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - State Management in ASP.Net")){
                                    String Url="https://drive.google.com/file/d/14CcYHM3necevgOwtJyKF3UshRIMpPD9v/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 4 - Working with Master Page & Themes")){
                                    String Url="https://drive.google.com/file/d/1jDIw7R4fBdUXkcr0RuaCbN2uTjoLFQJQ/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Database Programming using ADO.Net and AJAX")){
                                    String Url="https://drive.google.com/file/d/1sQk8ZeuECuf5718wQwwIJeLvTaf0YG_h/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Introduction to ASP.Net Web Programming & IDE")){
                                    String Url="https://drive.google.com/uc?export=download&id=1_FC-kcb_k_n8xWEO1y-JLkbXZfuTFGlu";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - ASP.Net Server Controls")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1ZbIWjtlbP7MXI66c0IKVepJ1yIMDobgk";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - State Management in ASP.Net")){
                                    String Url="https://drive.google.com/uc?export=download&id=14CcYHM3necevgOwtJyKF3UshRIMpPD9v";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Working with Master Page & Themes")){
                                    String Url="https://drive.google.com/uc?export=download&id=1jDIw7R4fBdUXkcr0RuaCbN2uTjoLFQJQ";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Database Programming using ADO.Net and AJAX")){
                                    String Url="https://drive.google.com/uc?export=download&id=1sQk8ZeuECuf5718wQwwIJeLvTaf0YG_h";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }
                }
                else if(bundle.getString("language").equals("Gujarati")){
                    if(bundle.getString("Subject").contains("3360701 - ADVANCE JAVA PROGRAMMING")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME40));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Java Applets")){
                                    String Url="https://drive.google.com/file/d/1PzEsx3bJnwHkC7Zz5GdiXYQ-BMHBPf-o/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - Abstract Window Toolkit")) {
                                    String Url = "https://drive.google.com/file/d/1ud_tHGoGd_-Yvp87afLzsR_JB-p0Ya2x/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - Java Database Connectivity")){
                                    String Url="https://drive.google.com/file/d/1A2ckjV_k4fMCDHwXYdSWjYolZk5oVuHt/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 4 - Servlets")){
                                    String Url="https://drive.google.com/file/d/1dfXSSZBic5PfYOJyJGs90wlcbzT4rPVC/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Java Server Pages (JSP)")){
                                    String Url="https://drive.google.com/file/d/14qxIDexb271REB2rrB69iRBUTfNsVUIx/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Java Applets")){
                                    String Url="https://drive.google.com/uc?export=download&id=1PzEsx3bJnwHkC7Zz5GdiXYQ-BMHBPf-o";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - Abstract Window Toolkit")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1ud_tHGoGd_-Yvp87afLzsR_JB-p0Ya2x";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - Java Database Connectivity")){
                                    String Url="https://drive.google.com/uc?export=download&id=1A2ckjV_k4fMCDHwXYdSWjYolZk5oVuHt";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Servlets")){
                                    String Url="https://drive.google.com/uc?export=download&id=1dfXSSZBic5PfYOJyJGs90wlcbzT4rPVC";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Java Server Pages (JSP)")){
                                    String Url="https://drive.google.com/uc?export=download&id=14qxIDexb271REB2rrB69iRBUTfNsVUIx";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }

                    else if(bundle.getString("Subject").contains("3360705 - DYNAMIC WEBPAGE WITH SCRIPTING LANGUAGE")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME42));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Form Designing using Canvas and CSS")){
                                    String Url="https://drive.google.com/file/d/1k5skDLdh1KQN4OQFaRnnYKwsiuQv2eOT/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - Working with  JavaScript")) {
                                    String Url = "https://drive.google.com/file/d/1hv2ZMGS1P7EAhnJI42RgI0VMRw6s9lNL/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - Object Models in JavaScript")){
                                    String Url="https://drive.google.com/file/d/1O8pja4y68U_M68w1mNd1M0YTmZ3Kw6Vi/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 4 - Working with jQuery")){
                                    String Url="https://drive.google.com/file/d/1TGjrCErzGopplWUfdfWEyrjzGM7ubuhL/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Working with Ajax")){
                                    String Url="https://drive.google.com/file/d/1Ml6vGXvlhJBBXQoLX3wTgAOD9H6AIQSs/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Form Designing using Canvas and CSS")){
                                    String Url="https://drive.google.com/uc?export=download&id=1k5skDLdh1KQN4OQFaRnnYKwsiuQv2eOT";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - Working with  JavaScript")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=1hv2ZMGS1P7EAhnJI42RgI0VMRw6s9lNL";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - Object Models in JavaScript")){
                                    String Url="https://drive.google.com/uc?export=download&id=1O8pja4y68U_M68w1mNd1M0YTmZ3Kw6Vi";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Working with jQuery")){
                                    String Url="https://drive.google.com/uc?export=download&id=1TGjrCErzGopplWUfdfWEyrjzGM7ubuhL";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Working with Ajax")){
                                    String Url="https://drive.google.com/uc?export=download&id=1Ml6vGXvlhJBBXQoLX3wTgAOD9H6AIQSs";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }

                    else if(bundle.getString("Subject").contains("3360706 - ADVANCE WEBPAGE TECHNOLOGY")){
                        for (int i = 0; i < jo.length(); i++) {
                            try {
                                JSONObject j = jo.getJSONObject(i);
                                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME44));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
                            @Override
                            public void onitemclick(ArrayList<String> arrayList, int position) {

                            }

                            @Override
                            public void onbutton2click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Introduction to ASP.Net Web Programming & IDE")){
                                    String Url="https://drive.google.com/file/d/1sQDUj6MUfZv9RKJjG2_0mK91X5v7Ae0f/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - ASP.Net Server Controls")) {
                                    String Url = "https://drive.google.com/file/d/15BecuvqqvsWAn1mk6RpPMi7irc6xtdYX/view?usp=sharing";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - State Management in ASP.Net")){
                                    String Url="https://drive.google.com/file/d/1kfQzz7qwKYsOrf_uFmQHSHFXMVXxJPqs/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 4 - Working with Master Page & Themes")){
                                    String Url="https://drive.google.com/file/d/1Pxt3wFMHj6ATXvUmkVGDgKjXIDovs_94/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Database Programming using ADO.Net and AJAX")){
                                    String Url="https://drive.google.com/file/d/1ciAfj68a4pf9jFUsodKdogt-JpeoZ9_u/view?usp=sharing";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                            }

                            @Override
                            public void onbutton3click(ArrayList<String> arrayList, int position) {
                                if(arrayList.get(position).contains("Unit 1 - Introduction to ASP.Net Web Programming & IDE")){
                                    String Url="https://drive.google.com/uc?export=download&id=1sQDUj6MUfZv9RKJjG2_0mK91X5v7Ae0f";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 2 - ASP.Net Server Controls")) {
                                    String Url = "https://drive.google.com/uc?export=download&id=15BecuvqqvsWAn1mk6RpPMi7irc6xtdYX";
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).contains("Unit 3 - State Management in ASP.Net")){
                                    String Url="https://drive.google.com/uc?export=download&id=1kfQzz7qwKYsOrf_uFmQHSHFXMVXxJPqs";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                                else if(arrayList.get(position).equals("Unit 4 - Working with Master Page & Themes")){
                                    String Url="https://drive.google.com/uc?export=download&id=1Pxt3wFMHj6ATXvUmkVGDgKjXIDovs_94";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }

                                else if(arrayList.get(position).contains("Unit 5 - Database Programming using ADO.Net and AJAX")){
                                    String Url="https://drive.google.com/uc?export=download&id=1ciAfj68a4pf9jFUsodKdogt-JpeoZ9_u";
                                    Intent intent=new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse(Url));
                                    startActivity(intent);
                                }
                            }
                        });
                        recyclerView.setAdapter(cd2);
                    }
                }
            }
        }
    }
}