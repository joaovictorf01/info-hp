package com.victor.hpinfo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "hpApi", url = "https://hp-api.onrender.com/api/characters")
public interface ClientApi {

    @GetMapping
    List<Character> getCharacters();

}
