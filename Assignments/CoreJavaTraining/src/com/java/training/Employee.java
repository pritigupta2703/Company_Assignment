package com.java.training;

/**
 * Created by pritigupta on 1/25/17.
 */
public class Employee {
    public int id;
    public String name;
    public int age;



    public Employee(int id1 , String name1 , int age1 ){
    this.id = id1;
    this.name = name1;
    this.age = age1;

    }

    public  Employee (){               //default constructor

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id)
    {

        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;

    }


}
