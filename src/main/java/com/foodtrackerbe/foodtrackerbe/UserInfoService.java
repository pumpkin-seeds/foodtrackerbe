package com.foodtrackerbe.foodtrackerbe;

import java.time.LocalDate;
import java.util.List;

public interface UserInfoService {

    public abstract List<UserInfo> getUserInfo(LocalDate date, String userId);

    public abstract void saveUserInfo(List<UserInfo> list);
}
