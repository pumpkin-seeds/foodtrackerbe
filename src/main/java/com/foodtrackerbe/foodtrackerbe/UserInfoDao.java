package com.foodtrackerbe.foodtrackerbe;

import java.time.LocalDate;
import java.util.List;

public interface UserInfoDao {
    List<UserInfo> getUserInfo(LocalDate date, String userId);

    void updateUserInfo(List<UserInfo> list);
}
