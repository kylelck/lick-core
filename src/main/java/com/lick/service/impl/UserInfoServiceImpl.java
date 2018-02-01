package com.lick.service.impl;

import com.lick.dal.UserInfoDao;
import com.lick.model.UserInfo;
import com.lick.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description：
 * @author: lick
 * @date: 2018年01月15日 15:47
 * @copyright: 版权归 lick 所有
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo getUserInfo(String userCode){
        return userInfoDao.getUserInfo(userCode);
    }
}
