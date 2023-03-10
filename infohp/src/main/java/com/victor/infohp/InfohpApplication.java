package com.victor.infohp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.victor.infohp.request.CharacterClient;

import feign.Response;

@EnableFeignClients
@SpringBootApplication
public class InfohpApplication {

	public static void main(String[] args) {
		CharacterClient characterClient = CharacterClient.create();

		Response resp = characterClient.getCharacters();
		System.out.println(resp.status());

		String id = "265985";
		Response respById = characterClient.getCharacterById(id);
		System.out.println(respById.body());
		System.out.println(resp.toString());
		SpringApplication.run(InfohpApplication.class, args);
	}

}
