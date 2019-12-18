package com.yzl.config.web;

import com.yzl.config.bean.configBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunjingjia  on 2019/12/18.
 */
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    private configBean config;

    @RequestMapping("/test")
    public configBean test(){
        return config;
    }
}
