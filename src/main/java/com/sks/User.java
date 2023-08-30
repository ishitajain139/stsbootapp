package com.sks;

public class User {
    
    private String name;
    private int age;
    private String nationality;
    
    public User(String name, int age, String nationality) {
        super();
        this.name = name;
        this.age = age;
        this.nationality = nationality;
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
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getNationality() {
        return nationality;
    }
    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", nationality=" + nationality + "]";
    }
}
