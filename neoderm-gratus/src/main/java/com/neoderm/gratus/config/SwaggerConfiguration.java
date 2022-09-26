package com.neoderm.gratus.config;

import com.neoderm.common.config.BaseSwaggerConfig;
import com.neoderm.common.config.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Profile(value = {"dev"})
public class SwaggerConfiguration extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.neoderm.gratus.controller")
                .title("开发文档")
                .description("后台相关接口文档")
                .contactName("Bess Croft")
                .contactEmail("641230267@qq.com")
                .contactUrl("https://github.com/besscroft/aurora-mall")
                .license("Open Source")
                .licenseUrl("https://github.com/besscroft/aurora-mall/blob/main/LICENSE")
                .version("0.1.0")
                .enableSecurity(true)
                .build();
    }

}
