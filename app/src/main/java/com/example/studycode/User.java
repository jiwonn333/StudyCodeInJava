package com.example.studycode;

public class User {
    private String name;
    private int age;

    private User(){

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // xml 에서 "@{user.name}"
    public String getName() {
        return name;
    }
    // xml 에서 "@{user.age}"
    public int getAge() {
        return age;
    }
}
