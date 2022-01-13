package com.example.d_material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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

public class Computer_Sem_3_OS_English extends AppCompatActivity {
//    ListView listView;
    RecyclerView recyclerView;
    JSONArray result;
    ArrayList<String> Unit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem3_os_english);
//        listView=findViewById(R.id.recycle_view);
        recyclerView=findViewById(R.id.recyclerview);
        Unit=new ArrayList<String>();
        Get_Unit_Name();
    }

    public void Get_Unit_Name(){
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH8, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY8);
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
    public void Fetch_Unit_Name(JSONArray jo){
        for (int i = 0; i <jo.length() ; i++) {
            try {
                JSONObject j = jo.getJSONObject(i);
                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME8));
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
//        ArrayAdapter arrayAdapter=new ArrayAdapter (getApplicationContext(), android.R.layout.simple_list_item_1, Unit);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
       Custom_Adapter2 cd2=new Custom_Adapter2(Unit, (arrayList, position) -> {
           if(arrayList.get(position).equals("Unit 1 - Operating System Concepts (English)")){
                String Url="https://drive.google.com/file/d/1UqS_TyWV-dJsVOMya4V0sfejV7vwIWtO/view?usp=sharing";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(Url));
                startActivity(intent);
            }
       });
        recyclerView.setAdapter(cd2);
//        recyclerView.setAdapter(cd2);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                if(listView.getItemAtPosition(i).toString().equals("Unit 1 - Operating System Concepts (English)")){
//                    String Url="https://drive.google.com/file/d/1UqS_TyWV-dJsVOMya4V0sfejV7vwIWtO/view?usp=sharing";
//                    Intent intent=new Intent(Intent.ACTION_VIEW);
//                    intent.setData(Uri.parse(Url));
//                    startActivity(intent);
//                }
//                else if(listView.getItemAtPosition(i).toString().equals("Unit 2 - Processor and Process Management (English)")){
//                    String Url="https://drive.google.com/file/d/1F4kPMksVeEBXvTFWQAu_2gQmK4wpVzXX/view?usp=sharing";
//                    Intent intent=new Intent(Intent.ACTION_VIEW);
//                    intent.setData(Uri.parse(Url));
//                    startActivity(intent);
//                }
//
//                else if(listView.getItemAtPosition(i).toString().equals("Unit 3 - Memory Management (English)")){
//                    String Url="https://drive.google.com/file/d/1sDYMg410yWAcWQsqjM5oYs1ZQo6ynT6K/view?usp=sharing";
//                    Intent intent=new Intent(Intent.ACTION_VIEW);
//                    intent.setData(Uri.parse(Url));
//                    startActivity(intent);
//                }
//                else if(listView.getItemAtPosition(i).toString().equals("Unit 4 - File and Disk Management (English)")){
//                    String Url="https://drive.google.com/file/d/1Vxgu3tUqOMf7CDqV8XleCJYXIF1OEvJY/view?usp=sharing";
//                    Intent intent=new Intent(Intent.ACTION_VIEW);
//                    intent.setData(Uri.parse(Url));
//                    startActivity(intent);
//                }
//                else if(listView.getItemAtPosition(i).toString().equals("Unit 5 - Linux and Shell Programming (English)")){
//                    String Url="https://drive.google.com/file/d/1VeUAotEcIErf5jTM8oXr3t-9C1Ad_DCF/view?usp=sharing";
//                    Intent intent=new Intent(Intent.ACTION_VIEW);
//                    intent.setData(Uri.parse(Url));
//                    startActivity(intent);
//                }
//            }
//        });
    }
}