package com.neoderm.gratus.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "测试模块")
@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @ApiOperation("测试方法")
    @PostMapping("/getTitle")
    public String getTitle(){
        return "测试成功！";
    }

}
