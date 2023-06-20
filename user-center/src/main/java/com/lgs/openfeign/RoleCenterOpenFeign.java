package com.lgs.openfeign;

import com.lgs.config.RoleCenterOpenFeignConfiguratuion;
import com.lgs.pojo.Role;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: RoleCenterOpenFeign
 * @Auther: lgs
 * @Description:
 * @DateTime: 2023/6/16 9:10
 **/
//
@FeignClient(value = "role-center",path = "/role",configuration = RoleCenterOpenFeignConfiguratuion.class,fallback = RoleCenterOpenFeignFallBack.class)
public interface RoleCenterOpenFeign {
    @RequestMapping("/getRoleById/{id}")
    public Role getRoleById(@PathVariable(value = "id") Integer id);
}
