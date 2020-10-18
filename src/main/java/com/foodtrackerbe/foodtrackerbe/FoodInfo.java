package com.foodtrackerbe.foodtrackerbe;

public class FoodInfo {
    private int foodId, nutritionId;
    private String foodDescription, servingSize, nutritionName;
    private double nutritionAmount;

    public FoodInfo() {
    }

    public int getFoodId() {
        return this.foodId;
    }

    public String getFoodDescription() {
        return this.foodDescription;
    }

    public String getServingSize() {
        return this.servingSize;
    }

    public int getNutritionId() {
        return this.nutritionId;
    }

    public String getNutritionName() {
        return this.nutritionName;
    }

    public double getNutritionAmount() {
        return this.nutritionAmount;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public void setNutritionId(int nutritionId) {
        this.nutritionId = nutritionId;
    }

    public void setFoodDescription(String foodDescrString) {
        this.foodDescription = foodDescrString;
    }

    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    public void setNutritionName(String nutritionName) {
        this.nutritionName = nutritionName;
    }

    public void setNutritionAmount(double nutritionAmount) {
        this.nutritionAmount = nutritionAmount;
    }

    @Override
    public String toString() {
        return String.format(
                "FoodInfo[foodId=%d, nutritionId='%s', foodDescription='%s', servingSize='%s', nutritionHome='%s', nutritionAmount='%s']",
                foodId, nutritionId, foodDescription, servingSize, nutritionName, nutritionAmount);
    }
}
