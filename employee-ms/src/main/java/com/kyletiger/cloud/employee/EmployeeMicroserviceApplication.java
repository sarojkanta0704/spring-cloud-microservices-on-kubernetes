package com.kyletiger.cloud.employee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


/**
 * Employee Microservice..
 *
 * @author 郑立松 - Albert Zheng <lisong.zheng@gmail.com>
 */
@SpringBootApplication(scanBasePackages = {"com.kyletiger.cloud"})

// To scan my MyBatis mapper classes.
@MapperScan("com.kyletiger.cloud.employee.mapper")

// To use Eureka Client for registering myself and discovering other service providers.
@EnableDiscoveryClient
// @EnableDiscoveryClient == @EnableEurekaClient

// To use Feign + Ribbon + Hystrix (If ``feign.hystrix.enabled=true``)
@EnableFeignClients
// Note: @EnableHystrix == @EnableFeignClients
//@EnableHystrix

// To enable Hystrix Circuit Breaker
@EnableCircuitBreaker

public class EmployeeMicroserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeMicroserviceApplication.class, args);
    }
}
