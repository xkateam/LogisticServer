package com.hp.service;

import com.hp.pojo.UserInfo;

public interface UserInfoService {

    UserInfo selectById(String userId);
}
