package com.example.banarsibabu.mr31app;


import android.content.SharedPreferences;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;


// update textview of one fragment from another fragment


public class MainActivity extends AppCompatActivity {

    SharedPreferences mPrefs;
    SharedPreferences.Editor prefsEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Save custom object to Shared Preferences

        mPrefs = getPreferences(MODE_PRIVATE);

        prefsEditor = mPrefs.edit();

        Gson gson = new Gson();
        String json = gson.toJson(new Users());
        prefsEditor.putString("_MyObject", json);
        prefsEditor.commit();

        Log.e("ban", " = " + json);

        Gson gson2 = new Gson();
        String json2 = mPrefs.getString("_MyObject", "aa");
        Users obj = gson2.fromJson(json2, Users.class);

        Log.e("ban", " = " + obj.getName());


        loadFragments();
    }


    private void loadFragments() {

        //fragment2

        Fragment2 fragment2 = new Fragment2();
        // create a FragmentManager
        FragmentManager fm = getSupportFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout2, fragment2);
        fragmentTransaction.commit(); // save the changes


        // fragment1

        Fragment1 fragment1 = new Fragment1();
        // create a FragmentManager
        fragment1.setCallback(fragment2);
        FragmentManager fm1 = getSupportFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction1 = fm1.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction1.replace(R.id.frameLayout1, fragment1);
        fragmentTransaction1.commit(); // save the changes


    }
}
