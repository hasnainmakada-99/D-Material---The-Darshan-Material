package com.example.d_material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Objects;

public class Computer_Sem_3_OS_English extends AppCompatActivity {
    RecyclerView recyclerView;
    JSONArray result;
    ArrayList<String> Unit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_sem3_os_english);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color=\"#173884\">" +"Operating System"+"</font>"));
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
    public void Fetch_Unit_Name(JSONArray jo) {
        for (int i = 0; i < jo.length(); i++) {
            try {
                JSONObject j = jo.getJSONObject(i);
                Unit.add(j.getString(Fetch_Database_D_Material.URL_TAG_NAME8));
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
                if(arrayList.get(position).equals("Unit 1 - Operating System Concepts")){
                    String Url="https://drive.google.com/file/d/1UqS_TyWV-dJsVOMya4V0sfejV7vwIWtO/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).equals("Unit 2 - Processor and Process Management")) {
                    String Url = "https://drive.google.com/file/d/1F4kPMksVeEBXvTFWQAu_2gQmK4wpVzXX/view?usp=sharing";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 3 - Memory Management")){
                    String Url="https://drive.google.com/file/d/1sDYMg410yWAcWQsqjM5oYs1ZQo6ynT6K/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                else if(arrayList.get(position).equals("Unit 4 - File and Disk Management")){
                    String Url="https://drive.google.com/file/d/1Vxgu3tUqOMf7CDqV8XleCJYXIF1OEvJY/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                else if(arrayList.get(position).equals("Unit 5 - Linux and Shell Programming")){
                    String Url="https://drive.google.com/file/d/1VeUAotEcIErf5jTM8oXr3t-9C1Ad_DCF/view?usp=sharing";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

            }

            @Override
            public void onbutton3click(ArrayList<String> arrayList, int position) {
                    if(arrayList.get(position).equals("Unit 1 - Operating System Concepts")){
                        String Url="https://drive.google.com/uc?export=download&id=1UqS_TyWV-dJsVOMya4V0sfejV7vwIWtO";
                         Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(Url));
                    startActivity(intent);
                    }

                    else if(arrayList.get(position).equals("Unit 2 - Processor and Process Management")) {
                        String Url = "https://drive.google.com/uc?export=download&id=1F4kPMksVeEBXvTFWQAu_2gQmK4wpVzXX";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(Url));
                        startActivity(intent);
                    }
                    else if(arrayList.get(position).equals("Unit 3 - Memory Management")){
                    String Url="https://drive.google.com/uc?export=download&id=1sDYMg410yWAcWQsqjM5oYs1ZQo6ynT6K";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }
                    else if(arrayList.get(position).equals("Unit 4 - File and Disk Management")){
                     String Url="https://drive.google.com/uc?export=download&id=1Vxgu3tUqOMf7CDqV8XleCJYXIF1OEvJY";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }

                    else if(arrayList.get(position).equals("Unit 5 - Linux and Shell Programming")){
                    String Url="https://drive.google.com/uc?export=download&id=1VeUAotEcIErf5jTM8oXr3t-9C1Ad_DCF";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(Url));
                    startActivity(intent);
                }


            }
        });
        recyclerView.setAdapter(cd2);
    }
}