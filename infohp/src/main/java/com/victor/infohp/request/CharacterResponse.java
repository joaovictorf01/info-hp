package com.victor.infohp.request;

import java.sql.Date;

import lombok.Data;

@Data
public class CharacterResponse {
    private String id;
    private String name;
    private String house;
    private Date dateOfBirth;
    private int yearOfBirth;

}
