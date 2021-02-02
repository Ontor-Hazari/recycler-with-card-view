package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nametext ;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

         nametext = (TextView) itemView.findViewById(R.id.textextra);

    }
}
