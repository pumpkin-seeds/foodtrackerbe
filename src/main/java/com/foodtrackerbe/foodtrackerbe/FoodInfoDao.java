package com.foodtrackerbe.foodtrackerbe;

import java.util.List;

public interface FoodInfoDao<T> {

    List<T> getFoodNutritions(int id);

    List<T> searchFoodByName(String name);
}
