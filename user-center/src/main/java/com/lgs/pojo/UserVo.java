package com.lgs.pojo;

import lombok.Data;

/**
 * @ClassName:UserVo
 * @Auther:lgs
 * @Description:
 * @DateTime: 2023/6/13 11:36
 **/
@Data
public class UserVo {

    private Integer id;

    private String userName;

    private String userPwd;

    private Integer roleId;

    private Integer gender;

    private String roleName;

}
