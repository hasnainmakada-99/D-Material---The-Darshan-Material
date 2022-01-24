package com.example.d_material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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

public class Computer_Sem5_java_eng extends AppCompatActivity {
    RecyclerView recyclerView;
    JSONArray result;
    ArrayList<String> Unit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem5_java_eng);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Java Programming"+"</font>"));
        recyclerView=findViewById(R.id.recycle_view);
        Unit=new ArrayList<String>();
        Get_Unit_Name();
    }

    public void Get_Unit_Name(){
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH34, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY34);
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
                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME34));
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
                if(arrayList.get(position).contains("Unit 1 - Introduction to JAVA")){
                    String Url="https://drive.google.com/file/d/1YfNMaSc_nZUlG5WdSg8UlUWha09iK0cy/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).contains("Unit 2 - Building Blocks of the Language")) {
                    String Url = "https://drive.google.com/file/d/19hNrUkAVOEnWkHZwoj1M9M2ieOq_7G7D/view?usp=sharing";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("Unit 3 - Object Oriented Programming Concepts")){
                    String Url="https://drive.google.com/file/d/18J2ojHhvKcScEohn8JbecXe-mezRqJcJ/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("Unit 4 - Inheritance, Packages & Interfaces")){
                    String Url="https://drive.google.com/file/d/1PfXHzoNhlzjUTwRl1D9QQ3jgtISsUxvV/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).contains("Unit 5 - Exception Handling & Multithreaded Programming")){
                    String Url="https://drive.google.com/file/d/10df4WbN_BrMoZKkXAbw9szWfiuozRqiq/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("Unit 6 - File Handling")){
                    String Url="https://drive.google.com/file/d/1xBUV7fLrRzpWvTHCZtp6AxZ2Jdg9cThY/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

            }

            @Override
            public void onbutton3click(ArrayList<String> arrayList, int position) {
                if(arrayList.get(position).contains("Unit 1 - Introduction to JAVA")){
                    String Url="https://drive.google.com/uc?export=download&id=1YfNMaSc_nZUlG5WdSg8UlUWha09iK0cy";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).contains("Unit 2 - Building Blocks of the Language")) {
                    String Url = "https://drive.google.com/uc?export=download&id=19hNrUkAVOEnWkHZwoj1M9M2ieOq_7G7D";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("Unit 3 - Object Oriented Programming Concepts")){
                    String Url="https://drive.google.com/uc?export=download&id=18J2ojHhvKcScEohn8JbecXe-mezRqJcJ";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 4 - Inheritance, Packages & Interfaces")){
                    String Url="https://drive.google.com/uc?export=download&id=1PfXHzoNhlzjUTwRl1D9QQ3jgtISsUxvV";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).contains("Unit 5 - Exception Handling & Multithreaded Programming")){
                    String Url="https://drive.google.com/uc?export=download&id=10df4WbN_BrMoZKkXAbw9szWfiuozRqiq";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("Unit 6 - File Handling")){
                    String Url="https://drive.google.com/uc?export=download&id=1xBUV7fLrRzpWvTHCZtp6AxZ2Jdg9cThY";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

            }
        });
        recyclerView.setAdapter(cd2);
    }
}