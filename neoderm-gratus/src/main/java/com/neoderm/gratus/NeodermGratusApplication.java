package com.neoderm.gratus;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableKnife4j
@SpringBootApplication
public class NeodermGratusApplication {

    public static void main(String[] args) {
        SpringApplication.run(NeodermGratusApplication.class);
    }

}
