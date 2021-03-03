package com.example.foodrecipe;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class FoodRecipeListAdapter extends RecyclerView.Adapter<FoodRecipeListAdapter.FoodRecipeViewHolder> {

    private final LinkedList<FoodRecipe> foodRecipeList;
    private LayoutInflater layoutInflater;
    private Context context;

    public FoodRecipeListAdapter(Context context, LinkedList<FoodRecipe> foodRecipeList) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        this.foodRecipeList = foodRecipeList;
    }

    @NonNull
    @Override
    public FoodRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View foodRecipeItemView = layoutInflater.inflate(R.layout.food_recipe, parent, false);

        return new FoodRecipeViewHolder(context, foodRecipeItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodRecipeViewHolder holder, int position) {
        FoodRecipe currentFoodRecipe = foodRecipeList.get(position);
        TextView foodRecipeItemTitle = holder.foodRecipeItemView.findViewById(R.id.food_recipe_item_title);
        TextView foodRecipeItemContent = holder.foodRecipeItemView.findViewById(R.id.food_recipe_item_content);

        foodRecipeItemTitle.setText(currentFoodRecipe.getTitle());
        foodRecipeItemContent.setText(currentFoodRecipe.getBriefDescription());
    }

    @Override
    public int getItemCount() {
        return foodRecipeList.size();
    }

    class FoodRecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final View foodRecipeItemView;
        final FoodRecipeListAdapter foodRecipeListAdapter;
        private Context context;

        public FoodRecipeViewHolder(Context context, View view, FoodRecipeListAdapter adapter) {
            super(view);
            this.context = context;
            foodRecipeItemView = view;
            foodRecipeListAdapter = adapter;
            foodRecipeItemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            // launch FoodRecipeDetail Activity
            Intent intent = new Intent(context, FoodRecipeDetail.class);
            context.startActivity(intent);
        }
    }
}
