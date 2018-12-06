package com.wsh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.wsh.asset.mapper","com.wsh.base.mapper"})
public class AssetApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssetApplication.class, args);
    }
}
