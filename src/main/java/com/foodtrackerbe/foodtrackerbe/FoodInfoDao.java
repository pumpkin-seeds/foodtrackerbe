package com.foodtrackerbe.foodtrackerbe;

import java.util.List;

public interface FoodInfoDao<T> {

    int getCount(int id);

    List<T> getFoodNutritions(int id);

}
