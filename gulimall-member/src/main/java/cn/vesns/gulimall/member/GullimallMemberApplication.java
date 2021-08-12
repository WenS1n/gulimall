package cn.vesns.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 想要远程调用别的服务，
 * 引入open feign
 * 编写一个接口，告诉spring cloud这个接口需要调用远程服务
 *  1、声明接口的每一个方法都是调用那个远程服务的那个请求
 * 开启远程调用功能
 */
@EnableFeignClients(basePackages = "cn.vesns.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GullimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GullimallMemberApplication.class, args);
    }

}
