package com.jobtube2.ex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan(basePackages="com.jobtube2.ex.*")
public class Jobtube2Application {

	public static void main(String[] args) {
		SpringApplication.run(Jobtube2Application.class, args);
	}

}
