package com.lgs.service;

import com.lgs.dao.RoleDao;
import com.lgs.pojo.Role;
import com.lgs.dao.RoleDao;
import com.lgs.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName:UserService
 * @Auther:lgs
 * @Description:
 * @DateTime: 2023/6/13 10:45
 **/
@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;


    public Role getRoleById(Integer id) {

        return roleDao.getRoleById(id);
    }
}
