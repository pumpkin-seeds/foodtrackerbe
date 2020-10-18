package com.foodtrackerbe.foodtrackerbe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    @Autowired
    FoodInfoDaoImpl foodInfoDao;

    // @RequestMapping("/")
    // public int greeting() {
    // return foodInfoDao.getCount(3);
    // }

    @RequestMapping("/")
    public List<FoodInfo> getFoodInfoList() {
        return foodInfoDao.getFoodNutritions(319877);
    }
}
