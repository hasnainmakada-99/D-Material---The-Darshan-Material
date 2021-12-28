package com.example.d_material;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner1;
    Spinner spinner2;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"#173884\">" + getString(R.string.app_name)+"</font>"));
        spinner1=findViewById(R.id.Select_Branch);
        spinner2=findViewById(R.id.Select_Sem);
        String branch[]={"Select Branch", "Computer Engineering", "Civil Engineering", "Mechanical Engineering", "Electrical Engineering"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, branch);
        spinner1.setAdapter(arrayAdapter);

        String []semester={"Select Semester", "1", "2", "3", "4", "5", "6"};
        String position = (String) spinner1.getItemAtPosition(1);
        ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, semester);
        spinner2.setAdapter(arrayAdapter1);
        save=findViewById(R.id.Save_Button);
        spinner2.setPrompt("Select Semester");

    }
    public void click_save(View view){
        String branch = (String)spinner1.getSelectedItem().toString();
        String Semester=(String)spinner2.getSelectedItem().toString();
        if(branch.equals("Computer Engineering")){
            if(Semester.equals("1")){
                Intent intent=new Intent(this, computer_sem_1.class);
                startActivity(intent);
            }
//            Intent intent=new Intent(this, Computer_Engineering.class);
//            startActivity(intent);
        }
        else if(branch.equals("Civil Engineering")){
            Intent intent=new Intent(this, activity_Civil_Engineering.class);
            startActivity(intent);
        }
         else if(branch.equals("Mechanical Engineering")){
            Intent intent=new Intent(this, mechanical_engineering.class);
            startActivity(intent);
        }
         else if(branch.equals("Electrical Engineering")){
            Intent intent=new Intent(this, electrical_engineering.class);
            startActivity(intent);
        }
        else if(branch.equals("Select Branch")){
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show();
        }

    }
}