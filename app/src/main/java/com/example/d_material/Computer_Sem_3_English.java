package com.example.d_material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
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

public class Computer_Sem_3_English extends AppCompatActivity {
//ListView listView;
//JSONArray result;
    RecyclerView recyclerView;
ArrayList<String> Subject_Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem3_english);
      //  listView=findViewById(R.id.units);
        Subject_Name=new ArrayList<String>();
        //Get_Subjects_Name();
        Subject_Name.add("Hasnain");
        Subject_Name.add("Kamil");
        Subject_Name.add("Hasnain123");
        recyclerView=findViewById(R.id.recycle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        Custom_Adapter ad=new Custom_Adapter(Subject_Name);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL));
    }

//   public void Get_Subjects_Name(){StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH5, new Response.Listener<String>() {
//       @Override
//       public void onResponse(String response) {
//           try{
//               JSONObject jsonObject=new JSONObject(response);
//               result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY5);
//               Fetch_Subject_Name(result);
//           }
//           catch (Exception e){
//               e.printStackTrace();
//           }
//       }
//   }, new Response.ErrorListener() {
//       @Override
//       public void onErrorResponse(VolleyError error) {
//
//       }
//   });
//       RequestQueue requestQueue= Volley.newRequestQueue(this);
//       requestQueue.add(stringRequest);
//    }
//    public void Fetch_Subject_Name(JSONArray jo){
//        for (int i = 0; i <jo.length() ; i++) {
//            try {
//                JSONObject j = jo.getJSONObject(i);
//                Subject_Name.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME5));
//            }
//            catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, Subject_Name);
//        listView.setAdapter(arrayAdapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                if(listView.getItemAtPosition(i).toString().equals("3330701 - OPERATING SYSTEM")){
//                    Intent intent=new Intent(getApplicationContext(), Computer_Sem_3_OS_English.class);
//                    startActivity(intent);
//                }
//                else if(listView.getItemAtPosition(i).toString().equals("3330702 - PROGRAMMING IN C++")){
//                    Intent intent=new Intent(getApplicationContext(), Computer_Sem_3_CPP_English.class);
//                    startActivity(intent);
//                }
//            }
//        });
//    }

}