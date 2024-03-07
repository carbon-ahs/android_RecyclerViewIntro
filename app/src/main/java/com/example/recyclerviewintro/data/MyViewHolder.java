package com.example.recyclerviewintro.data;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewintro.R;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView nameTV;
    TextView phnNumberTV;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        nameTV = itemView.findViewById(R.id.nameTV);
        phnNumberTV = itemView.findViewById(R.id.phnNumberTV);


    }
}
