package com.softengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@EnableEurekaClient
//Eureka server 'a register olabilmesi için bu notasyonu ekliyoruz.
@EnableDiscoveryClient
//springboot projesi
@SpringBootApplication
public class ProductApp3
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProductApp3.class, args);
    }
}
