package com.example.app_order.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.app_order.Domain.CategoryDomain;
import com.example.app_order.R;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    ArrayList<CategoryDomain> categoryDomains;

    public CategoryAdapter(ArrayList<CategoryDomain> categoryDomains) {
        this.categoryDomains = categoryDomains;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_category,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {
        holder.categoryName.setText(categoryDomains.get(position).getTitle());
        String picUrl="";
        switch (position){
            case 0: {
                picUrl = "cat1";
                break;
            }
            case 1: {
                picUrl = "cat2";
                break;
            }
            case 2: {
                picUrl = "cat3";
                break;
            }
            case 3: {
                picUrl = "cat4";
                break;
            }
            case 4: {
                picUrl = "cat5";
                break;
            }
        }
        int drawableReourceId=holder.itemView.getContext().getResources()
                .getIdentifier(picUrl,"drawable",holder.itemView.getContext().getOpPackageName());
        Glide.with(holder.itemView.getContext())
                .load(drawableReourceId)
                .into(holder.categoryPic);
    }

    @Override
    public int getItemCount() {return categoryDomains.size();}
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView categoryName;
        ImageView categoryPic;
        ConstraintLayout mainlayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryName=itemView.findViewById(R.id.categoryName);
            categoryPic=itemView.findViewById(R.id.categoryPic);
            mainlayout=itemView.findViewById(R.id.mainlayout);
        }
    }
}
