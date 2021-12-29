package com.example.d_material;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Session {
    SharedPreferences prefs;
    SharedPreferences.Editor editor;

    public Session(Context context) {
//         TODO Auto-generated constructor stub
//         prefs = getSharedPreferences("MyPref", MODE_PRIVATE);
//        prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public void setusername(String usename) {
        prefs.edit().putString("usename", usename).commit();
    }

    public String getusename() {
        String usename = prefs.getString("usename","");
        return usename;
    }

}
