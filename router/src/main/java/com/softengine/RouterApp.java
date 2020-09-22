package com.softengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
 

 
@SpringBootApplication
//yük dağılımını bu notasyon ile yapıyoruz
@EnableZuulProxy
//Eureka server 'a register olabilmesi için bu notasyonu ekliyoruz.
@EnableDiscoveryClient
public class RouterApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(RouterApp.class, args);
    }
}