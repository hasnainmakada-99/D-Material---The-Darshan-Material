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

public class Computer_Sem_3_Cpp_Gujarati extends AppCompatActivity {
    RecyclerView recyclerView;
    JSONArray result;
    ArrayList<String> Unit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem3_cpp_gujarati);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Programming in C++"+"</font>"));
        recyclerView=findViewById(R.id.recycle_view);
        Unit=new ArrayList<String>();
        Get_Unit_Name();
    }

    public void Get_Unit_Name(){
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH14, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY14);
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
                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME14));
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
                if(arrayList.get(position).equals("Unit 1 - Principles of Object Oriented Programming")){
                    String Url="https://drive.google.com/file/d/1tXCFcdnAUygUPGsZyJtQqMJiEl_T8vGH/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).equals("Unit 2 - Functions in C++ and Working with objects")) {
                    String Url = "https://drive.google.com/file/d/1uF54UIFRo2prhBXsrpCI91bU-mqkKHTW/view?usp=sharing";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 3 - Constructor and Destructor")){
                    String Url="https://drive.google.com/file/d/18OL5ePPC-YmsCH1ddFcPKyI3zdQ4d5KP/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 4 - Inheritance")){
                    String Url="https://drive.google.com/file/d/1-GW7-LgaS_qeSLfJGmjDPCYtksV8Grkn/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).equals("Unit 5 - Pointers, Virtual functions and Polymorphism")){
                    String Url="https://drive.google.com/file/d/1QJXG6eoNY3AsOz7nyhjjpHBDzAKrttek/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).equals("Unit 6 - Managing Console I/O Operations")){
                    String Url="https://drive.google.com/file/d/1LdJQjKaiaudsK-BFhU61Cl7c74nAuBae/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

            }

            @Override
            public void onbutton3click(ArrayList<String> arrayList, int position) {
                if(arrayList.get(position).equals("Unit 1 - Principles of Object Oriented Programming")){
                    String Url="https://drive.google.com/uc?export=download&id=1tXCFcdnAUygUPGsZyJtQqMJiEl_T8vGH";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).equals("Unit 2 - Functions in C++ and Working with objects")) {
                    String Url = "https://drive.google.com/uc?export=download&id=1uF54UIFRo2prhBXsrpCI91bU-mqkKHTW";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 3 - Constructor and Destructor")){
                    String Url="https://drive.google.com/uc?export=download&id=18OL5ePPC-YmsCH1ddFcPKyI3zdQ4d5KP";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 4 - Inheritance")){
                    String Url="https://drive.google.com/uc?export=download&id=1-GW7-LgaS_qeSLfJGmjDPCYtksV8Grkn";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).equals("Unit 5 - Pointers, Virtual functions and Polymorphism")){
                    String Url="https://drive.google.com/uc?export=download&id=1QJXG6eoNY3AsOz7nyhjjpHBDzAKrttek";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).equals("Unit 6 - Managing Console I/O Operations")){
                    String Url="https://drive.google.com/uc?export=download&id=1LdJQjKaiaudsK-BFhU61Cl7c74nAuBae";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }


            }
        });
        recyclerView.setAdapter(cd2);
    }
}