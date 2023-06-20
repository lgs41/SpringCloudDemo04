package com.lgs.pojo;

import lombok.Data;

/**
 * @ClassName:BaseQuery
 * @Auther:lgs
 * @Description:
 * @DateTime: 2023/6/15 8:34
 **/
@Data
public class BaseQuery {

    private Integer pageNum=1;

    private Integer pageSize=3;

}
