package com.application.models;

public class RecipeModel {
    private String id;
    private String title;
    private String category;
    private String difficulty;
    private String cost;
    private int preparation;
    private int cooking;
    private int doses;

    public RecipeModel() {
    }

    public RecipeModel(
            String id,
            String title,
            String category,
            String difficulty,
            String cost,
            int preparation,
            int cooking,
            int doses
    ) {
        super();
        this.id = id;
        this.title = title;
        this.category = category;
        this.difficulty = difficulty;
        this.cost = cost;
        this.preparation = preparation;
        this.cooking = cooking;
        this.doses = doses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getPreparation() {
        return preparation;
    }

    public void setPreparation(int preparation) {
        this.preparation = preparation;
    }

    public int getCooking() {
        return cooking;
    }

    public void setCooking(int cooking) {
        this.cooking = cooking;
    }

    public int getDoses() {
        return doses;
    }

    public void setDoses(int doses) {
        this.doses = doses;
    }
}