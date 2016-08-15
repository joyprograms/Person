package com.theironyard.charlotte;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by meekinsworks on 8/14/16.
 */
public class Person {
    private static
    int length;
    int id;
    String first_name;
    String last_name;
    String email;
    String country;
    String ip_address;

    public ArrayList<Person> people = new ArrayList<Person>();

    public Person(int id, String first_name, String last_name, String email, String country, String ip_address, ArrayList<Person> people) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.country = country;
        this.ip_address = ip_address;
        this.people = people;
    }

    public Person() {

    }

    public static int getLength() {
        return length;
    }

    public static void setLength(int length) {
        Person.length = length;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public static void addPerson(int id, String first_name, String last_name, String email, String country, String ip_address, ArrayList<Person> people) {
        Person newPerson = new Person();
        newPerson.id = id;
        newPerson.first_name = first_name;
        newPerson.last_name = last_name;
        newPerson.email = email;
        newPerson.country = country;
        newPerson.ip_address = ip_address;
        newPerson.people = people;
        people.add(newPerson);

//    for (int i=0; i<people.size(); i++) {

        int i;
        for (i = 0; i < Person.length; i++) {
        }

        System.out.println(people[1]);


    }
    }


