package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

public class RecyclerActivity extends AppCompatActivity {
    public static String TAG = RecyclerActivity.class.getSimpleName();

    String[] countries = new String[]{"Russia","Ukraine","Uk","Germany","US","China"}; //data = plug

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"creating");
        setContentView(R.layout.activity_recycler);
        RecyclerView countriesRecyclerView = findViewById(R.id.countriesRview); //socket
        CountriesAdapter adapter = new CountriesAdapter(countries);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        countriesRecyclerView.setLayoutManager(layoutManager);
        countriesRecyclerView.setAdapter(adapter);
    }

    @Override // activity is visible to the user
    protected void onStart() {
        super.onStart();
        Log.w(TAG,"starting");

    }

    @Override //activity comes to foreground-waj=kin up
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"resuming");

    }

    @Override //activity goes to background- about to sleep
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"pausing");

    }

    @Override //activity moved out of the ram into the hdd--hibernate windows
    protected void onStop() {
        super.onStop();
        Log.v(TAG,"stop");

    }

    @Override //activity doesn't exist in ram/storage
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"stop");

    }
}