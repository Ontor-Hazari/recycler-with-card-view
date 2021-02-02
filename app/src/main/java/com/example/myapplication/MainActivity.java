package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> cityname = new ArrayList<>(Arrays.asList("Dhaka","Chittagong","Sylhet",
            "Barishal","Khulna","Rangpur","Rajshahi"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       RecyclerView RV = (RecyclerView)findViewById(R.id.recyclerview);
       RV.setLayoutManager(new LinearLayoutManager(this));

       MyAdpater adpater = new MyAdpater(this,cityname);

       RV.setAdapter(adpater);



    }
}