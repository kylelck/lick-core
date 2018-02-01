package com.lick.dal;

import com.lick.model.UserInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @description：
 * @author: lick
 * @date: 2018年01月15日 15:41
 * @copyright: 版权归 lick 所有
 */
@Repository
public interface UserInfoDao {

    UserInfo getUserInfo(@Value("userCode") String userCode);
}
