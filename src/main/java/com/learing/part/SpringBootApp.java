package com.learing.part;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.SIX.controller.SpringControler;


@SpringBootApplication
@ComponentScan(basePackageClasses = SpringControler.class)
public class SpringBootApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp.class, args);

	}

}
