package com.lgs.controller;
import com.lgs.pojo.Role;
import com.lgs.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName:RoleController
 * @Auther:lgs
 * @Description:
 * @DateTime: 2023/6/13 10:43
 **/
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/getRoleById/{id}")
    public Role getRoleById(@PathVariable Integer id){

        System.err.println("8082端口");

        return roleService.getRoleById(id);
    }

}
