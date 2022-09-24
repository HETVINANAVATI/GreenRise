package com.example.greenify;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myadapter extends FirebaseRecyclerAdapter<Model,myadapter.myViewHolder> {

    public myadapter(@NonNull FirebaseRecyclerOptions<Model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull Model model) {
        holder.nametext.setText(model.getName());
        holder.coursetext.setText(model.getAbout());
        holder.price.setText(String.valueOf(model.getPrice()));
        holder.quantity.setText(String.valueOf(model.getQuantity()));
        Glide.with(holder.img1.getContext()).load(model.getImage()).into(holder.img1);
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerowdesign,parent,false);
        return new myViewHolder(view);
    }

    public class myViewHolder extends RecyclerView.ViewHolder
    {
        ImageView img1;
        TextView  nametext,coursetext,price,quantity;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            img1=itemView.findViewById(R.id.img1);
            nametext=itemView.findViewById(R.id.nametext);
            coursetext=itemView.findViewById(R.id.coursetext);
            price=itemView.findViewById(R.id.price);
            quantity=itemView.findViewById(R.id.quantity);
        }
    }
}
