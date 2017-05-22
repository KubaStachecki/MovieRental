package com.kuba;


import java.util.Date;

public class Customer {

    private String lastName;
    private String firstName;
    private String pesel;
    private String city;
    private Date date;
    private int id;
    private int nextId;


    public Customer(String pesel, String firstName, String lastName, String city, Date date) {
        id = nextId;
        nextId++;

        this.date = date;
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



}
