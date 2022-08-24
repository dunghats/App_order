package com.example.app_order;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.app_order.Adapter.CategoryAdapter;
import com.example.app_order.Adapter.RecommendedAdapter;
import com.example.app_order.Domain.CategoryDomain;
import com.example.app_order.Domain.FoodDomain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter, adapter2;
    private RecyclerView recyclerViewCategotyList, recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategoty();
        recyclerViewPopular();
    }

    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList=findViewById(R.id.view2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodList = new ArrayList<>();
        foodList.add(new FoodDomain("1 piza", "cat1","1,2,3,4,5,",15.0,23,11,2000 ));
        foodList.add(new FoodDomain("2 piza", "cat1","1,2,3,4,5,",14.0,22,12,1000 ));
        foodList.add(new FoodDomain("3 piza", "cat1","1,2,3,4,5,",13.0,21,13,3000 ));

        adapter2=new RecommendedAdapter(foodList);
        recyclerViewPopularList.setAdapter(adapter2);
    }

    private void recyclerViewCategoty() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategotyList=findViewById(R.id.view1);
        recyclerViewCategotyList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categoryList = new ArrayList<>();
        categoryList.add(new CategoryDomain("piza", "cat1"));
        categoryList.add(new CategoryDomain("piza", "cat2"));
        categoryList.add(new CategoryDomain("piza", "cat3"));
        categoryList.add(new CategoryDomain("piza", "cat4"));
        categoryList.add(new CategoryDomain("piza", "cat5"));

        adapter=new  CategoryAdapter(categoryList);
        recyclerViewCategotyList.setAdapter(adapter);
    }
}