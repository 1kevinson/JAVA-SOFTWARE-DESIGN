package com.example.demo.beginner.fundamentals;

public class VariableDeclaration {

    // Declaring float variable
    float simpleInterest;

    // Declaring and initializing integer variable
    int distance = 10;

    public void showAge() {
        // Declaring a local variable
        int age = 25;

        // This variable is local to the showAge function only
        System.out.println(age);
    }
}


class Person {

    // Declaring instance variable
    String name;
    String email;

    public Person() {
        // Initializing instance variable
        this.name = "Kevin";
    }
}

class Car {

    // Declaring static variable
    public static String model;

}

class School {

    public String address;

    {
        address = "14 rue du maréchal viscount, 75000 Paris";
    }

    public String getAddress() {
        return this.address;
    }
}