package com.foodtrackerbe.foodtrackerbe;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class FoodInfoDaoImpl implements FoodInfoDao<FoodInfo> {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int getCount(int id) {
        String sql = "SELECT * FROM FoodInfo";
        List<Map<String, Object>> res = jdbcTemplate.queryForList(sql);
        return res.size();
    }
}
