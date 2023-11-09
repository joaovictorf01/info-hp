package com.victor.hpinfo.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HpCharacter {

    private String id;
    private String name;
    private List<String> alternateNames;
    private String species;
    private String gender;
    private String house;
    private String dateOfBirth;
    private int yearOfBirth;
    private boolean wizard;
    private String ancestry;
    private String eyeColour;
    private String hairColour;
    private String patronus;
    private boolean hogwartsStudent;
    private boolean hogwartsStaff;
    private String actor;
    private List<String> alternateActors;
    private boolean alive;
    private String image;
    private Wand wand;
}