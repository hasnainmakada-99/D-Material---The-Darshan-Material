package com.example.d_material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Objects;

public class Subjects_Activity extends AppCompatActivity {
    JSONArray result;
    RecyclerView recyclerView;
    ArrayList<String> Subject_Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        recyclerView=findViewById(R.id.recycle_view);
        Subject_Name=new ArrayList<>();
        Get_Subjects_Name();
    }

    public void Get_Subjects_Name(){
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(bundle.getString("Branch").equals("Computer Engineering"))
        {
            if(bundle.getString("Semester").equals("Semester 1")) {
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" + "Computer Engineering Semester 1" + "</font>"));
                StringRequest stringRequest = new StringRequest(Fetch_Database_D_Material.URL_PATH63, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            result = jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY63);
                            Fetch_Subject_Name(result);
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

            else if(bundle.getString("Semester").equals("Semester 2")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Computer Engineering Semester 2"+"</font>"));
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH64, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY64);
                            Fetch_Subject_Name(result);
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

            else if(bundle.getString("Semester").equals("Semester 3")){
                if(bundle.getString("language").equals("English")) {
                    Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" + "Computer Engineering Semester 3" + "</font>"));
                    StringRequest stringRequest = new StringRequest(Fetch_Database_D_Material.URL_PATH5, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONObject jsonObject = new JSONObject(response);
                                result = jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY5);
                                Fetch_Subject_Name(result);
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

                else if(bundle.getString("language").equals("Gujarati")){
                    Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Computer Engineering Semester 3"+"</font>"));
                    StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH6, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try{
                                JSONObject jsonObject=new JSONObject(response);
                                result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY6);
                                Fetch_Subject_Name(result);
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

            else if(bundle.getString("Semester").equals("Semester 4")){
                if(bundle.getString("language").equals("English")){
                    Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" + "Computer Engineering Semester 4" + "</font>"));
                    StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH18, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try{
                                JSONObject jsonObject=new JSONObject(response);
                                result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY18);
                                Fetch_Subject_Name(result);
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

                else if(bundle.getString("language").equals("Gujarati")){
                    Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" + "Computer Engineering Semester 4" + "</font>"));
                    StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH18, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try{
                                JSONObject jsonObject=new JSONObject(response);
                                result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY18);
                                Fetch_Subject_Name(result);
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

            else if(bundle.getString("Semester").equals("Semester 5")){
                if(bundle.getString("language").equals("English")){
                    Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" + "Computer Engineering Semester 5" + "</font>"));
                    StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH29, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try{
                                JSONObject jsonObject=new JSONObject(response);
                                result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY29);
                                Fetch_Subject_Name(result);
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

                else if(bundle.getString("language").equals("Gujarati")){
                    Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" + "Computer Engineering Semester 5" + "</font>"));
                    StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH29, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try{
                                JSONObject jsonObject=new JSONObject(response);
                                result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY29);
                                Fetch_Subject_Name(result);
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

            else if(bundle.getString("Semester").equals("Semester 6")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" + "Computer Engineering Semester 6" + "</font>"));
                if(bundle.getString("language").equals("English")){
                    StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH38, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try{
                                JSONObject jsonObject=new JSONObject(response);
                                result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY38);
                                Fetch_Subject_Name(result);
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
                else if(bundle.getString("language").equals("Gujarati")){
                    StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH38, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try{
                                JSONObject jsonObject=new JSONObject(response);
                                result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY38);
                                Fetch_Subject_Name(result);
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

        else if(bundle.getString("Branch").equals("Civil Engineering")){
            if(bundle.getString("Semester").equals("Semester 1")){
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH45, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY45);
                            Fetch_Subject_Name(result);
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

            else if(bundle.getString("Semester").equals("Semester 2")){
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH46, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY46);
                            Fetch_Subject_Name(result);
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

            else if(bundle.getString("Semester").equals("Semester 3")){
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH47, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY47);
                            Fetch_Subject_Name(result);
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

            else if(bundle.getString("Semester").equals("Semester 4")){
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH48, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY48);
                            Fetch_Subject_Name(result);
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

            else if(bundle.getString("Semester").equals("Semester 5")){
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH49, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY49);
                            Fetch_Subject_Name(result);
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

            else if(bundle.getString("Semester").equals("Semester 6")){
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH50, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY50);
                            Fetch_Subject_Name(result);
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

        else if(bundle.getString("Branch").equals("Mechanical Engineering")){
            if(bundle.getString("Semester").equals("Semester 1")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Mechanical Engineering Semester 1"+"</font>"));
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH51, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY51);
                            Fetch_Subject_Name(result);
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
            else if(bundle.getString("Semester").equals("Semester 2")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Mechanical Engineering Semester 2"+"</font>"));
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH52, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY52);
                            Fetch_Subject_Name(result);
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
            else if(bundle.getString("Semester").equals("Semester 3")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Mechanical Engineering Semester 3"+"</font>"));
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH53, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY53);
                            Fetch_Subject_Name(result);
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
            else if(bundle.getString("Semester").equals("Semester 4")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Mechanical Engineering Semester 4"+"</font>"));
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH54, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY54);
                            Fetch_Subject_Name(result);
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
            else if(bundle.getString("Semester").equals("Semester 5")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Mechanical Engineering Semester 5"+"</font>"));
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH55, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY55);
                            Fetch_Subject_Name(result);
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
            else if(bundle.getString("Semester").equals("Semester 6")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Mechanical Engineering Semester 6"+"</font>"));
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH56, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY56);
                            Fetch_Subject_Name(result);
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

        else if(bundle.getString("Branch").equals("Electrical Engineering")){
            if(bundle.getString("Semester").equals("Semester 1")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Electrical Engineering Semester 1"+"</font>"));
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH57, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY57);
                            Fetch_Subject_Name(result);
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
            else if(bundle.getString("Semester").equals("Semester 2")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Electrical Engineering Semester 2"+"</font>"));
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH58, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY58);
                            Fetch_Subject_Name(result);
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
            else if(bundle.getString("Semester").equals("Semester 3")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Electrical Engineering Semester 3"+"</font>"));
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH59, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY59);
                            Fetch_Subject_Name(result);
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
            else if(bundle.getString("Semester").equals("Semester 4")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Electrical Engineering Semester 4"+"</font>"));
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH60, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY60);
                            Fetch_Subject_Name(result);
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
            else if(bundle.getString("Semester").equals("Semester 5")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Electrical Engineering Semester 5"+"</font>"));
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH61, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY61);
                            Fetch_Subject_Name(result);
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
            else if(bundle.getString("Semester").equals("Semester 6")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Electrical Engineering Semester 6"+"</font>"));
                StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH62, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY62);
                            Fetch_Subject_Name(result);
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


    public void Fetch_Subject_Name(JSONArray jo){
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(bundle.getString("Branch").equals("Computer Engineering")){
            if(bundle.getString("Semester").equals("Semester 1")) {
                for (int i = 0; i < jo.length(); i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME63));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                recyclerView = findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd = new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if (arrayList.get(position).contains("3300001 - Basic Mathematics")) {
                            String Url = "https://drive.google.com/file/d/1RIPUn_V4f6abcfMkyOF_M0FGO8huoXNO/view?usp=sharing";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        } else if (arrayList.get(position).contains("3300002 - English")) {
                            String Url = "https://drive.google.com/file/d/111mfRkeKWNLPE7gmszO4oMbZr2k84AaG/view?usp=sharing";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        } else if (arrayList.get(position).contains("3300003 - Environment Conservation and Hazard Management")) {
                            String Url = "https://drive.google.com/file/d/1HQGM1Skq9ltCNUGxSTbU3uLH2Kkap4n2/view?usp=sharing";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        } else if (arrayList.get(position).contains("3310701 - Computer Programming")) {
                            String Url = "https://drive.google.com/file/d/13ZTOw4DIGJESMCgmCu47gpOxArjx6SzL/view?usp=sharing";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        } else if (arrayList.get(position).contains("3310702 - Fundamentals of Digital Electronics")) {
                            String Url = "https://drive.google.com/file/d/1pfcX7tv05nZdH-Mj4joxB57W-4pB29G1/view?usp=sharing";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }

                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if (arrayList.get(position).contains("3300001 - Basic Mathematics")) {
                            String Url = "https://drive.google.com/uc?export=download&id=1RIPUn_V4f6abcfMkyOF_M0FGO8huoXNO";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        } else if (arrayList.get(position).contains("3300002 - English")) {
                            String Url = "https://drive.google.com/uc?export=download&id=111mfRkeKWNLPE7gmszO4oMbZr2k84AaG";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        } else if (arrayList.get(position).contains("3300003 - Environment Conservation and Hazard Management")) {
                            String Url = "https://drive.google.com/uc?export=download&id=1HQGM1Skq9ltCNUGxSTbU3uLH2Kkap4n2";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        } else if (arrayList.get(position).contains("3310701 - Computer Programming")) {
                            String Url = "https://drive.google.com/uc?export=download&id=13ZTOw4DIGJESMCgmCu47gpOxArjx6SzL";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        } else if (arrayList.get(position).contains("3310702 - Fundamentals of Digital Electronics")) {
                            String Url = "https://drive.google.com/uc?export=download&id=1pfcX7tv05nZdH-Mj4joxB57W-4pB29G1";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }
            else if(bundle.getString("Semester").equals("Semester 2")){
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME64));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3300005 - Basic Physics")){
                            String Url="https://drive.google.com/file/d/1qyxa-xLPJVP14IKFyizbs9o9U6NUFDEA/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320002 - Advance Mathematics")){
                            String Url="https://drive.google.com/file/d/1l-JSKPp88wvnMk0XV9GaIk2bApA-k371/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320701 - Basic Electronics")){
                            String Url="https://drive.google.com/file/d/118jGSt2ALQU7SCe_AI7f6sJGfFwJkMVp/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320702 - Advance Computer Programming")){
                            String Url="https://drive.google.com/file/d/1-_0NbWHNXgcCVblPJFp5BBpJmWHsoJJg/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }

                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3300005 - Basic Physics")){
                            String Url="https://drive.google.com/uc?export=download&id=1qyxa-xLPJVP14IKFyizbs9o9U6NUFDEA";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320002 - Advance Mathematics")){
                            String Url="https://drive.google.com/uc?export=download&id=1l-JSKPp88wvnMk0XV9GaIk2bApA-k371";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320701 - Basic Electronics")){
                            String Url="https://drive.google.com/uc?export=download&id=118jGSt2ALQU7SCe_AI7f6sJGfFwJkMVp";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320702 - Advance Computer Programming")){
                            String Url="https://drive.google.com/uc?export=download&id=1-_0NbWHNXgcCVblPJFp5BBpJmWHsoJJg";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }

            else if(bundle.getString("Semester").equals("Semester 3")){
                if(bundle.getString("language").equals("English")) {
                    for (int i = 0; i < jo.length(); i++) {
                        try {
                            JSONObject j = jo.getJSONObject(i);
                            Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME5));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    recyclerView = findViewById(R.id.recycle_view);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    Custom_Adapter ad = new Custom_Adapter(Subject_Name, new Custom_Adapter.onclickitem() {
                        @Override
                        public void onitemclick(ArrayList<String> arrayList, int position, ImageView imageView) {
                            String subjectName=arrayList.get(position);
                            System.out.println(subjectName);
                            Intent intent1=new Intent(getApplicationContext(), Subjects_Units.class);
                            Bundle bundle1= new Bundle();
                            bundle1.putString("Subject", subjectName);
                            bundle1.putString("language", bundle.getString("language"));
                            bundle1.putString("Semester", bundle.getString("Semester"));
                            bundle1.putString("Branch", bundle.getString("Branch"));
                            intent1.putExtras(bundle1);
                            startActivity(intent1);
                        }
                    });
                    recyclerView.setAdapter(ad);
                }

                else if(bundle.getString("language").equals("Gujarati")){
                    for (int i = 0; i <jo.length() ; i++) {
                        try {
                            JSONObject j = jo.getJSONObject(i);
                            Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME6));
                        }
                        catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    Custom_Adapter ad=new Custom_Adapter(Subject_Name, new Custom_Adapter.onclickitem() {
                        @Override
                        public void onitemclick(ArrayList<String> arrayList, int position, ImageView imageView) {
                            String Subject_Name=arrayList.get(position);
                            Intent intent1=new Intent(getApplicationContext(), Subjects_Units.class);
                            Bundle bundle1=new Bundle();
                            bundle1.putString("Branch", bundle.getString("Branch"));
                            bundle1.putString("Semester", bundle.getString("Semester"));
                            bundle1.putString("language", bundle.getString("language"));
                            bundle1.putString("Subject", Subject_Name);
                            intent1.putExtras(bundle1);
                            startActivity(intent1);
                        }
                    });
                    recyclerView.setAdapter(ad);
                }
            }

            else if(bundle.getString("Semester").equals("Semester 4")){
                if(bundle.getString("language").equals("English")){
                    for (int i = 0; i <jo.length() ; i++) {
                        try {
                            JSONObject j = jo.getJSONObject(i);
                            Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME18));
                        }
                        catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    recyclerView=findViewById(R.id.recycle_view);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    Custom_Adapter ad=new Custom_Adapter(Subject_Name, new Custom_Adapter.onclickitem() {
                        @Override
                        public void onitemclick(ArrayList<String> arrayList, int position, ImageView imageView) {
                            String Subject=arrayList.get(position);
                            Intent intent1=new Intent(getApplicationContext(), Subjects_Units.class);
                            Bundle bundle1=new Bundle();
                            bundle1.putString("Branch", bundle.getString("Branch"));
                            bundle1.putString("Semester", bundle.getString("Semester"));
                            bundle1.putString("language", bundle.getString("language"));
                            bundle1.putString("Subject", Subject);
                            intent1.putExtras(bundle1);
                            startActivity(intent1);
                        }
                    });
                    recyclerView.setAdapter(ad);
                }

                else if(bundle.getString("language").equals("Gujarati")){
                    for (int i = 0; i <jo.length() ; i++) {
                        try {
                            JSONObject j = jo.getJSONObject(i);
                            Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME18));
                        }
                        catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    recyclerView=findViewById(R.id.recycle_view);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    Custom_Adapter ad=new Custom_Adapter(Subject_Name, new Custom_Adapter.onclickitem() {
                        @Override
                        public void onitemclick(ArrayList<String> arrayList, int position, ImageView imageView) {
                            String Subject=arrayList.get(position);
                            Intent intent1=new Intent(getApplicationContext(), Subjects_Units.class);
                            Bundle bundle1=new Bundle();
                            bundle1.putString("Branch", bundle.getString("Branch"));
                            bundle1.putString("Semester", bundle.getString("Semester"));
                            bundle1.putString("language", bundle.getString("language"));
                            bundle1.putString("Subject", Subject);
                            intent1.putExtras(bundle1);
                            startActivity(intent1);
                        }
                    });
                    recyclerView.setAdapter(ad);
                }
            }

            else if(bundle.getString("Semester").equals("Semester 5")){
                if(bundle.getString("language").equals("English")){
                    for (int i = 0; i <jo.length() ; i++) {
                        try {
                            JSONObject j = jo.getJSONObject(i);
                            Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME29));
                        }
                        catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    recyclerView=findViewById(R.id.recycle_view);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    Custom_Adapter ad=new Custom_Adapter(Subject_Name, new Custom_Adapter.onclickitem() {
                        @Override
                        public void onitemclick(ArrayList<String> arrayList, int position, ImageView imageView) {
                            String Subject=arrayList.get(position);
                            Intent intent1=new Intent(getApplicationContext(), Subjects_Units.class);
                            Bundle bundle1=new Bundle();
                            bundle1.putString("Branch", bundle.getString("Branch"));
                            bundle1.putString("Semester", bundle.getString("Semester"));
                            bundle1.putString("language", bundle.getString("language"));
                            bundle1.putString("Subject", Subject);
                            intent1.putExtras(bundle1);
                            startActivity(intent1);
                        }
                    });
                    recyclerView.setAdapter(ad);
                }

                else if(bundle.getString("language").equals("Gujarati")){
                    for (int i = 0; i <jo.length() ; i++) {
                        try {
                            JSONObject j = jo.getJSONObject(i);
                            Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME29));
                        }
                        catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    recyclerView=findViewById(R.id.recycle_view);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    Custom_Adapter ad=new Custom_Adapter(Subject_Name, new Custom_Adapter.onclickitem() {
                        @Override
                        public void onitemclick(ArrayList<String> arrayList, int position, ImageView imageView) {
                            String Subject=arrayList.get(position);
                            Intent intent1=new Intent(getApplicationContext(), Subjects_Units.class);
                            Bundle bundle1=new Bundle();
                            bundle1.putString("Branch", bundle.getString("Branch"));
                            bundle1.putString("Semester", bundle.getString("Semester"));
                            bundle1.putString("language", bundle.getString("language"));
                            bundle1.putString("Subject", Subject);
                            intent1.putExtras(bundle1);
                            startActivity(intent1);
                        }
                    });
                    recyclerView.setAdapter(ad);
                }
            }

            else if(bundle.getString("Semester").equals("Semester 6")){
                if(bundle.getString("language").equals("English")){
                    for (int i = 0; i <jo.length() ; i++) {
                        try {
                            JSONObject j = jo.getJSONObject(i);
                            Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME38));
                        }
                        catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    recyclerView=findViewById(R.id.recycle_view);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    Custom_Adapter ad=new Custom_Adapter(Subject_Name, new Custom_Adapter.onclickitem() {
                        @Override
                        public void onitemclick(ArrayList<String> arrayList, int position, ImageView imageView) {
                            String Subject=arrayList.get(position);
                            Intent intent1=new Intent(getApplicationContext(), Subjects_Units.class);
                            Bundle bundle1=new Bundle();
                            bundle1.putString("Branch", bundle.getString("Branch"));
                            bundle1.putString("Semester", bundle.getString("Semester"));
                            bundle1.putString("language", bundle.getString("language"));
                            bundle1.putString("Subject", Subject);
                            intent1.putExtras(bundle1);
                            startActivity(intent1);
                        }
                    });
                    recyclerView.setAdapter(ad);
                }

                else if(bundle.getString("language").equals("Gujarati")){
                    for (int i = 0; i <jo.length() ; i++) {
                        try {
                            JSONObject j = jo.getJSONObject(i);
                            Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME38));
                        }
                        catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    recyclerView=findViewById(R.id.recycle_view);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    Custom_Adapter ad=new Custom_Adapter(Subject_Name, new Custom_Adapter.onclickitem() {
                        @Override
                        public void onitemclick(ArrayList<String> arrayList, int position, ImageView imageView) {
                            String Subject=arrayList.get(position);
                            Intent intent1=new Intent(getApplicationContext(), Subjects_Units.class);
                            Bundle bundle1=new Bundle();
                            bundle1.putString("Branch", bundle.getString("Branch"));
                            bundle1.putString("Semester", bundle.getString("Semester"));
                            bundle1.putString("language", bundle.getString("language"));
                            bundle1.putString("Subject", Subject);
                            intent1.putExtras(bundle1);
                            startActivity(intent1);
                        }
                    });
                    recyclerView.setAdapter(ad);
                }
            }
        }

        else if(bundle.getString("Branch").equals("Civil Engineering")){
            if(bundle.getString("Semester").equals("Semester 1")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Civil Engineering Semester 1"+"</font>"));
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME45));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3300001 - BASIC MATHEMATICS")){
                            String Url="https://drive.google.com/file/d/17kTaykyQtzsJcGW-hn3UA2TppbEj57tT/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300002 - ENGLISH")){
                            String Url="https://drive.google.com/file/d/1lY2Jth5XLXJh115iuuhZWCIAGcIajW_F/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300003 - ENVIRONMENT CONSERVATION & HAZARD MANAGEMENT")){
                            String Url="https://drive.google.com/file/d/1x-UdrsxP_DAc2f50llCqUfaFMxOfq9bL/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300004 - ENGINEERING PHYSICS ( GROUP-1 )")){
                            String Url="https://drive.google.com/file/d/17V_cYAy28lQUz6P_ruig6UOSRnVVMnux/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300007 - BASIC ENGINEERING DRAWING")){
                            String Url="https://drive.google.com/file/d/1TbMf65WWR_-tl2IebqwQ1dz4IcnVUBTA/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300012 COMPUTER APPLICATION & GRAPHICS")){
                            String Url="https://drive.google.com/file/d/1mVLyMnABJfg6XnnFgiITa28EYH42Q26o/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }

                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3300001 - BASIC MATHEMATICS")){
                            String Url="https://drive.google.com/uc?export=download&id=17kTaykyQtzsJcGW-hn3UA2TppbEj57tT";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300002 - ENGLISH")){
                            String Url="https://drive.google.com/uc?export=download&id=1lY2Jth5XLXJh115iuuhZWCIAGcIajW_F";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300003 - ENVIRONMENT CONSERVATION & HAZARD MANAGEMENT")){
                            String Url="https://drive.google.com/uc?export=download&id=1x-UdrsxP_DAc2f50llCqUfaFMxOfq9bL";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300004 - ENGINEERING PHYSICS ( GROUP-1 )")){
                            String Url="https://drive.google.com/uc?export=download&id=17V_cYAy28lQUz6P_ruig6UOSRnVVMnux";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300007 - BASIC ENGINEERING DRAWING")){
                            String Url="https://drive.google.com/uc?export=download&id=1TbMf65WWR_-tl2IebqwQ1dz4IcnVUBTA";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300012 COMPUTER APPLICATION & GRAPHICS")){
                            String Url="https://drive.google.com/uc?export=download&id=1mVLyMnABJfg6XnnFgiITa28EYH42Q26o";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }

                    }
                });
                recyclerView.setAdapter(cd);
            }

            else if(bundle.getString("Semester").equals("Semester 2")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Civil Engineering Semester 2"+"</font>"));
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME46));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("1990001 - CONTRIBUTOR PERSONALITY DEVELOPMENT")){
                            String Url="https://drive.google.com/file/d/15FdTtOBpSD-iy3qztBVqvkprwSO5TzZP/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300002 - ENGLISH")){
                            String Url="https://drive.google.com/file/d/1lY2Jth5XLXJh115iuuhZWCIAGcIajW_F/view?usp=sharin";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320003 - ADVANCED MATHEMATICS(GROUP-2)")){
                            String Url="https://drive.google.com/file/d/12KnI6f0z0bsN5C7Te03ULCOsH6wM5bSZ/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300008 - APPLIED MECHANICS")){
                            String Url="https://drive.google.com/file/d/1bFglWyxs31zIOUYQahaQCRKlECtqdAew/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300009 - APPLIED CHEMISTRY ( GROUP-1 )")){
                            String Url="https://drive.google.com/file/d/1JW9tWabY6LPwVk4ctG5Cu2-mRJOH4Opu/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320601 - BUILDING DRAWING")){
                            String Url="https://drive.google.com/file/d/16N_jPJkA6Nlxn28mhdfK6Sfl5X5Gql8I/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320602 BASIC MECHANICAL ENGINEERING")){
                            String Url="https://drive.google.com/file/d/1yqJbRnWkw4mqKD1kwJRpmYWGclXmD2VH/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("1990001 - CONTRIBUTOR PERSONALITY DEVELOPMENT")){
                            String Url="https://drive.google.com/uc?export=download&id=15FdTtOBpSD-iy3qztBVqvkprwSO5TzZP";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300002 - ENGLISH")){
                            String Url="https://drive.google.com/uc?export=download&id=1lY2Jth5XLXJh115iuuhZWCIAGcIajW_F";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320003 - ADVANCED MATHEMATICS(GROUP-2)")){
                            String Url="https://drive.google.com/uc?export=download&id=12KnI6f0z0bsN5C7Te03ULCOsH6wM5bSZ";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300008 - APPLIED MECHANICS")){
                            String Url="https://drive.google.com/uc?export=download&id=1bFglWyxs31zIOUYQahaQCRKlECtqdAew";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300009 - APPLIED CHEMISTRY ( GROUP-1 )")){
                            String Url="https://drive.google.com/uc?export=download&id=1JW9tWabY6LPwVk4ctG5Cu2-mRJOH4Opu";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320601 - BUILDING DRAWING")){
                            String Url="https://drive.google.com/uc?export=download&id=16N_jPJkA6Nlxn28mhdfK6Sfl5X5Gql8I";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320602 BASIC MECHANICAL ENGINEERING")){
                            String Url="https://drive.google.com/uc?export=download&id=1yqJbRnWkw4mqKD1kwJRpmYWGclXmD2VH";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }
            else if(bundle.getString("Semester").equals("Semester 3")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Civil Engineering Semester 3"+"</font>"));
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME47));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3330601 - BUILDING MATERIALS")){
                            String Url="https://drive.google.com/file/d/1An8TraFtNQk-xk7c9afQuRvpKsY8I0LK/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330602 - CONSTRUCTION TECHNOLOGY")){
                            String Url="https://drive.google.com/file/d/1z-mJlR63TuoCu57a_HlvdXkgjVkc1MXr/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330603 - HYDRAULICS")){
                            String Url="https://drive.google.com/file/d/1Ewb9TrEfy57SedN0kj7zgnLdvX-hGBsc/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330604 - STRUCTURAL MECHANICS")){
                            String Url="https://drive.google.com/file/d/1PI_cUTpGj_7RP3J5HY0XeDlALtFNRg6C/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330605 SURVEYING")) {
                            String Url = "https://drive.google.com/file/d/1vZc2FyER29IO_ekYTBTkCrcqkREViabz/view?usp=sharing";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3330601 - BUILDING MATERIALS")){
                            String Url="https://drive.google.com/uc?export=download&id=1An8TraFtNQk-xk7c9afQuRvpKsY8I0LK";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330602 - CONSTRUCTION TECHNOLOGY")){
                            String Url="https://drive.google.com/uc?export=download&id=1z-mJlR63TuoCu57a_HlvdXkgjVkc1MXr";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330603 - HYDRAULICS")){
                            String Url="https://drive.google.com/uc?export=download&id=1Ewb9TrEfy57SedN0kj7zgnLdvX-hGBsc";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330604 - STRUCTURAL MECHANICS")){
                            String Url="https://drive.google.com/uc?export=download&id=1PI_cUTpGj_7RP3J5HY0XeDlALtFNRg6C";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330605 SURVEYING")) {
                            String Url = "https://drive.google.com/uc?export=download&id=1vZc2FyER29IO_ekYTBTkCrcqkREViab";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }
            else if(bundle.getString("Semester").equals("Semester 4")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Civil Engineering Semester 4"+"</font>"));
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME48));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3340601 - STRUCTURAL MECHANICS-II")){
                            String Url="https://drive.google.com/file/d/1KYuJ9tvsyfeBx4tMHmrCEwdNGofe1ytn/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340602 - ADVANCED SURVEYING")){
                            String Url="https://drive.google.com/file/d/1RORoCKYGPRDjJSM7v-_UDI1_ZrFH1GFx/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340603 - BASIC TRANSPORTATION ENGINEERING")){
                            String Url="https://drive.google.com/file/d/1lzIDSsbRogV6R51yl3ID7Z5Yezp8KpWw/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340604 - WATER RESOURCES MANAGEMENT")){
                            String Url="https://drive.google.com/file/d/1UWro9xd-nDwkF1OupBEgTog3_ikv8maa/view?usp=sharingg";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340605 - SOIL MECHANICS")){
                            String Url="https://drive.google.com/file/d/1iBiIP_ZOcIHl5wADflAhmaRc3utzUmRT/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340606 COMPUTER AIDED DRAWING")) {
                            String Url = "https://drive.google.com/file/d/14wifxfqRjUxKdma5TjlQTsddMuBBAoIQ/view?usp=sharing";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3340601 - STRUCTURAL MECHANICS-II")){
                            String Url="https://drive.google.com/uc?export=download&id=1KYuJ9tvsyfeBx4tMHmrCEwdNGofe1ytn";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340602 - ADVANCED SURVEYING")){
                            String Url="https://drive.google.com/uc?export=download&id=1RORoCKYGPRDjJSM7v-_UDI1_ZrFH1GFx";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340603 - BASIC TRANSPORTATION ENGINEERING")){
                            String Url="https://drive.google.com/uc?export=download&id=1lzIDSsbRogV6R51yl3ID7Z5Yezp8KpWw";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340604 - WATER RESOURCES MANAGEMENT")){
                            String Url="https://drive.google.com/uc?export=download&id=1UWro9xd-nDwkF1OupBEgTog3_ikv8maa";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340605 - SOIL MECHANICS")){
                            String Url="https://drive.google.com/uc?export=download&id=1iBiIP_ZOcIHl5wADflAhmaRc3utzUmRT";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340606 COMPUTER AIDED DRAWING")) {
                            String Url = "https://drive.google.com/uc?export=download&id=14wifxfqRjUxKdma5TjlQTsddMuBBAoIQ";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }

            else if(bundle.getString("Semester").equals("Semester 5")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Civil Engineering Semester 5"+"</font>"));
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME49));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3350601 - DESIGN OF STEEL STRUCTURE")){
                            String Url="https://drive.google.com/file/d/1QjZOz7kCXanwwXVHl1IhT1BjXFTGZxY-/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3350602 CONCRETE TECHNOLOGY")){
                            String Url="https://drive.google.com/file/d/1edrWBhzq4FHtB-FPaaNkCbj1351skMJ6/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3350603 - WATER SUPPLY & SANITARY ENGGINEERING")){
                            String Url="https://drive.google.com/file/d/1BT-mnHn5_GYYJVTf0rChEDwl1mxDfJYz/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3350604 - ESTIMATING , COSTING & VALUATION")){
                            String Url="https://drive.google.com/file/d/1AcIuUr2MLUpAbhv9JrUHC0RNlx5nDXS-/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }

                        else if(arrayList.get(position).contains("3350608 - ENVIRONMENTAL ENGINEERING &POLLUTION CONTROL")){
                            String Url="https://drive.google.com/file/d/1xgDc7spCeE3_DJJLKvbkP3XikY-lOVMF/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3350601 - DESIGN OF STEEL STRUCTURE")){
                            String Url="https://drive.google.com/uc?export=download&id=1QjZOz7kCXanwwXVHl1IhT1BjXFTGZxY-";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3350602 CONCRETE TECHNOLOGY")){
                            String Url="https://drive.google.com/uc?export=download&id=1edrWBhzq4FHtB-FPaaNkCbj1351skMJ6";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3350603 - WATER SUPPLY & SANITARY ENGGINEERING")){
                            String Url="https://drive.google.com/uc?export=download&id=1BT-mnHn5_GYYJVTf0rChEDwl1mxDfJYz";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3350604 - ESTIMATING , COSTING & VALUATION")){
                            String Url="https://drive.google.com/uc?export=download&id=1AcIuUr2MLUpAbhv9JrUHC0RNlx5nDXS-";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }

                        else if(arrayList.get(position).contains("3350608 - ENVIRONMENTAL ENGINEERING &POLLUTION CONTROL")){
                            String Url="https://drive.google.com/uc?export=download&id=1xgDc7spCeE3_DJJLKvbkP3XikY-lOVMF";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }

            else if(bundle.getString("Semester").equals("Semester 6")){
                Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Civil Engineering Semester 6"+"</font>"));
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME50));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3360601 - DESIGN OF REINFORCED CONCRETE STRUCTURES")){
                            String Url="https://drive.google.com/file/d/1RedK5In4SAiLN7h8ZmP2B4cjw0-7FtBJ/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3360602 - CONSTRUCTION QUALITY CONTROL & MONITORING")){
                            String Url="https://drive.google.com/file/d/16W4sO3hxoStg-ZDORDYX8OjTlmuBz7HD/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3360603 - CONSTRUCTION PROJECT MANAGEMENT")){
                            String Url="https://drive.google.com/file/d/11QOwEKReuapYfB_ke5XADBZ6FeiYJAK1/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3360601 - DESIGN OF REINFORCED CONCRETE STRUCTURES")){
                            String Url="https://drive.google.com/uc?export=download&id=1RedK5In4SAiLN7h8ZmP2B4cjw0-7FtBJ";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3360602 - CONSTRUCTION QUALITY CONTROL & MONITORING")){
                            String Url="https://drive.google.com/uc?export=download&id=16W4sO3hxoStg-ZDORDYX8OjTlmuBz7HD";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3360603 - CONSTRUCTION PROJECT MANAGEMENT")){
                            String Url="https://drive.google.com/uc?export=download&id=11QOwEKReuapYfB_ke5XADBZ6FeiYJAK1";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }

        }

        else if(bundle.getString("Branch").equals("Mechanical Engineering")){
            if(bundle.getString("Semester").equals("Semester 1")){
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME51));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3300001 - BASIC MATHEMATICS")){
                            String Url="https://drive.google.com/file/d/1R-KbtiMBq_IZ4iZtAY2VmfL1CCLgjspL/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300002 - ENGLISH")){
                            String Url="https://drive.google.com/file/d/1cBULVEYgf2OFqpCHaJ1_0cq8dnW6tpDv/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300003 - ENVIRONMENT CONSERVATION & HAZARD MANAGEMENT")){
                            String Url="https://drive.google.com/file/d/1JbFazlaWwZX4peopHu1n_3N7R8oot_EM/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300004 - ENGINEERING PHYSICS (GROUP-1)")){
                            String Url="https://drive.google.com/file/d/1ULE9u1qoK32UiUHpx5dWkNlUb20jkUln/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300007 - BASIC ENGINEERING DRAWING")){
                            String Url="https://drive.google.com/file/d/13V6U7Sw77wvfUMH6BnJEdMHZTXSFiuc_/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3301901 - ENGINEERING WORKSHOP PRACTICE")){
                            String Url="https://drive.google.com/file/d/167RkZAhRhVxoYNxV3YMAaJwCgmkiFTA7/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3300001 - BASIC MATHEMATICS")){
                            String Url="https://drive.google.com/uc?export=download&id=1R-KbtiMBq_IZ4iZtAY2VmfL1CCLgjspL";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300002 - ENGLISH")){
                            String Url="https://drive.google.com/uc?export=download&id=1cBULVEYgf2OFqpCHaJ1_0cq8dnW6tpDv";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300003 - ENVIRONMENT CONSERVATION & HAZARD MANAGEMENT")){
                            String Url="https://drive.google.com/uc?export=download&id=1JbFazlaWwZX4peopHu1n_3N7R8oot_EM";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300004 - ENGINEERING PHYSICS (GROUP-1)")){
                            String Url="https://drive.google.com/uc?export=download&id=1ULE9u1qoK32UiUHpx5dWkNlUb20jkUln";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300007 - BASIC ENGINEERING DRAWING")){
                            String Url="https://drive.google.com/uc?export=download&id=13V6U7Sw77wvfUMH6BnJEdMHZTXSFiuc_";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3301901 - ENGINEERING WORKSHOP PRACTICE")){
                            String Url="https://drive.google.com/uc?export=download&id=167RkZAhRhVxoYNxV3YMAaJwCgmkiFTA7";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }
            else if(bundle.getString("Semester").equals("Semester 2")){
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME52));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("1990001 - CONTRIBUTOR PERSONALITY DEVELOPMENET")){
                            String Url="https://drive.google.com/file/d/15FdTtOBpSD-iy3qztBVqvkprwSO5TzZP/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320003 - ADVANCED MATHEMATICS (GROUP-2)")){
                            String Url="https://drive.google.com/file/d/1Iwk6IINbkLx1U4wAEZTaeFHCNtfaVvQW/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300008 - APPLIED MECHANICS")){
                            String Url="https://drive.google.com/file/d/1Yzh8zAyK975ayOKYJ8lj_cEmDRV-e2bZ/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3321902 - MATERIAL SCIENCE & METALLURGY")){
                            String Url="https://drive.google.com/file/d/1EC3-v3aEO2eEJRSEgL83T92eZ3RIu3ky/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3321901 - MECHANICAL DRAFTING")){
                            String Url="https://drive.google.com/file/d/1qyJe578MNPOMRFzefQ-Igo-xpsp4FelV/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320004 - BASIC OF CIVIL ENGINEERING")){
                            String Url="https://drive.google.com/file/d/1baydSnyNnnJJGe_RS3oDqYNYnS_Lk2Xw/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("1990001 - CONTRIBUTOR PERSONALITY DEVELOPMENET")){
                            String Url="https://drive.google.com/uc?export=download&id=15FdTtOBpSD-iy3qztBVqvkprwSO5TzZP";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320003 - ADVANCED MATHEMATICS (GROUP-2)")){
                            String Url="https://drive.google.com/uc?export=download&id=1Iwk6IINbkLx1U4wAEZTaeFHCNtfaVvQW";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300008 - APPLIED MECHANICS")){
                            String Url="https://drive.google.com/uc?export=download&id=1Yzh8zAyK975ayOKYJ8lj_cEmDRV-e2bZ";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3321902 - MATERIAL SCIENCE & METALLURGY")){
                            String Url="https://drive.google.com/uc?export=download&id=1EC3-v3aEO2eEJRSEgL83T92eZ3RIu3ky";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3321901 - MECHANICAL DRAFTING")){
                            String Url="https://drive.google.com/uc?export=download&id=1qyJe578MNPOMRFzefQ-Igo-xpsp4FelV";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320004 - BASIC OF CIVIL ENGINEERING")){
                            String Url="https://drive.google.com/uc?export=download&id=1baydSnyNnnJJGe_RS3oDqYNYnS_Lk2Xw";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }
            else if(bundle.getString("Semester").equals("Semester 3")){
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME53));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3331901 - MANUFACTURING ENGINEERING-I")){
                            String Url="https://drive.google.com/file/d/1E5GnIbXmShPJpVRcteEA240KxR1ERBaM/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3331902 - THERMODYNAMICS")){
                            String Url="https://drive.google.com/file/d/1mWOPgaYonwnkUKDgboQLsTJV6aTgaNe3/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3331903 - FLUID MECHANICS AND HYDRAULIC MACHINES")){
                            String Url="https://drive.google.com/file/d/1_PED-e3VgIPBYFEpkZY6P7SG0OK675yX/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3331905 - APPLIED ELECTRICAL AND ELECTRONIC ENGINEERING")){
                            String Url="https://drive.google.com/file/d/1Q9S9poOvlcEOxVcZMDc2D7sSDwJqdcAP/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3331906 - COMPUTER AIDED MACHINE DRAWING")){
                            String Url="https://drive.google.com/file/d/1B5WUbJa3DhrbyVuyozn9x-DUNfmsggMl/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330001 - HUMAN RESOURCE MANAGEMENT")){
                            String Url="https://drive.google.com/file/d/1Tl9SDduyOIYRjST6loLqXAi65OQ0u4mI/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3331901 - MANUFACTURING ENGINEERING-I")){
                            String Url="https://drive.google.com/uc?export=download&id=1E5GnIbXmShPJpVRcteEA240KxR1ERBaM";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3331902 - THERMODYNAMICS")){
                            String Url="https://drive.google.com/uc?export=download&id=1mWOPgaYonwnkUKDgboQLsTJV6aTgaNe3";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3331903 - FLUID MECHANICS AND HYDRAULIC MACHINES")){
                            String Url="https://drive.google.com/uc?export=download&id=1_PED-e3VgIPBYFEpkZY6P7SG0OK675yX";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3331905 - APPLIED ELECTRICAL AND ELECTRONIC ENGINEERING")){
                            String Url="https://drive.google.com/uc?export=download&id=1Q9S9poOvlcEOxVcZMDc2D7sSDwJqdcAP";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3331906 - COMPUTER AIDED MACHINE DRAWING")){
                            String Url="https://drive.google.com/uc?export=download&id=1B5WUbJa3DhrbyVuyozn9x-DUNfmsggMl";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330001 - HUMAN RESOURCE MANAGEMENT")){
                            String Url="https://drive.google.com/uc?export=download&id=1Tl9SDduyOIYRjST6loLqXAi65OQ0u4mI";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }
            else if(bundle.getString("Semester").equals("Semester 4")){
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME54));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3341901 - MANUFACTURING ENGINEERING – II")){
                            String Url="https://drive.google.com/file/d/176UHoUjqTmTQpEmF1upBcYVs52UnzXSd/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3341902 - THERMAL ENGINEERING-I")){
                            String Url="https://drive.google.com/file/d/1zn7LsraZjFV8xslvQgFEmH_ZDgqM_4A1/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3341903 - THEORY OF MACHINES")){
                            String Url="https://drive.google.com/file/d/1anlmQTNZIzgGqmvGPi6LOWKI55rhKDRd/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3341904 - COMPUTER AIDED DESIGN")){
                            String Url="https://drive.google.com/file/d/18Cjzm_Tcc304iuwrM-OEqvup_JbNtSf4/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3341905 - METROLOGY & INSTRUMENTATION")){
                            String Url="https://drive.google.com/file/d/140EmrcDvRrNbY6p-G7pnPbNd2jt8nmBi/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3341906 - PLANT MAINTENANCE AND SAFETY")){
                            String Url="https://drive.google.com/file/d/1Y11x2wZir4cRpkCdKPumDAjzxXDSsqEv/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3341901 - MANUFACTURING ENGINEERING – II")){
                            String Url="https://drive.google.com/uc?export=download&id=176UHoUjqTmTQpEmF1upBcYVs52UnzXSd";
                            // String Url="https://www.youtube.com";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3341902 - THERMAL ENGINEERING-I")){
                            String Url="https://drive.google.com/uc?export=download&id=1zn7LsraZjFV8xslvQgFEmH_ZDgqM_4A1";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3341903 - THEORY OF MACHINES")){
                            String Url="https://drive.google.com/uc?export=download&id=1anlmQTNZIzgGqmvGPi6LOWKI55rhKDRd";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3341904 - COMPUTER AIDED DESIGN")){
                            String Url="https://drive.google.com/uc?export=download&id=18Cjzm_Tcc304iuwrM-OEqvup_JbNtSf4";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3341905 - METROLOGY & INSTRUMENTATION")){
                            String Url="https://drive.google.com/uc?export=download&id=140EmrcDvRrNbY6p-G7pnPbNd2jt8nmB";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3341906 - PLANT MAINTENANCE AND SAFETY")){
                            String Url="https://drive.google.com/uc?export=download&id=1Y11x2wZir4cRpkCdKPumDAjzxXDSsqEv";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }
            else if(bundle.getString("Semester").equals("Semester 5")){
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME55));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3351901 - THERMAL ENGINEERING-II")){
                            String Url="https://drive.google.com/file/d/1zqooufRt1hMB2_GcAk3BwPzwcp98YOV3/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3351902 - DESIGN OF MACHINE ELEMENTS")){
                            String Url="https://drive.google.com/file/d/1yv3gYoj9onEEzYImmoMGJNYDl7WYSEFE/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3351903 - MANUFACTURING ENGINEERING-III")){
                            String Url="https://drive.google.com/file/d/1IAcv8ZiyVR2guntr62Y8JzdH-zSpvo_d/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3351904 - INDUSTRIAL ENGINEERING")){
                            String Url="https://drive.google.com/file/d/1oZ1f89Kkl5a7rszpaiB1CHNLcd1m9MAk/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3351905 - ESTIMATING, COSTING AND ENGINEERING CONTRACTING")){
                            String Url="https://drive.google.com/file/d/1jqZ7v-dub_kZaoQpntdJHi506tGrlpXm/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3351906 - SELF EMPLOYEMENT AND ENTREPRENEURSHIP DEVELOPMENT")){
                            String Url="https://drive.google.com/file/d/1msUx6Q-HeESPEBFGmDvh12osJnlfNAyP/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3351901 - THERMAL ENGINEERING-II")){
                            String Url="https://drive.google.com/uc?export=download&id=1zqooufRt1hMB2_GcAk3BwPzwcp98YOV3";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3351902 - DESIGN OF MACHINE ELEMENTS")){
                            String Url="https://drive.google.com/uc?export=download&id=1yv3gYoj9onEEzYImmoMGJNYDl7WYSEFE";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3351903 - MANUFACTURING ENGINEERING-III")){
                            String Url="https://drive.google.com/uc?export=download&id=1IAcv8ZiyVR2guntr62Y8JzdH-zSpvo_d";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3351904 - INDUSTRIAL ENGINEERING")){
                            String Url="https://drive.google.com/uc?export=download&id=1oZ1f89Kkl5a7rszpaiB1CHNLcd1m9MAk";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3351905 - ESTIMATING, COSTING AND ENGINEERING CONTRACTING")){
                            String Url="https://drive.google.com/uc?export=download&id=1jqZ7v-dub_kZaoQpntdJHi506tGrlpXm";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3351906 - SELF EMPLOYEMENT AND ENTREPRENEURSHIP DEVELOPMENT")){
                            String Url="https://drive.google.com/uc?export=download&id=1msUx6Q-HeESPEBFGmDvh12osJnlfNAyP";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }
            else if(bundle.getString("Semester").equals("Semester 6")){
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME56));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3361901 - COMPUTER AIDED MANUFACTURING(CAM)")){
                            String Url="https://drive.google.com/file/d/1l11LP-TuJxRRYwDInwho8EKyLod0h-rq/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3361902 - TOOL ENGINEERING")){
                            String Url="https://drive.google.com/file/d/1bisC0RIwMZlxtCvAViC039EqEtrbl4o9/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3361903 - INDUSTRIAL MANAGEMENT")){
                            String Url="https://drive.google.com/file/d/1UhktoX2eAscxzdYJIJywpkZ2fx7GMYUt/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3361906 - POWER PLANT ENGINEERING")){
                            String Url="https://drive.google.com/file/d/1M35dwqQO17haMtcZrNiHp6ebJl9daKg0/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3361907 - THERMAL SYSTEMS AND ENERGY EFFICIENCY")) {
                            String Url = "https://drive.google.com/file/d/1hYF9HHVv1glaWOYZtDFnU-hNGyQTKrTp/view?usp=sharing";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3361901 - COMPUTER AIDED MANUFACTURING(CAM)")){
                            String Url="https://drive.google.com/uc?export=download&id=1l11LP-TuJxRRYwDInwho8EKyLod0h-rq";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3361902 - TOOL ENGINEERING")){
                            String Url="https://drive.google.com/uc?export=download&id=1bisC0RIwMZlxtCvAViC039EqEtrbl4o9";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3361903 - INDUSTRIAL MANAGEMENT")){
                            String Url="https://drive.google.com/uc?export=download&id=1UhktoX2eAscxzdYJIJywpkZ2fx7GMYUt";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3361906 - POWER PLANT ENGINEERING")){
                            String Url="https://drive.google.com/uc?export=download&id=1M35dwqQO17haMtcZrNiHp6ebJl9daKg0";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3361907 - THERMAL SYSTEMS AND ENERGY EFFICIENCY")) {
                            String Url = "https://drive.google.com/uc?export=download&id=1hYF9HHVv1glaWOYZtDFnU-hNGyQTKrTp";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }
        }

        else if(bundle.getString("Branch").equals("Electrical Engineering")){
            if(bundle.getString("Semester").equals("Semester 1")){
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME57));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3300001 - BASIC MATHEMATICS")){
                            String Url="https://drive.google.com/file/d/1RmUpNsQclCpojr0c_5ntXY1sBzYJ8iqi/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300002 - ENGLISH")){
                            String Url="https://drive.google.com/file/d/1l7lXfqSuLYiD7V5cxBxFrTwWjivyBMz_/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300003 - ENVIRONMENT CONSERVATION & HAZARD MANAGEMENT")){
                            String Url="https://drive.google.com/file/d/1v0WR7HrOQMi2Xx5FM24WFrLEAg5qU10B/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300006 - ENGINEERING CHEMISTRY ( GROUP-2 )")){
                            String Url="https://drive.google.com/file/d/1XSijTbdkyjMKluhIlRwoutso8nDqxvkF/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300013 - BASIC OF COMPUTER & INFORMATION TECHNOLOGY")) {
                            String Url = "https://drive.google.com/file/d/11t-XErUAif6PzOyIL7qdPWYUmnVIsnx_/view?usp=sharing";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300015 - FUNDAMENTAL OF MECHANICAL ENGINEERING")) {
                            String Url = "https://drive.google.com/file/d/1AOM_FNwl6W5tLhCJVkseQCRWV-ZtuEYs/view?usp=sharing";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3300001 - BASIC MATHEMATICS")){
                            String Url="https://drive.google.com/uc?export=download&id=1RmUpNsQclCpojr0c_5ntXY1sBzYJ8iqi";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300002 - ENGLISH")){
                            String Url="https://drive.google.com/uc?export=download&id=1l7lXfqSuLYiD7V5cxBxFrTwWjivyBMz_";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300003 - ENVIRONMENT CONSERVATION & HAZARD MANAGEMENT")){
                            String Url="https://drive.google.com/uc?export=download&id=1v0WR7HrOQMi2Xx5FM24WFrLEAg5qU10B";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300006 - ENGINEERING CHEMISTRY ( GROUP-2 )")){
                            String Url="https://drive.google.com/uc?export=download&id=1XSijTbdkyjMKluhIlRwoutso8nDqxvkF";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300013 - BASIC OF COMPUTER & INFORMATION TECHNOLOGY")) {
                            String Url = "https://drive.google.com/uc?export=download&id=11t-XErUAif6PzOyIL7qdPWYUmnVIsnx_";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300015 - FUNDAMENTAL OF MECHANICAL ENGINEERING")) {
                            String Url = "https://drive.google.com/uc?export=download&id=1AOM_FNwl6W5tLhCJVkseQCRWV-ZtuEYs";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);

            }
            else if(bundle.getString("Semester").equals("Semester 2")){
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME58));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("1990001 - CONTRIBUTOR PERSONALITY DEVELOPMENT")){
                            String Url="https://drive.google.com/file/d/1_jCWcSIhPLRLuyYQaPb3xutbPxzEDZYG/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320002 - ADVANCED MATHEMATICS (GROUP-1)")){
                            String Url="https://drive.google.com/file/d/1SbcrkVXQ8WT1FiwE4BIsDcc0arnQotqw/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320004 - BASIC OF CIVIL ENGINEERING")){
                            String Url="https://drive.google.com/file/d/1LyLjepyEfnJOo7zkaV56nAI7PQR7g_WV/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300005 - BASIC PHYSICS (GROUP-2)")){
                            String Url="https://drive.google.com/file/d/1Xk9VuF4wiYIokvgMT8fOP5JOlGRkbz0k/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300007 - BASIC ENGINEERING DRAWING")) {
                            String Url = "https://drive.google.com/file/d/1re2M6CgZc-cS-8DsBUYdMHN_bVzyv3-o/view?usp=sharing";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320903 - D.C.CIRCUITS")) {
                            String Url = "https://drive.google.com/file/d/1qoJxjKNGnK9uK8hp9sTQZemEcaLaQ2hz/view?usp=sharing";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320902 - ELECTRICAL ENGINEERING WORKSHOP PRACTICE")) {
                            String Url = "https://drive.google.com/file/d/1JgaBwXVbrmiB35WtmFdDPFVj347t1SyX/view?usp=sharing";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("1990001 - CONTRIBUTOR PERSONALITY DEVELOPMENT")){
                            String Url="https://drive.google.com/uc?export=download&id=1_jCWcSIhPLRLuyYQaPb3xutbPxzEDZYG";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320002 - ADVANCED MATHEMATICS (GROUP-1)")){
                            String Url="https://drive.google.com/uc?export=download&id=1SbcrkVXQ8WT1FiwE4BIsDcc0arnQotqw";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320004 - BASIC OF CIVIL ENGINEERING")){
                            String Url="https://drive.google.com/uc?export=download&id=1LyLjepyEfnJOo7zkaV56nAI7PQR7g_WV";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300005 - BASIC PHYSICS (GROUP-2)")){
                            String Url="https://drive.google.com/uc?export=download&id=1Xk9VuF4wiYIokvgMT8fOP5JOlGRkbz0k";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3300007 - BASIC ENGINEERING DRAWING")) {
                            String Url = "https://drive.google.com/uc?export=download&id=1re2M6CgZc-cS-8DsBUYdMHN_bVzyv3-o";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320903 - D.C.CIRCUITS")) {
                            String Url = "https://drive.google.com/uc?export=download&id=1qoJxjKNGnK9uK8hp9sTQZemEcaLaQ2hz";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3320902 - ELECTRICAL ENGINEERING WORKSHOP PRACTICE")) {
                            String Url = "https://drive.google.com/uc?export=download&id=1JgaBwXVbrmiB35WtmFdDPFVj347t1SyX";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }
            else if(bundle.getString("Semester").equals("Semester 3")){
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME59));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3330901 - AC CIRCUITS")){
                            String Url="https://drive.google.com/file/d/1rhG0KtbAAqEUBZaewxjHot6BxfBc0nUf/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330902 - DC MACHINES AND TRANSFORMER")){
                            String Url="https://drive.google.com/file/d/1c3sRitgriMTrVJNJFdbeni7vYD8wVmIU/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330903 - ELECTRICAL INSTRUMENTATION")){
                            String Url="https://drive.google.com/file/d/1qz14nxIKYIooVlunJwqEe-KPN_Ls-rkV/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330904 - ELECTRICAL POWER GENERATION")){
                            String Url="https://drive.google.com/file/d/1kYmmzxZEvis37bJOghqZ3ZA1qdIw0hNl/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330905 - ELECTRONICS COMPONENTS AND CIRCUITS")) {
                            String Url = "https://drive.google.com/file/d/1Os-AQWll0o74ijvl90i93RfL3UVUPiFI/view?usp=sharing";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3330901 - AC CIRCUITS")){
                            String Url="https://drive.google.com/uc?export=download&id=1rhG0KtbAAqEUBZaewxjHot6BxfBc0nUf";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330902 - DC MACHINES AND TRANSFORMER")){
                            String Url="https://drive.google.com/uc?export=download&id=1c3sRitgriMTrVJNJFdbeni7vYD8wVmIU";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330903 - ELECTRICAL INSTRUMENTATION")){
                            String Url="https://drive.google.com/uc?export=download&id=1qz14nxIKYIooVlunJwqEe-KPN_Ls-rkV";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330904 - ELECTRICAL POWER GENERATION")){
                            String Url="https://drive.google.com/uc?export=download&id=1kYmmzxZEvis37bJOghqZ3ZA1qdIw0hNl";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3330905 - ELECTRONICS COMPONENTS AND CIRCUITS")) {
                            String Url = "https://drive.google.com/uc?export=download&id=1Os-AQWll0o74ijvl90i93RfL3UVUPiFI";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }
            else if(bundle.getString("Semester").equals("Semester 4")){
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME60));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3340901 - POLYPHASE TRANSFORMERS AND ROTATING AC MACHINES")){
                            String Url="https://drive.google.com/file/d/1oRIFzoLL89KdCNseb1PM4Iu4xtrb_xIo/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340902 - TRANSMISSION AND DISTRIBUTION OF ELECTRICAL POWER")){
                            String Url="https://drive.google.com/file/d/1_Pj4KvBJfFklORSnHxNArFRthf-Pxp9s/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340903 - UTILIZATION OF ELECTRICAL ENERGY")){
                            String Url="https://drive.google.com/file/d/1OT_DhVhh9TdLNTp3v1sYLyvF4-FUwiMB/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340904 - DIGITAL ELECTRONICS AND DIGITAL INSTRUMENTS")){
                            String Url="https://drive.google.com/file/d/1_BaK8SP0dwboFmAAvADQTWy8J2phtew9/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340905 - COMPUTER AIDED ELECTRICAL DRAWING AND SIMULATION")) {
                            String Url = "https://drive.google.com/file/d/1XSV0bq0Bd8bAfhyFeotjmC4pZ53_Q5OG/view?usp=sharing";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3340901 - POLYPHASE TRANSFORMERS AND ROTATING AC MACHINES")){
                            String Url="https://drive.google.com/uc?export=download&id=1oRIFzoLL89KdCNseb1PM4Iu4xtrb_xIo";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340902 - TRANSMISSION AND DISTRIBUTION OF ELECTRICAL POWER")){
                            String Url="https://drive.google.com/uc?export=download&id=1_Pj4KvBJfFklORSnHxNArFRthf-Pxp9s";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340903 - UTILIZATION OF ELECTRICAL ENERGY")){
                            String Url="https://drive.google.com/uc?export=download&id=1OT_DhVhh9TdLNTp3v1sYLyvF4-FUwiMB";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340904 - DIGITAL ELECTRONICS AND DIGITAL INSTRUMENTS")){
                            String Url="https://drive.google.com/uc?export=download&id=1_BaK8SP0dwboFmAAvADQTWy8J2phtew9";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3340905 - COMPUTER AIDED ELECTRICAL DRAWING AND SIMULATION")) {
                            String Url = "https://drive.google.com/uc?export=download&id=1XSV0bq0Bd8bAfhyFeotjmC4pZ53_Q5OG";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }
            else if(bundle.getString("Semester").equals("Semester 5")){
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME61));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3350901 - WIRING ESTIMATING, COSTING & CONTRACTING")){
                            String Url="https://drive.google.com/file/d/1VGBkoayM1sruyu4DsVwMQv6RGEfAGgG9/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3350902 - ENERGY CONSERVATION & AUDIT")){
                            String Url="https://drive.google.com/file/d/1sTXaiqNFonNib_iDa6Nb9udAqAsN7ez2/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3350903 - POWER ELECTRONICS")){
                            String Url="https://drive.google.com/file/d/1m2FjQ2WKqIkQIdAUdxAvwGpaVim5dx1X/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3350904 - MICROPROCESSOR AND CONTROLLER APPLICATIONS")){
                            String Url="https://drive.google.com/file/d/1ALf_53Xb0aC7cQhW3vwQBeXg2ITyQ5ah/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3350907 - ELECTRIC TRACTION AND CONTROL")) {
                            String Url = "https://drive.google.com/file/d/1eNUg_xcvwSIXtY3cGR6L5cAEwi4_TfwK/view?usp=sharing";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3350901 - WIRING ESTIMATING, COSTING & CONTRACTING")){
                            String Url="https://drive.google.com/uc?export=download&id=1VGBkoayM1sruyu4DsVwMQv6RGEfAGgG9";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3350902 - ENERGY CONSERVATION & AUDIT")){
                            String Url="https://drive.google.com/uc?export=download&id=1sTXaiqNFonNib_iDa6Nb9udAqAsN7ez2";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3350903 - POWER ELECTRONICS")){
                            String Url="https://drive.google.com/uc?export=download&id=1m2FjQ2WKqIkQIdAUdxAvwGpaVim5dx1X";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3350904 - MICROPROCESSOR AND CONTROLLER APPLICATIONS")){
                            String Url="https://drive.google.com/uc?export=download&id=1ALf_53Xb0aC7cQhW3vwQBeXg2ITyQ5ah";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3350907 - ELECTRIC TRACTION AND CONTROL")) {
                            String Url = "https://drive.google.com/uc?export=download&id=1eNUg_xcvwSIXtY3cGR6L5cAEwi4_TfwK";
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }
            else if(bundle.getString("Semester").equals("Semester 6")){
                for (int i = 0; i <jo.length() ; i++) {
                    try {
                        JSONObject j = jo.getJSONObject(i);
                        Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME62));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                recyclerView=findViewById(R.id.recycle_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                Custom_Adapter3 cd=new Custom_Adapter3(Subject_Name, new Custom_Adapter3.onItemClick() {
                    @Override
                    public void onBtn1click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3360901 - SWITCHGEAR & PROTECTION")){
                            String Url="https://drive.google.com/file/d/159dGcRBT8aEawQdZiubjTNW45X-ZwWGu/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3360902 - INSTALLATION, COMMISSIONING AND MAINTENANCE")){
                            String Url="https://drive.google.com/file/d/1ttWxdZmRoENqFSgy7MG272nfoBhlcZ5F/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3360907 - MAINTENANCE OF TRANSFORMER AND CIRCUIT BREAKER")){
                            String Url="https://drive.google.com/file/d/1QpAFUtmn54p2ufvxupp8TXElXUtUOpR0/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3360908 - ELECTRIFICATION OF BUILDING  COMPLEXES")){
                            String Url="https://drive.google.com/file/d/1mXDpkW6x0Qbvv-Bv2vgxrRQ45VPzG-w1/view?usp=sharing";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onBtn2click(ArrayList<String> arrayList, int position) {
                        if(arrayList.get(position).contains("3360901 - SWITCHGEAR & PROTECTION")){
                            String Url="https://drive.google.com/uc?export=download&id=159dGcRBT8aEawQdZiubjTNW45X-ZwWGu";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3360902 - INSTALLATION, COMMISSIONING AND MAINTENANCE")){
                            String Url="https://drive.google.com/uc?export=download&id=1ttWxdZmRoENqFSgy7MG272nfoBhlcZ5F";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3360907 - MAINTENANCE OF TRANSFORMER AND CIRCUIT BREAKER")){
                            String Url="https://drive.google.com/uc?export=download&id=1QpAFUtmn54p2ufvxupp8TXElXUtUOpR0";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                        else if(arrayList.get(position).contains("3360908 - ELECTRIFICATION OF BUILDING  COMPLEXES")){
                            String Url="https://drive.google.com/uc?export=download&id=1mXDpkW6x0Qbvv-Bv2vgxrRQ45VPzG-w1";
                            Intent intent=new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(Url));
                            startActivity(intent);
                        }
                    }
                });
                recyclerView.setAdapter(cd);
            }
        }
    }
}