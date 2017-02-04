package com.shopping.domain;

/**
 * Created by pritigupta on 1/25/17.
 */
public class User {
    private int id;
    private String username1;
    private String firstName;
    private String lastName;
    private String address;


    public User()
    {
        this.id = id;
        this.username1 =username1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address=address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUserName1(String userName1) {
        this.username1 = username1;
    }
}
