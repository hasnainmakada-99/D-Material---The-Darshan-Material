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

public class Electrical_Sem4 extends AppCompatActivity {

    JSONArray result;
    RecyclerView recyclerView;
    ArrayList<String> Subject_Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical_sem4);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Electrical Engineering Semester 4"+"</font>"));
        Subject_Name=new ArrayList<String>();
        recyclerView=findViewById(R.id.recycle_view);
        Get_Subjects_Name();
    }


    public void Get_Subjects_Name(){
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

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    public void Fetch_Subject_Name(JSONArray jo){
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
}