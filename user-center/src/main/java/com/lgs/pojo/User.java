package com.lgs.pojo;

import lombok.Data;

/**
 * @ClassName:User
 * @Auther:lgs
 * @Description:
 * @DateTime: 2023/6/13 10:43
 **/
@Data
public class User {

    private Integer id;

    private String userName;

    private String userPwd;

    private Integer roleId;

    private Integer gender;
}
