package com.victor.hpinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HpinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HpinfoApplication.class, args);
	}

}
