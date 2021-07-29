package com.test_spring.pojo;

public class Cat {
    private String name;
    public void shout(){
        System.out.println("miaomiaomiao");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
