package com.company;

import java.util.Scanner;

public class Dog extends Pet {



//    public Dog(String ownerName, String petName, String homeAddress, int age, char gender) {
//        super(ownerName, petName, homeAddress, age, gender);
//    }


    public Dog(String ownerName, String petName, String homeAddress, int age, char gender) {
        super(ownerName, petName, homeAddress, age, gender);
    }


    public Dog(String ownerName, String petName, String homeAddress, int age, char gender, boolean likesWalks, boolean canFetch, String coatType, Scanner input) {
        super(ownerName, petName, homeAddress, age, gender);
        this.likesWalks = likesWalks;
        this.canFetch = canFetch;
        this.coatType = coatType;
        this.input = input;


    }

    private boolean likesWalks;
        private boolean canFetch;
        private String coatType;
        private Scanner input = new Scanner(System.in);

    public Dog() {
        super();
        }
//    public Dog(String ownerName, String petName, String homeAddress, int age, char gender) {
//        super(ownerName, petName, homeAddress, age, gender);


    //    public Dog() {
//        System.out.println("What is your dog's name?");
//        setPetName(input.nextLine());
//        System.out.println("Does " + getPetName() + " like to take walks? True or False");
//        setLikesWalks(input.nextBoolean());
//    }

    public boolean isLikesWalks() {
        return likesWalks;
    }

    public void setLikesWalks(boolean likesWalks) {
        this.likesWalks = likesWalks;
    }

    public boolean isCanFetch() {
        return canFetch;
    }

    public void setCanFetch(boolean canFetch) {
        this.canFetch = canFetch;
    }

    public String getCoatType() {
        return coatType;
    }

    public void setCoatType(String coatType) {
        this.coatType = coatType;
    }

    @Override
    protected String makeSound() {
        return super.makeSound() + "BUT dogs bark";
    }
}