package com.foodtrackerbe.foodtrackerbe;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserInfoRowMapper implements RowMapper<UserInfo> {

    @Override
    public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserInfo userInfo = new UserInfo();
        userInfo.setRecordId(rs.getInt("RecordId"));
        userInfo.setUserId(rs.getString("UserId"));
        userInfo.setRecordDate((rs.getDate("RecordDate")).toLocalDate());
        userInfo.setFoodId(rs.getInt("FdcId"));
        userInfo.setQuantity(rs.getInt("Quantity"));
        return userInfo;
    }
}
