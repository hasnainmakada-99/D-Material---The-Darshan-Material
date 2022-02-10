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

public class Civil_Sem4 extends AppCompatActivity {
    JSONArray result;
    RecyclerView recyclerView;
    ArrayList<String> Subject_Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_sem4);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Civil Engineering Semester 4"+"</font>"));
        Subject_Name=new ArrayList<String>();
        recyclerView=findViewById(R.id.recycle_view);
        Get_Subjects_Name();
    }


    public void Get_Subjects_Name(){
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

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    public void Fetch_Subject_Name(JSONArray jo){
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
}