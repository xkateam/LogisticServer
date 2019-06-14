package com.hp.mapper;

import com.hp.pojo.UserInfo;

public interface UserInfoDao {
    UserInfo selectById(String userId);
}
