package com.foodtrackerbe.foodtrackerbe;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    @Autowired
    FoodServiceImpl foodService;

    // example: /food?id=320027
    // example: /food?name=Hummus
    // example: /food => will return empty list
    @RequestMapping(value = "/food", method = RequestMethod.GET)
    public List<FoodInfo> getFoodList(@RequestParam(required = false) Integer id, String name) {
        if (id != null) {
            return foodService.getFoodNutritions(id);
        } else if (name != null) {
            return foodService.searchFoodByName(name);
        }
        return new ArrayList<FoodInfo>();
    }
}
