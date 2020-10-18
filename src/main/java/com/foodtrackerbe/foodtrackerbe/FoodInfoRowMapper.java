package com.foodtrackerbe.foodtrackerbe;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FoodInfoRowMapper implements RowMapper<FoodInfo> {

    @Override
    public FoodInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
        FoodInfo foodInfo = new FoodInfo();
        foodInfo.setFoodId(rs.getInt("FdcId"));
        foodInfo.setFoodDescription(rs.getString("FoodDescription"));
        foodInfo.setServingSize(rs.getString("ServingSize"));
        foodInfo.setNutritionId(rs.getInt("NutrientId"));
        foodInfo.setNutritionName(rs.getString("NutritionName"));
        foodInfo.setNutritionAmount(rs.getDouble("NutrientAmount"));
        return foodInfo;
    }

}
