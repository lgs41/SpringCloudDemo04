package com.lgs.dao;

import com.lgs.pojo.Role;
import org.springframework.stereotype.Repository;

/**
 * @ClassName:UserDao
 * @Auther:lgs
 * @Description:
 * @DateTime: 2023/6/13 10:46
 **/
@Repository
public interface RoleDao {
    Role getRoleById(Integer id);
}
