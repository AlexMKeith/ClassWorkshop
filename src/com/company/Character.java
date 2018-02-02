package com.company;

import java.util.Scanner;

public class Character {

    private String race;
    private String name;
    private int powerLevel;
    private String gender;
    private Scanner input = new Scanner(System.in);

    public Character() {
        System.out.println("What is your character's race? Human, Android, Angel, Demon, Demon Realm race, Dragon, Frieza race, Majin, Namekian, Saiyan, Shinjin, or Tuffle.");
        setRace(input.nextLine());
        System.out.println("What is your character's name?");
        setName(input.nextLine());
        System.out.println("What is your character's power level?");
        setPowerLevel(input.nextInt());
        System.out.println("What is your character's gender?");
        setGender(input.nextLine());
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
