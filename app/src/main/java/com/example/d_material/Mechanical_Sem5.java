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

public class Mechanical_Sem5 extends AppCompatActivity {
    JSONArray result;
    RecyclerView recyclerView;
    ArrayList<String> Subject_Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical_sem5);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Mechanical Engineering Semester 5"+"</font>"));
        Subject_Name=new ArrayList<String>();
        recyclerView=findViewById(R.id.recycle_view);
        Get_Subjects_Name();
    }


    public void Get_Subjects_Name(){
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH55, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY55);
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
                Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME55));
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
                if(arrayList.get(position).contains("3351901 - THERMAL ENGINEERING-II")){
                    String Url="https://drive.google.com/file/d/1aWbeBejUivkL-lbN-__Kvp-us3G6hbKi/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("3351902 - DESIGN OF MACHINE ELEMENTS")){
                    String Url="https://drive.google.com/file/d/1aWbeBejUivkL-lbN-__Kvp-us3G6hbKi/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("3351903 - MANUFACTURING ENGINEERING-III")){
                    String Url="https://drive.google.com/file/d/1aWbeBejUivkL-lbN-__Kvp-us3G6hbKi/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("3351904 - INDUSTRIAL ENGINEERING")){
                    String Url="https://drive.google.com/file/d/1aWbeBejUivkL-lbN-__Kvp-us3G6hbKi/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("3351905 - ESTIMATING, COSTING AND ENGINEERING CONTRACTING")){
                    String Url="https://drive.google.com/file/d/1aWbeBejUivkL-lbN-__Kvp-us3G6hbKi/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("3351906 - SELF EMPLOYEMENT AND ENTREPRENEURSHIP DEVELOPMENT")){
                    String Url="https://drive.google.com/file/d/1aWbeBejUivkL-lbN-__Kvp-us3G6hbKi/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
            }

            @Override
            public void onBtn2click(ArrayList<String> arrayList, int position) {

            }
        });
        recyclerView.setAdapter(cd);
    }
}