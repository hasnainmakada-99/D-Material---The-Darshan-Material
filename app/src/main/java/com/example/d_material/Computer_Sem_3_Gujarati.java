package com.example.d_material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Objects;

public class Computer_Sem_3_Gujarati extends AppCompatActivity {
//    ListView listView;
    RecyclerView recyclerView;
    JSONArray result;
    ArrayList<String> Subject_Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem3_gujarati);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Computer Engineering Semester 3"+"</font>"));
        Subject_Name=new ArrayList<String>();
//        listView=findViewById(R.id.recycle_view);
        recyclerView=findViewById(R.id.recycle_view);
        Get_Subject_Name();
    }

    // For Fetching All the Subjects Of Semester 1
    public void Get_Subject_Name(){
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH6, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY6);
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

    // For Fetching Subjects_Name
    public void Fetch_Subject_Name(JSONArray jo){
        for (int i = 0; i <jo.length() ; i++) {
            try {
                JSONObject j = jo.getJSONObject(i);
                Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME6));
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        Custom_Adapter ad=new Custom_Adapter(Subject_Name, new Custom_Adapter.onclickitem() {
            @Override
            public void onitemclick(ArrayList<String> arrayList, int position, ImageView imageView) {
                if(arrayList.get(position).toString().equals("3330701 - OPERATING SYSTEM")){
                    Intent intent=new Intent(getApplicationContext(), Computer_Sem_3_OS_Gujarati.class);
                    startActivity(intent);
                }
            }
        });
        recyclerView.setAdapter(ad);
    }
}