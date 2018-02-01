package com.lick.model;

import java.io.Serializable;

/**
 * @description： 用户信息
 * @author: lick
 * @date: 2018年01月15日 15:27
 * @copyright: 版权归lick所有
 */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -2816204240454500771L;
    private String userCode;                              //用户编码
    private String userName;                              //用户名称
    private String userSex;                               //用户性别

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
}
