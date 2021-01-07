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
        try {
            List<FoodInfo> res = jdbcTemplate.query("SELECT * From FoodInfo WHERE FdcId = '" + id + "';",
            new FoodInfoRowMapper());
            return res;
        } catch (Exception e) {
            throw new RuntimeException("Failure when connecting to DB. Check the service log for more details.");
        }
    }

    @Override
    public List<FoodInfo> searchFoodByName(String name) {
        log.info("Getting Food Info where food name contains: {}", name);
        try {
            List<FoodInfo> res = jdbcTemplate.query("SELECT * From FoodInfo WHERE FoodDescription LIKE '%" + name + "%';",
                    new FoodInfoRowMapper());
            return res;
        } catch (Exception e) {
            throw new RuntimeException("Failure when connecting to DB. Check the service log for more details.");
        }
    }

    @Override
    public List<FoodInfo> getCommonFoods(String userId, int topN) {
        log.info("Getting Common Food comsumed by user id: {}", userId);
        try {
            List<FoodInfo> foodRes = jdbcTemplate
                    .query("SELECT * FROM UsdaFoodDB.dbo.FoodInfo WHERE FdcId IN (SELECT TOP " + topN
                            + " FdcId FROM UsdaFoodDB.dbo.UserRecord WHERE UserId ='" + userId
                            + "' GROUP BY FdcId ORDER BY COUNT(FdcId) DESC);", new FoodInfoRowMapper());
            return foodRes;
        } catch (Exception e) {
            throw new RuntimeException("Failure when connecting to DB. Check the service log for more details.");
        }
    }
}
