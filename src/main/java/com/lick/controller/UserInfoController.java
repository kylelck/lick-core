package com.lick.controller;

import com.alibaba.fastjson.JSONObject;
import com.lick.api.UserInfoApi;
import com.lick.service.UserInfoService;
import com.lick.vo.UserInfoReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description：
 * @author: lick@hsyuntai.com
 * @date: 2018年01月15日 16:19
 * @copyright: 版权归hsyuntai 所有
 */
@RestController
public class UserInfoController implements UserInfoApi {
    private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);
    @Autowired
    private UserInfoService userInfoService;

    @Override
    public String getUserInfo(@RequestBody UserInfoReq userInfoReq){
        logger.info("get user info :{}",userInfoReq.getUserCode());
        return JSONObject.toJSONString(userInfoService.getUserInfo(userInfoReq.getUserCode()));
    }
}
