package cn.vesns.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : vip865047755@126.com
 * @version :JDK1.8
 * @date : 2021-08-08 22:22
 * @File : GulimallProductApplication.java
 * @software: IntelliJ IDEA
 */
@MapperScan("cn.vesns.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }
}
