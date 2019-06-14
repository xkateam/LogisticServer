package com.hp.service.impl;

import com.hp.mapper.UserInfoDao;
import com.hp.pojo.UserInfo;
import com.hp.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo selectById(String userId) {
        UserInfo userInfo = userInfoDao.selectById(userId);
        return userInfo;
    }
}
