package com.example.foodrecipe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<FoodRecipe> foodRecipeList = new LinkedList<>();
    private RecyclerView recyclerView;
    private FoodRecipeListAdapter foodRecipeListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // add data
        for (int i = 0; i < 20; i++) {
            FoodRecipe foodRecipe = new FoodRecipe("Lorem Ipsum", "Lorem Ipsum dolor init ... ");
            foodRecipeList.add(foodRecipe);
        }

        // get a handle to the RecyclerView
        recyclerView = findViewById(R.id.recyclerview);
        // create an adapter and supply the data to be displayed
        foodRecipeListAdapter = new FoodRecipeListAdapter(this, foodRecipeList);
        // connect the adapter with the RecyclerView
        recyclerView.setAdapter(foodRecipeListAdapter);
        // give the RecyclerView a default layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}