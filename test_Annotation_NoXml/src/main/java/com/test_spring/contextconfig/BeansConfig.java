package com.test_spring.contextconfig;

import com.test_spring.pojo.Cat;
import com.test_spring.pojo.Dog;
import com.test_spring.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 这个也会Spring容器托管，注册到容器中，因为它本来就是一个@Component
// @Configuration代表这是一个配置类，就和我们之前看的beans.xml
@Configuration
@ComponentScan("com.test_spring.pojo")
public class BeansConfig {


    @Bean
    public Cat cat(){
        return new Cat();
    }
    @Bean
    public Dog dog1(){
        return new Dog();
    }
    @Bean
    //使用Value注解时该注入自动失效
    public Dog dog2(){
        Dog dog = new Dog();
        dog.setName("dog2");
        return dog;
    }
    // 注册一个bean，就相当于我们之前写的一个bean标签
    // 这个方法的名字，就相当于bean标签中id属性
    // 这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User user(){
        return new User(); // 就是返回要注入到bean的对象！
    }
}
