package com.foodtrackerbe.foodtrackerbe;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class FoodInfoDaoImpl implements FoodInfoDao<FoodInfo> {

    private static final Logger log = LoggerFactory.getLogger(FoodInfoDaoImpl.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<FoodInfo> getFoodNutritions(int id) {
        log.info("Getting Food Info where food id is: {}", id);
        List<FoodInfo> res = jdbcTemplate.query("SELECT * From FoodInfo WHERE FdcId = '" + id + "';",
                new FoodInfoRowMapper());
        return res;
    }

    @Override
    public List<FoodInfo> searchFoodByName(String name) {
        log.info("Getting Food Info where food name contains: {}", name);
        List<FoodInfo> res = jdbcTemplate.query("SELECT * From FoodInfo WHERE FoodDescription LIKE '%" + name + "%';",
                new FoodInfoRowMapper());
        return res;
    }
}
