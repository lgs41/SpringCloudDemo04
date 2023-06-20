package com.lgs.service;

import com.lgs.dao.UserDao;

import com.lgs.openfeign.RoleCenterOpenFeign;
import com.lgs.pojo.Role;
import com.lgs.pojo.UserQuery;
import com.lgs.pojo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

/**
 * @ClassName: UserService
 * @Auther: lgs
 * @Description:
 * @DateTime: 2023/6/16 9:04
 **/
@Service
public class UserService {
    @Autowired(required = false)
    private UserDao userDao;
//    public List<UserVo> getAllUsers() {
//        return userDao.getAllUsers();
//    }

    @Autowired
    private RoleCenterOpenFeign roleCenterOpenFeign;

    public List<UserVo> getUserForPage(UserQuery userQuery) {

        //不能加LoadBalanced注解
        List<UserVo> userVoList=userDao.getAllUsers();
        RestTemplate restTemplate = new RestTemplate();
//        System.err.println(url);

        for(UserVo userVo : userVoList){
            Role role = roleCenterOpenFeign.getRoleById(userVo.getRoleId());

//            Role role=restTemplate.getForObject("http://localhost:8082/role/getRoleById/{id}",Role.class,userVo.getRoleId());

            userVo.setRoleName(role.getName());
        }

        return userVoList;
    }

}
