package com.cleancode;

public class User {

    private String name;
    private int age;
    private Gender gender;
    private int risk;

    public User(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    boolean hasAgeRisk(){
        return age >= 60;
    }

    boolean hasGenderRisk() {
        return gender == Gender.M;
    }

    public void calculateRisk() {
        if (hasAgeRisk()) {
            this.risk++;
        }
        if (hasGenderRisk()) {
            this.risk++;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRisk() {
        return risk;
    }
}
