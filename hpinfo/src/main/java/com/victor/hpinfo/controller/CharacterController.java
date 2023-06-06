package com.victor.hpinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victor.hpinfo.service.CharacterService;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {
    @Autowired
    private CharacterService characterService;

    @GetMapping
    public List<Character> getCharacters() {
        return characterService.getCharacters();

    }
}