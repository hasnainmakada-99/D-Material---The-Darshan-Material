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

public class Computer_Sem4_dotnet_guj extends AppCompatActivity {
    RecyclerView recyclerView;
    JSONArray result;
    ArrayList<String> Unit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem4_dotnet_guj);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +".Net Programming"+"</font>"));
        recyclerView=findViewById(R.id.recycle_view);
        Unit=new ArrayList<String>();
        Get_Unit_Name();
    }

    public void Get_Unit_Name(){
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH22, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY22);
                    Fetch_Unit_Name(result);
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
    public void Fetch_Unit_Name(JSONArray jo) {
        for (int i = 0; i < jo.length(); i++) {
            try {
                JSONObject j = jo.getJSONObject(i);
                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME22));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        Custom_Adapter2 cd2=new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
            @Override
            public void onitemclick(ArrayList<String> arrayList, int position) {

            }

            @Override
            public void onbutton2click(ArrayList<String> arrayList, int position) {
                if(arrayList.get(position).contains("Unit 1 - Introduction to Microsoft .NET framework")){
                    String Url="https://drive.google.com/file/d/1LGJaS8QbqD0tm1OZN8cQ_ldqC5vUk3QB/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).equals("Unit 2 - Introduction to Windows Common Controls")) {
                    String Url = "https://drive.google.com/file/d/18z6wesIyi4kfQNpeA2nOvVm642JbuDuV/view?usp=sharing";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 3 - Additional controls and Menus Of Windows")){
                    String Url="https://drive.google.com/file/d/1YoQPh-qc_F-KoQKRzFPJ7L6lcC9fcuHs/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 4 - Advanced Features of VB.Net")){
                    String Url="https://drive.google.com/file/d/1bHBdrAuYN7HGO5ypRU36zmCTb4zKEC51/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).contains("Unit 5 - Inbuilt Functions and Database access using ADO.NET")){
                    String Url="https://drive.google.com/file/d/1rEsvtMt52NQneNvgkdRZt-kLAMkEX2D9/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
            }

            @Override
            public void onbutton3click(ArrayList<String> arrayList, int position) {
                if(arrayList.get(position).contains("Unit 1 - Introduction to Microsoft .NET framework")){
                    String Url="https://drive.google.com/uc?export=download&id=1LGJaS8QbqD0tm1OZN8cQ_ldqC5vUk3QB";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).equals("Unit 2 - Introduction to Windows Common Controls")) {
                    String Url = "https://drive.google.com/uc?export=download&id=18z6wesIyi4kfQNpeA2nOvVm642JbuDuV";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 3 - Additional controls and Menus Of Windows")){
                    String Url="https://drive.google.com/uc?export=download&id=1YoQPh-qc_F-KoQKRzFPJ7L6lcC9fcuHs";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 4 - Advanced Features of VB.Net")){
                    String Url="https://drive.google.com/uc?export=download&id=1bHBdrAuYN7HGO5ypRU36zmCTb4zKEC51";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).contains("Unit 5 - Inbuilt Functions and Database access using ADO.NET")){
                    String Url="https://drive.google.com/uc?export=download&id=1rEsvtMt52NQneNvgkdRZt-kLAMkEX2D9";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
            }
        });
        recyclerView.setAdapter(cd2);
    }
}