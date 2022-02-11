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

public class Electrical_Sem2 extends AppCompatActivity {
    JSONArray result;
    RecyclerView recyclerView;
    ArrayList<String> Subject_Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical_sem2);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Electrical Engineering Semester 2"+"</font>"));
        Subject_Name=new ArrayList<String>();
        recyclerView=findViewById(R.id.recycle_view);
        Get_Subjects_Name();
    }


    public void Get_Subjects_Name(){
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
    public void Fetch_Subject_Name(JSONArray jo){
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
}