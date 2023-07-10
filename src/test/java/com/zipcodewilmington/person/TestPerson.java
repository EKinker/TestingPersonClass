package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAlive() {
        boolean expected = true;
        Person person = new Person(expected);
        boolean actual = person.getIsAlive();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTwoStrings() {
        String expectedName = "Holden";
        String expectedPlanet = "Earth";

        Person person = new Person(expectedName, expectedPlanet);
        String actualName = person.getName();
        String actualPlanet = person.getHomePlanet();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedPlanet, actualPlanet);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithAllInfo() {
        Integer expectedAge = 45;
        String expectedName = "Miller";
        Boolean expectedAlive = false;
        String expectedPlanet = "Ceres Station";
        char expectedGender = 'M';

        Person person = new Person(expectedName, expectedPlanet, expectedAge, expectedAlive, expectedGender);

        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Boolean actualAlive = person.getIsAlive();
        String actualPlanet = person.getHomePlanet();
        char actualGender = person.getGender();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAlive, actualAlive);
        Assert.assertEquals(expectedPlanet, actualPlanet);
        Assert.assertEquals(expectedGender, actualGender);

    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetAlive() {
        Person person = new Person();
        boolean expected = true;
        person.setIsAlive(expected);
        boolean actual = person.getIsAlive();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetPlanet() {
        Person person = new Person();
        String expected = "Earth";
        person.setHomePlanet(expected);
        String actual = person.getHomePlanet();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSetGender() {
        Person person = new Person();
        char expected = 'F';
        person.setGender(expected);
        char actual = person.getGender();
        Assert.assertEquals(actual, expected);
    }
}
