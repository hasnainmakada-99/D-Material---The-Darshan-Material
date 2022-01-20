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

public class Computer_Sem4_cn_guj extends AppCompatActivity {
    RecyclerView recyclerView;
    JSONArray result;
    ArrayList<String> Unit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem4_cn_guj);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Computer Networks"+"</font>"));
        recyclerView=findViewById(R.id.recycle_view);
        Unit=new ArrayList<String>();
        Get_Unit_Name();
    }

    public void Get_Unit_Name(){
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH25, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY25);
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
                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME25));
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
                if(arrayList.get(position).equals("Unit 1 - Basics Of Computer Network")){
                    String Url="https://drive.google.com/file/d/1bKYgGH04-sAduEV_7pZocjDiNM7dhX-s/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).contains("Unit 2 - The Reference Model for Network Communication")) {
                    String Url = "https://drive.google.com/file/d/1jJgaDfKqZqQFFGNlstscsV1S4GM5dpKR/view?usp=sharing";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 3 - Transmission Media")){
                    String Url="https://drive.google.com/file/d/1A2B9dvmzvciyY6bjtc7crGrMI0Ansh-E/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 4 - Network Devices")){
                    String Url="https://drive.google.com/file/d/1FHiyDJbAfaO4higupqdJnSQF3OS6XDRb/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).contains("Unit 5 - IP Protocol and Network Applications")){
                    String Url="https://drive.google.com/file/d/18xVmQqS4Y0nwfKAD8ohQfZwPIM6e-3lO/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

            }

            @Override
            public void onbutton3click(ArrayList<String> arrayList, int position) {
                if(arrayList.get(position).equals("Unit 1 - Basics Of Computer Network")){
                    String Url="https://drive.google.com/uc?export=download&id=1bKYgGH04-sAduEV_7pZocjDiNM7dhX-s";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).contains("Unit 2 - The Reference Model for Network Communication")) {
                    String Url = "https://drive.google.com/uc?export=download&id=1jJgaDfKqZqQFFGNlstscsV1S4GM5dpKR";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 3 - Transmission Media")){
                    String Url="https://drive.google.com/uc?export=download&id=1A2B9dvmzvciyY6bjtc7crGrMI0Ansh-E";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 4 - Network Devices")){
                    String Url="https://drive.google.com/uc?export=download&id=1FHiyDJbAfaO4higupqdJnSQF3OS6XDRb";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).contains("Unit 5 - IP Protocol and Network Applications")){
                    String Url="https://drive.google.com/uc?export=download&id=18xVmQqS4Y0nwfKAD8ohQfZwPIM6e-3lO";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
            }
        });
        recyclerView.setAdapter(cd2);
    }
}