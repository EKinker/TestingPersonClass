package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private boolean isAlive;
    private String homePlanet;
    private char gender;

    public Person() {  //these are the defaults
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.isAlive = true;
        this.homePlanet = "";
        this.gender = ' ';


    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public Person (char gender) {
        this.gender = gender;
    }

    public Person(String name, String homePlanet) {
        this.name = name;
        this.homePlanet = homePlanet;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String homePlanet, int age, Boolean isAlive, char gender) {
        this.name = name;
        this.homePlanet = homePlanet;
        this.age = age;
        this.isAlive = isAlive;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void setHomePlanet(String homePlanet) {
        this.homePlanet = homePlanet;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getIsAlive() { return isAlive;}

    public String getHomePlanet() {return homePlanet;}
    public char getGender() {return gender;}
}
