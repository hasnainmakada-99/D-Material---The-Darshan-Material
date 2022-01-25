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

public class Computer_Sem5_eng extends AppCompatActivity {
    JSONArray result;
    RecyclerView recyclerView;
    ArrayList<String> Subject_Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem5_eng);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Computer Engineering Semester 5"+"</font>"));
        Subject_Name=new ArrayList<String>();
        recyclerView=findViewById(R.id.recycle_view);
        Get_Subjects_Name();
    }


    public void Get_Subjects_Name(){
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

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    public void Fetch_Subject_Name(JSONArray jo){
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
                if(arrayList.get(position).equals("3350701 - COMPUTER MAINTENANCE AND TROUBLE SHOOTING")){
                    Intent intent1=new Intent(getApplicationContext(), Computer_Sem5_cmt_eng.class);
                    startActivity(intent1);
                }
                else if(arrayList.get(position).equals("3350702 - DYNAMIC WEB PAGE DEVELOPMENT")){
                    Intent intent=new Intent(getApplicationContext(), Computer_Sem5_dwpd_eng.class);
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("3350703 - JAVA PROGRAMMING")){
                    Intent intent=new Intent(getApplicationContext(), Computer_Sem5_java_eng.class);
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("3350705 - MULTIMEDIA AND ANIMATION TECHNIQUES")){
                    Intent intent=new Intent(getApplicationContext(), Computer_Sem5_mat_eng.class);
                    startActivity(intent);
                }
            }
        });
        recyclerView.setAdapter(ad);
    }
}