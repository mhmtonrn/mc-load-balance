package com.softengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
//Eureka server 'a register olabilmesi için bu notasyonu ekliyoruz.
@EnableDiscoveryClient
//springboot projesi
@SpringBootApplication
public class CustomerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(CustomerApp.class, args);
    }
}
