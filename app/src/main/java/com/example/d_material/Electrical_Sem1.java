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

public class Electrical_Sem1 extends AppCompatActivity {
    JSONArray result;
    RecyclerView recyclerView;
    ArrayList<String> Subject_Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical_sem1);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Electrical Engineering Semester 1"+"</font>"));
        Subject_Name=new ArrayList<String>();
        recyclerView=findViewById(R.id.recycle_view);
        Get_Subjects_Name();
    }


    public void Get_Subjects_Name(){
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

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    public void Fetch_Subject_Name(JSONArray jo){
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
}