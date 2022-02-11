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

public class Mechanical_Sem2 extends AppCompatActivity {

    JSONArray result;
    RecyclerView recyclerView;
    ArrayList<String> Subject_Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical_sem2);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Mechanical Engineering Semester 2"+"</font>"));
        Subject_Name=new ArrayList<String>();
        recyclerView=findViewById(R.id.recycle_view);
        Get_Subjects_Name();
    }


    public void Get_Subjects_Name(){
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

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    public void Fetch_Subject_Name(JSONArray jo){
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
}