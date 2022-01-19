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

public class Computer_Sem3_ds_guj extends AppCompatActivity {
    RecyclerView recyclerView;
    JSONArray result;
    ArrayList<String> Unit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem3_ds_guj);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Data Structures"+"</font>"));
        recyclerView=findViewById(R.id.recycle_view);
        Unit=new ArrayList<String>();
        Get_Unit_Name();
    }

    public void Get_Unit_Name(){
        StringRequest stringRequest=new StringRequest(Fetch_Database_D_Material.URL_PATH16, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    result=jsonObject.getJSONArray(Fetch_Database_D_Material.JSON_ARRAY16);
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
                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME16));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        Custom_Adapter2 cd2 = new Custom_Adapter2(Unit, new Custom_Adapter2.onclickitem() {
            @Override
            public void onitemclick(ArrayList<String> arrayList, int position) {

            }

            @Override
            public void onbutton2click(ArrayList<String> arrayList, int position) {
                if (arrayList.get(position).equals("Unit 1 – Basic Concept of Data Structures")) {
                    String Url = "https://drive.google.com/file/d/1FakM0r5s9dmIVpAg1M2nJwALcLzOE4AW/view?usp=sharing";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                } else if (arrayList.get(position).equals("Unit 2 – Strings")) {
                    String Url = "https://drive.google.com/file/d/1kozZgZItb0sCra0v7k3OALpiD6IQu6yh/view?usp=sharing";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                } else if (arrayList.get(position).equals("Unit 3 – Stack and Queues")) {
                    String Url = "https://drive.google.com/file/d/10k219Zgsw5-mSgs_4sJ2eKU0Bb9xUcut/view?usp=sharing";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                } else if (arrayList.get(position).equals("Unit 4 – Linked List")) {
                    String Url = "https://drive.google.com/file/d/1OyuHRyynY26llQyvk_tPNDrYGNwC50he/view?usp=sharing";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                } else if (arrayList.get(position).contains("Unit 5 – Sorting and Hashing")) {
                    String Url = "https://drive.google.com/file/d/1_Hn53f-fkW6PU35ytLZKjqY91eAx8wOj/view?usp=sharing";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                } else if (arrayList.get(position).contains("Unit 6 – Trees")) {
                    String Url = "https://drive.google.com/file/d/1SLQYwF4yBaJVr8Fdd7dOPZKtD61lSZCp/view?usp=sharing";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
            }

            @Override
            public void onbutton3click(ArrayList<String> arrayList, int position) {
                if (arrayList.get(position).equals("Unit 1 – Basic Concept of Data Structures")) {
                    String Url = "https://drive.google.com/uc?export=download&id=1FakM0r5s9dmIVpAg1M2nJwALcLzOE4AW";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                } else if (arrayList.get(position).equals("Unit 2 – Strings")) {
                    String Url = "https://drive.google.com/uc?export=download&id=1kozZgZItb0sCra0v7k3OALpiD6IQu6yh";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                } else if (arrayList.get(position).equals("Unit 3 – Stack and Queues")) {
                    String Url = "https://drive.google.com/uc?export=download&id=10k219Zgsw5-mSgs_4sJ2eKU0Bb9xUcut";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                } else if (arrayList.get(position).equals("Unit 4 – Linked List")) {
                    String Url = "https://drive.google.com/uc?export=download&id=1OyuHRyynY26llQyvk_tPNDrYGNwC50he";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                } else if (arrayList.get(position).contains("Unit 5 – Sorting and Hashing")) {
                    String Url = "https://drive.google.com/uc?export=download&id=1_Hn53f-fkW6PU35ytLZKjqY91eAx8wOj";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                } else if (arrayList.get(position).contains("Unit 6 – Trees")) {
                    String Url = "https://drive.google.com/uc?export=download&id=1SLQYwF4yBaJVr8Fdd7dOPZKtD61lSZCp";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
            }
        });
        recyclerView.setAdapter(cd2);
    }
}