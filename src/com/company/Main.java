package com.company;

import com.company.Cat;

public class Main {


    public Main() {
    }

    public static void main(String[] args) {


//        Dog dog = new Dog( "Person", "Doggy", "124 main street", 3, 'M', True, True, "Shiny");
        Dog dog = new Dog("Person", "Doggy", "124 main street", 3, 'M', true, true, "Shiny");
//        System.out.println(dog.makeSound());


        Cat cat = new Cat("Person", "Kitty", "124 main street", 5, 'F',
                true, true, "White");

//        System.out.println(cat.makeSound());
        if (cat.getAge() == 1) {
            System.out.println(cat.getPetName() + " is " + cat.getAge() + " in human years and 19 in cat years");
        } else if (cat.getAge() == 0) {
            System.out.println(cat.getPetName() + " is " + cat.getAge() + " in human years and 0 in cat years");
        } else if (cat.getAge() == 2) {
            System.out.println(cat.getPetName() + " is " + cat.getAge() + " in human years and 24 in cat years");
        } else {
            System.out.println(cat.getPetName() + " is " + cat.getAge() + " in human years and " + ((cat.getAge() - 2) * 4 + 24) + " in cat years.");
        System.out.println(dog.getPetName() + " is " + dog.getAge() + " in human years and " + (dog.getAge() * 7) + " in dog years.");

        }

    }
}