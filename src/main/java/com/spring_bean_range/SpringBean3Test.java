package com.spring_bean_range;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: 梓
 * @Date: 2019/3/18 15:48
 * @Description:Bean作用范围的测试
 */
public class SpringBean3Test {

    @Test
    public void demo1(){

        //创建Spring的工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工程获得类
//        Person person1 = (Person) applicationContext.getBean("personSingleton");
//        Person person2 = (Person) applicationContext.getBean("personSingleton");
//
//        System.out.println(person1);
//        System.out.println(person2);

        Person person3 = (Person) applicationContext.getBean("personPrototype");
        Person person4 = (Person) applicationContext.getBean("personPrototype");

        System.out.println(person3);
        System.out.println(person4);
    }

    @Test
    public void demo2(){
        //创建Spring的工厂
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工程获得类
         Man man = (Man) applicationContext.getBean("man");
        System.out.println(man);
        applicationContext.close();

    }


}




