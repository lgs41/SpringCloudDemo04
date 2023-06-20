package com.lgs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.Logger;

//import java.util.logging.Logger;

/**
 * @ClassName: RoleCenterOpenFeignConfiguratuion
 * @Auther: lgs
 * @Description:
 * @DateTime: 2023/6/16 9:22
 **/
public class RoleCenterOpenFeignConfiguratuion {
    @Bean
    public Logger.Level level(){
        return Logger.Level.FULL;
    }
}
