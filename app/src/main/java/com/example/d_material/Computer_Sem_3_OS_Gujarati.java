package com.example.d_material;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Computer_Sem_3_OS_Gujarati extends AppCompatActivity {
    ListView listView;
    JSONArray result;
    ArrayList<String> Unit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem3_os_gujarati);
        listView=findViewById(R.id.recycle_view);
        Unit=new ArrayList<String>();
        Get_Unit_Name();
    }
    public void Get_Unit_Name(){
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH9, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY9);
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
    public void Fetch_Unit_Name(JSONArray jo) {
        for (int i = 0; i < jo.length(); i++) {
            try {
                JSONObject j = jo.getJSONObject(i);
                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME9));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, Unit);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(listView.getItemAtPosition(i).toString().equals("Unit 1 - Operating System Concepts (Gujarati)")){
                    String Url="https://drive.google.com/file/d/1MePKX1y-i-3psbeVU9DI3lnkAwu6Ofv_/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(listView.getItemAtPosition(i).toString().equals("Unit 2 - Processor and Process Management (Gujarati)")){
                    String Url="https://drive.google.com/file/d/187h95ox2U5rnDbbtpia2ma3wK7sL7IyY/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(listView.getItemAtPosition(i).toString().equals("Unit 3 - Memory Management (Gujarati)")){
                    String Url="https://drive.google.com/file/d/1ut4N629HYsUIPy8sWa-GgVbY9Iypp1w5/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(listView.getItemAtPosition(i).toString().equals("Unit 4 - File & Disk Management (Gujarati)")){
                    String Url="https://drive.google.com/file/d/1k5Oa_TPwZiAmbtjU68a9EAWLVXKTutOP/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(listView.getItemAtPosition(i).toString().equals("Unit 5 - Linux and Shell Programming (English)")){
                    String Url="https://drive.google.com/file/d/1VeUAotEcIErf5jTM8oXr3t-9C1Ad_DCF/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
            }
        });
    }
}