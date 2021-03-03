package com.example.foodrecipe;

import java.util.ArrayList;

public class FoodRecipe {
    private String title;
    private String briefDescription;
    private ArrayList<String> ingredients;
    private String procedure;

    public FoodRecipe(String title, String briefDescription, ArrayList<String> ingredients, String procedure) {
        this.title = title;
        this.briefDescription = briefDescription;
        this.ingredients = ingredients;
        this.procedure = procedure;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    public String getProcedure() {
        return this.procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }
}
