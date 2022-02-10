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

public class Civil_Sem2 extends AppCompatActivity {
    JSONArray result;
    RecyclerView recyclerView;
    ArrayList<String> Subject_Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_sem2);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Civil Engineering Semester 2"+"</font>"));
        Subject_Name=new ArrayList<String>();
        recyclerView=findViewById(R.id.recycle_view);
        Get_Subjects_Name();
    }


    public void Get_Subjects_Name(){
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH46, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY46);
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
                Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME46));
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
                if(arrayList.get(position).contains("1990001 - CONTRIBUTOR PERSONALITY DEVELOPMENT")){
                    String Url="https://drive.google.com/file/d/15FdTtOBpSD-iy3qztBVqvkprwSO5TzZP/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("3300002 - ENGLISH")){
                    String Url="https://drive.google.com/file/d/1lY2Jth5XLXJh115iuuhZWCIAGcIajW_F/view?usp=sharin";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("3320003 - ADVANCED MATHEMATICS(GROUP-2)")){
                    String Url="https://drive.google.com/file/d/12KnI6f0z0bsN5C7Te03ULCOsH6wM5bSZ/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("3300008 - APPLIED MECHANICS")){
                    String Url="https://drive.google.com/file/d/1bFglWyxs31zIOUYQahaQCRKlECtqdAew/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("3300009 - APPLIED CHEMISTRY ( GROUP-1 )")){
                    String Url="https://drive.google.com/file/d/1JW9tWabY6LPwVk4ctG5Cu2-mRJOH4Opu/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("3320601 - BUILDING DRAWING")){
                    String Url="https://drive.google.com/file/d/16N_jPJkA6Nlxn28mhdfK6Sfl5X5Gql8I/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("3320602 BASIC MECHANICAL ENGINEERING")){
                    String Url="https://drive.google.com/file/d/1yqJbRnWkw4mqKD1kwJRpmYWGclXmD2VH/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
            }

            @Override
            public void onBtn2click(ArrayList<String> arrayList, int position) {
                if(arrayList.get(position).contains("1990001 - CONTRIBUTOR PERSONALITY DEVELOPMENT")){
                    String Url="https://drive.google.com/uc?export=download&id=15FdTtOBpSD-iy3qztBVqvkprwSO5TzZP";
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
                else if(arrayList.get(position).contains("3320003 - ADVANCED MATHEMATICS(GROUP-2)")){
                    String Url="https://drive.google.com/uc?export=download&id=12KnI6f0z0bsN5C7Te03ULCOsH6wM5bSZ";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("3300008 - APPLIED MECHANICS")){
                    String Url="https://drive.google.com/uc?export=download&id=1bFglWyxs31zIOUYQahaQCRKlECtqdAew";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("3300009 - APPLIED CHEMISTRY ( GROUP-1 )")){
                    String Url="https://drive.google.com/uc?export=download&id=1JW9tWabY6LPwVk4ctG5Cu2-mRJOH4Opu";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("3320601 - BUILDING DRAWING")){
                    String Url="https://drive.google.com/uc?export=download&id=16N_jPJkA6Nlxn28mhdfK6Sfl5X5Gql8I";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("3320602 BASIC MECHANICAL ENGINEERING")){
                    String Url="https://drive.google.com/uc?export=download&id=1yqJbRnWkw4mqKD1kwJRpmYWGclXmD2VH";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
            }
        });
                recyclerView.setAdapter(cd);
    }

}