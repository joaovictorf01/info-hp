package com.victor.hpinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.hpinfo.client.ClientApi;

@Service
public class CharacterService {

    @Autowired
    private ClientApi clientApi;

    public List<Character> getCharacters() {
        return this.clientApi.getCharacters();
        
    }
}