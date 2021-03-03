package com.example.foodrecipe;

public class FoodRecipe {
    private String title;
    private String briefDescription;
    private String procedure;

    public FoodRecipe(String title, String briefDescription, String procedure) {
        this.title = title;
        this.briefDescription = briefDescription;
        this.procedure = procedure;
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
