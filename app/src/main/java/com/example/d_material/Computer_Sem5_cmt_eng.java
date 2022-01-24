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

public class Computer_Sem5_cmt_eng extends AppCompatActivity {
    RecyclerView recyclerView;
    JSONArray result;
    ArrayList<String> Unit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem5_cmt_eng);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Computer Maintenance and TroubleShooting"+"</font>"));
        recyclerView=findViewById(R.id.recycle_view);
        Unit=new ArrayList<String>();
        Get_Unit_Name();
    }

    public void Get_Unit_Name(){
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH30, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY30);
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
                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME30));
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
                if(arrayList.get(position).contains("Unit 1 - Inside the PC: Core Components")){
                    String Url="https://drive.google.com/file/d/1nIWtybbHsQMLDdI68F6RI5gdIDHjscQl/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).contains("Unit 2 - Hard Disk Drive and Controller, DVD Drives")) {
                    String Url = "https://drive.google.com/file/d/16Fus-P5aRiqJ_IlaJHw4Nrzh_l0jyn0k/view?usp=sharing";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("Unit 3 - Input Devices and Printers")){
                    String Url="https://drive.google.com/file/d/1rGAIGY63_42zX4LNtNrg4I8ufFchW-LL/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("Unit 4 - Monitor and Display Adapters")){
                    String Url="https://drive.google.com/file/d/1dQ8-crkuXIwd9pRpLd4sWtNCbnoeJR42/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).contains("Unit 5 - Trouble Shooting and Preventive Maintenance")){
                    String Url="https://drive.google.com/file/d/1T4CAldcCON7-JN2JzKhInXrHpl19WN9d/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

            }

            @Override
            public void onbutton3click(ArrayList<String> arrayList, int position) {
                if(arrayList.get(position).contains("Unit 1 - Inside the PC: Core Components")){
                    String Url="https://drive.google.com/uc?export=download&id=1nIWtybbHsQMLDdI68F6RI5gdIDHjscQl";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).contains("Unit 2 - Hard Disk Drive and Controller, DVD Drives")) {
                    String Url = "https://drive.google.com/uc?export=download&id=16Fus-P5aRiqJ_IlaJHw4Nrzh_l0jyn0k";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("Unit 3 - Input Devices and Printers")){
                    String Url="https://drive.google.com/uc?export=download&id=1rGAIGY63_42zX4LNtNrg4I8ufFchW-LL";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).contains("Unit 4 - Monitor and Display Adapters")){
                    String Url="https://drive.google.com/uc?export=download&id=1dQ8-crkuXIwd9pRpLd4sWtNCbnoeJR42";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).contains("Unit 5 - Trouble Shooting and Preventive Maintenance")){
                    String Url="https://drive.google.com/uc?export=download&id=1T4CAldcCON7-JN2JzKhInXrHpl19WN9d";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

            }
        });
        recyclerView.setAdapter(cd2);
    }
}