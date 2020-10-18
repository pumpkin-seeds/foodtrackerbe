package com.foodtrackerbe.foodtrackerbe;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "foodService")
public class FoodServiceImpl implements FoodService<FoodInfo> {

    private static final Logger log = LoggerFactory.getLogger(FoodInfoDaoImpl.class);

    @Autowired
    FoodInfoDaoImpl foodInfoDao;

    // Get a list of FoodInfo nutritions given a food id
    @Override
    public List<FoodInfo> getFoodNutritions(int id) {
        log.info("Getting a list of food info nutritions given food id: {}", id);
        return foodInfoDao.getFoodNutritions(id);
    }

    // Search and get a list of FoodInfo given a partial food name
    @Override
    public List<FoodInfo> searchFoodByName(String name) {
        log.info("Getting a list of food given food name: {}", name);
        // TODO: optimize search results for fe (limit result numbers, sort by
        // priorities, etc)
        return foodInfoDao.searchFoodByName(name);
    }
}
