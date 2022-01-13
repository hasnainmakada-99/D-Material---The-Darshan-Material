package com.example.d_material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Computer_Sem_3_English extends AppCompatActivity {
JSONArray result;
RecyclerView recyclerView;
ArrayList<String> Subject_Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem3_english);
        Subject_Name=new ArrayList<String>();
        recyclerView=findViewById(R.id.recyclerView);
        Get_Subjects_Name();
    }


   public void Get_Subjects_Name(){StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH5, new Response.Listener<String>() {
       @Override
       public void onResponse(String response) {
           try{
               JSONObject jsonObject=new JSONObject(response);
               result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY5);
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
                Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME5));
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        Custom_Adapter ad=new Custom_Adapter(Subject_Name, new Custom_Adapter.onclickitem() {
            @Override
            public void onitemclick(ArrayList<String> arrayList, int position, ImageView imageView) {
                if(arrayList.get(position).toString().equals("3330701 - OPERATING SYSTEM")){
                        Intent intent=new Intent(getApplicationContext(), Computer_Sem_3_OS_English.class);
                        startActivity(intent);
                }
            }
        });
        recyclerView.setAdapter(ad);
    }
}