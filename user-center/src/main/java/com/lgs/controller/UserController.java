package com.lgs.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lgs.pojo.UserQuery;
import com.lgs.pojo.UserVo;
import com.lgs.pojo.UserQuery;
import com.lgs.pojo.UserVo;
import com.lgs.service.UserService;
import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:TestController
 * @Auther:lgs
 * @Description:
 * @DateTime: 2023/6/13 10:43
 **/
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

//    @RequestMapping("/getAllUsers")
//    public List<UserVo> getAllUsers(){
//        return userService.getAllUsers();
//    }


    @RequestMapping("/getUserForPage")
//    @SentinelResource(value = "userForPage-api",blockHandler = "block")
    public PageInfo<UserVo> getUserForPage(UserQuery userQuery){

        PageHelper.startPage(userQuery.getPageNum(),userQuery.getPageSize());

        List<UserVo> userVoList =userService.getUserForPage(userQuery);

        PageInfo<UserVo> pageInfo = new PageInfo<UserVo>(userVoList);

        return pageInfo;
    }

    public PageInfo<UserVo> block(UserQuery userQuery, BlockException e){
        log.warn("限流或熔断",e);
        List<UserVo> userVoList = new ArrayList();
        UserVo userVo = new UserVo();
        userVo.setRoleName("默认用户");
        userVoList.add(userVo);
        PageInfo<UserVo> pageInfo = new PageInfo<>(userVoList);
        return pageInfo;
    }
}
