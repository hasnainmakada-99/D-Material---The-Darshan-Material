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

public class Civil_Sem1 extends AppCompatActivity {
    JSONArray result;
    RecyclerView recyclerView;
    ArrayList<String> Subject_Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_sem1);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Civil Engineering Semester 1"+"</font>"));
        Subject_Name=new ArrayList<String>();
        recyclerView=findViewById(R.id.recycle_view);
        Get_Subjects_Name();
    }


    public void Get_Subjects_Name(){
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

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    public void Fetch_Subject_Name(JSONArray jo){
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
}