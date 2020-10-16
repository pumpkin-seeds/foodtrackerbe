package com.foodtrackerbe.foodtrackerbe;

public class FoodInfo {
    private int foodId, nutritionId;
    private String foodDescription, servingSize, nutritionName;
    private double nutritionAmount;

    public FoodInfo(int foodId, int nutritionId, String foodDescrString, String servingSize, String nutritionName,
            double nutritionAmount) {
        this.foodId = foodId;
        this.nutritionId = nutritionId;
        this.foodDescription = foodDescrString;
        this.servingSize = servingSize;
        this.nutritionName = nutritionName;
        this.nutritionAmount = nutritionAmount;
    }

    @Override
    public String toString() {
        return String.format(
                "FoodInfo[foodId=%d, nutritionId='%s', foodDescription='%s', servingSize='%s', nutritionHome='%s', nutritionAmount='%s']",
                foodId, nutritionId, foodDescription, servingSize, nutritionName, nutritionAmount);
    }
}
