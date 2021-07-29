package com.test_spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name;

    public String getName() {
        return name;
    }

    @Value("dog111")
    public void setName(String name) {
        this.name = name;
    }

    public void shout() {
        System.out.println(name + "wangwangwang");
    }
}
