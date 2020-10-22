package com.foodtrackerbe.foodtrackerbe;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserInfoDaoImpl implements UserInfoDao {

    private static final Logger log = LoggerFactory.getLogger(UserInfoDaoImpl.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    // Notes about date:
    // In the BE we use LocalDate(no timezone). When we connect to DB, write or read
    // we convert LocalDate to java.sql.Date so we can read and write directly

    @Override
    public List<UserInfo> getUserInfo(LocalDate date, String userId) {
        Date sqlDate = Date.valueOf(date);
        log.info("Getting user info given date of {} and userId of {}", sqlDate, userId);
        List<UserInfo> res = jdbcTemplate.query(
                "SELECT * From UserRecord WHERE RecordDate = '" + date + "' AND UserId = '" + userId + "';",
                new UserInfoRowMapper());
        return res;
    }

    // Save a list of user info to DB
    @Override
    public void updateUserInfo(List<UserInfo> list) {
        if (list.size() == 0)
            return;
        Date sqlDate = Date.valueOf(list.get(0).getRecordDate());
        // First delete old record if any
        jdbcTemplate.update("DELETE FROM UserRecord WHERE RecordDate = ? AND UserId = ?;", sqlDate,
                list.get(0).getUserId());
        for (UserInfo info : list) {
            log.info("Saving user info: date of {}; userId of {}; foodId of {}; quantity of {};", sqlDate,
                    info.getUserId(), info.getFoodId(), info.getQuantity());
            // Insert new record for a user and a date
            jdbcTemplate.update("INSERT INTO UserRecord (UserId, RecordDate, FdcId, Quantity) VALUES (?, ?, ?, ?)",
                    info.getUserId(), sqlDate, info.getFoodId(), info.getQuantity());
        }
    }

}
