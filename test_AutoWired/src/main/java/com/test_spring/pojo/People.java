package com.test_spring.pojo;

public class People {
    private String name;
    private Cat cat;
    private Dog dog;

    public People(String name, Cat cat, Dog dog) {
        this.name = name;
        this.cat = cat;
        this.dog = dog;
    }

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }


}
