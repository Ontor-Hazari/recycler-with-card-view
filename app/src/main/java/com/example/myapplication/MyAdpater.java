package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdpater extends RecyclerView.Adapter<MyViewHolder> {

     Context context;
     ArrayList<String> cityname;

    public MyAdpater(Context context,ArrayList<String> cityname) {

        this.context = context;
        this.cityname = cityname;


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.customdesgin,parent,false);

        MyViewHolder VH = new MyViewHolder(v);

        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

          holder.nametext.setText(cityname.get(position));

          holder.itemView.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  String value = cityname.get(position);
                  Toast.makeText(context,value,Toast.LENGTH_LONG).show();

              }
          });
    }

    @Override
    public int getItemCount() {
        return cityname.size();
    }
}
