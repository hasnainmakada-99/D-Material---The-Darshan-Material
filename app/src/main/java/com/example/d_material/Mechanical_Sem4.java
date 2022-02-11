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

public class Mechanical_Sem4 extends AppCompatActivity {
    JSONArray result;
    RecyclerView recyclerView;
    ArrayList<String> Subject_Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical_sem4);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Mechanical Engineering Semester 4"+"</font>"));
        Subject_Name=new ArrayList<String>();
        recyclerView=findViewById(R.id.recycle_view);
        Get_Subjects_Name();
    }


    public void Get_Subjects_Name(){
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

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    public void Fetch_Subject_Name(JSONArray jo){
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
}