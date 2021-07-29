package com.test_spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class People_Anno {
    private String name;
    private int age;
    @Autowired
    private Dog dog;
    @Autowired
    @Qualifier("cat_gami")
    private Cat cat;

    public People_Anno() {
    }

    public People_Anno(String name, int age, Dog dog, Cat cat) {
        this.name = name;
        this.age = age;
        this.dog = dog;
        this.cat = cat;
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

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
