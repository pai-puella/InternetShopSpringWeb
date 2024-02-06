package com.example.internetshopapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class InternetShopAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetShopAppApplication.class, args);
	}

}

