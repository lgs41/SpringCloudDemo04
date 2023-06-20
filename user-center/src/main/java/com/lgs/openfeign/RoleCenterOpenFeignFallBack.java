package com.lgs.openfeign;

import com.lgs.pojo.Role;
import org.springframework.stereotype.Component;

/**
 * @ClassName: RoleCenterOpenFeignFallBack
 * @Auther: lgs
 * @Description:
 * @DateTime: 2023/6/19 15:38
 **/
@Component
public class RoleCenterOpenFeignFallBack implements RoleCenterOpenFeign{

    @Override
    public Role getRoleById(Integer id) {
        Role role = new Role();
        role.setName("默认用户。。。。");
        return role;
    }
}
