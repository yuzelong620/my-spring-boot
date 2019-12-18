package com.yzl.config.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by sunjingjia  on 2019/12/18.
 */
@Component
@ConfigurationProperties(prefix="neo")
@Data
public class configBean {
    private String title;
    private String dri;
}
