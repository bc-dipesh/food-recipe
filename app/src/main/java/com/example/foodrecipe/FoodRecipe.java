package com.example.foodrecipe;

public class FoodRecipe {
    private String title;
    private String briefDescription;

    public FoodRecipe(String title, String briefDescription) {
        this.title = title;
        this.briefDescription = briefDescription;
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
}
