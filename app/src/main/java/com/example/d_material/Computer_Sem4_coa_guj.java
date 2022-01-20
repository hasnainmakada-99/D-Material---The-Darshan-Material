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

public class Computer_Sem4_coa_guj extends AppCompatActivity {
    RecyclerView recyclerView;
    JSONArray result;
    ArrayList<String> Unit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem4_coa_guj);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Computer Organization and Architecture"+"</font>"));
        recyclerView=findViewById(R.id.recycle_view);
        Unit=new ArrayList<String>();
        Get_Unit_Name();
    }

    public void Get_Unit_Name(){
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH28, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY28);
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
                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME28));
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
                if(arrayList.get(position).equals("Unit 1 – Introduction to Database System")){
                    String Url="https://drive.google.com/file/d/1NMyD6IOk66GP5R_uBIS7UTiSKBBJtsdr/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).equals("Unit 2 – Database System Architecture")) {
                    String Url = "https://drive.google.com/file/d/1uaIrY5xtphQFjC6csdHoTCvPUzNeufth/view?usp=sharing";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 3 – Introduction to Structured Query Language (SQL)")){
                    String Url="https://drive.google.com/file/d/1aIikSz3QU72fZ7OCwjXeRnNEYzdwwIOC/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 4 – Relational Algebra and implementation using SQL")){
                    String Url="https://drive.google.com/file/d/1VUvmQ_-xN-2cqGZj973S24GdBEdF47UE/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).contains("Unit 5 – Database Integrity Constraints")){
                    String Url="https://drive.google.com/file/d/1d2nOFeFolctU_875RQ62avShDnXzC8xr/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).equals("Unit 6 – Entity Relational Model")){
                    String Url="https://drive.google.com/file/d/1bNHvHxTfMIxQND9liS5LoETT7t7rVi1m/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

            }

            @Override
            public void onbutton3click(ArrayList<String> arrayList, int position) {
                if(arrayList.get(position).equals("Unit 1 – Introduction to Database System")){
                    String Url="https://drive.google.com/uc?export=download&id=1NMyD6IOk66GP5R_uBIS7UTiSKBBJtsdr";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).equals("Unit 2 – Database System Architecture")) {
                    String Url = "https://drive.google.com/uc?export=download&id=1uaIrY5xtphQFjC6csdHoTCvPUzNeufth";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 3 – Introduction to Structured Query Language (SQL)")){
                    String Url="https://drive.google.com/uc?export=download&id=1aIikSz3QU72fZ7OCwjXeRnNEYzdwwIOC";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 4 – Relational Algebra and implementation using SQL")){
                    String Url="https://drive.google.com/uc?export=download&id=1VUvmQ_-xN-2cqGZj973S24GdBEdF47UE";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).contains("Unit 5 – Database Integrity Constraints")){
                    String Url="https://drive.google.com/uc?export=download&id=1d2nOFeFolctU_875RQ62avShDnXzC8xr";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).equals("Unit 6 – Entity Relational Model")){
                    String Url="https://drive.google.com/uc?export=download&id=1bNHvHxTfMIxQND9liS5LoETT7t7rVi1m";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
            }
        });
        recyclerView.setAdapter(cd2);
    }
}