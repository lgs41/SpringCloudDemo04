package com.lgs.dao;

import com.lgs.pojo.User;
import com.lgs.pojo.UserQuery;
import com.lgs.pojo.UserVo;

import java.util.List;

/**
 * @ClassName: UserDao
 * @Auther: lgs
 * @Description:
 * @DateTime: 2023/6/16 9:05
 **/
public interface UserDao {

    List<UserVo> getAllUsers();

    User getUserInfoById(Integer id);

    List<UserVo> getUserForPage(UserQuery userQuery);
}
