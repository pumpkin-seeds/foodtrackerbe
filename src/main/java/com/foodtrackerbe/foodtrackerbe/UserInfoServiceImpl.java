package com.foodtrackerbe.foodtrackerbe;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    private static final Logger log = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Autowired
    UserInfoDaoImpl userInfoDao;

    @Override
    public List<UserInfo> getUserInfo(LocalDate date, String userId) {
        log.info("Getting user info given date of: {} and user id of: {}", date, userId);
        return userInfoDao.getUserInfo(date, userId);
    }

    @Override
    public void saveUserInfo(List<UserInfo> list) {
        userInfoDao.updateUserInfo(list);
        log.info("Completed saving/updating user info to DB");
    }

}
