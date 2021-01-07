package com.foodtrackerbe.foodtrackerbe;

import java.util.List;

public interface FoodService<T> {

    public abstract List<T> getFoodNutritions(int id);

    public abstract List<T> searchFoodByName(String name);

    public abstract List<T> getCommonFoods(String userId, int topN);
}
