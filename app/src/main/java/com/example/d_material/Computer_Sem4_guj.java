package com.example.d_material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
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

public class Computer_Sem4_guj extends AppCompatActivity {
    JSONArray result;
    RecyclerView recyclerView;
    ArrayList<String> Subject_Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem4_guj);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Computer Engineering Semester 4"+"</font>"));
        Subject_Name=new ArrayList<String>();
        recyclerView=findViewById(R.id.recycle_view);
        Get_Subjects_Name();
    }


    public void Get_Subjects_Name(){
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

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    public void Fetch_Subject_Name(JSONArray jo){
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
                if(arrayList.get(position).equals("3330701 - OPERATING SYSTEM")){
                    Intent intent1=new Intent(getApplicationContext(), Computer_Sem_3_OS_English.class);
                    startActivity(intent1);
                }
                else if(arrayList.get(position).equals("3330702 - PROGRAMMING IN C++")){
                    Intent intent2=new Intent(getApplicationContext(), Computer_Sem_3_CPP_English.class);
                    startActivity(intent2);
                }
                else if(arrayList.get(position).contains("3330703 - DATABASE MANAGEMENT SYSTEM")){
                    Intent intent3=new Intent(getApplicationContext(), Computer_Sem3_dbms_English.class);
                    startActivity(intent3);
                }
                else if(arrayList.get(position).contains("3330704 - DATA STRUCTURE")){
                    Intent intent3=new Intent(getApplicationContext(), Computer_Sem3_Ds_English.class);
                    startActivity(intent3);
                }
                else if(arrayList.get(position).contains("3330705 - MICROPROCESSOR & ASSEMBLY LANGUAGE PROGRAMMING")){
                    Intent intent3=new Intent(getApplicationContext(), Computer_Sem3_malp_English.class);
                    startActivity(intent3);
                }
            }
        });
        recyclerView.setAdapter(ad);
    }
}