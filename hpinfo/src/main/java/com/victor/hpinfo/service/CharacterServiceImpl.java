package com.victor.hpinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.hpinfo.client.ClientApi;
import com.victor.hpinfo.model.HpCharacter;

@Service
public class CharacterServiceImpl implements CharacterService {
    @Autowired
    private ClientApi clientApi;

    @Override
    public List<HpCharacter> getAllCharacters() {

        return clientApi.getCharacters();
    }
}
