package com.victor.infohp.request;

import org.springframework.cloud.openfeign.FeignClient;

import feign.Feign;
import feign.Request;
import feign.RequestLine;
import feign.Response;
import feign.Target;

@FeignClient(name = "CharacterClient", url = "https://hp-api.onrender.com")
public interface CharacterClient {
    @RequestLine("GET /api/characters")
    Response getCharacters();

    @RequestLine("GET /api/characters/{id}")
    Response getCharacterById(String id);

    static CharacterClient create() {
        return Feign.builder()
                .options(new Request.Options(10000, 60000))
                .target(CharacterClient.class, "https://hp-api.onrender.com");

    }
}