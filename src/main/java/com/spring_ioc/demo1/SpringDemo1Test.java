package com.spring_ioc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: 梓
 * @Date: 2019/3/18 14:33
 * @Description: Spring_IOC
 */
public class SpringDemo1Test {

   @Test
   /**
    * 传统方式开发 有耦合
    */
   public void demo1(){
    UserService userService = new UserServiceImpl();
    userService.sayHello();
   }

   @Test
    /**
     *  Spring 的方式实现 解耦合
     */
    public void demo2(){

        //创建Spring的工厂
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       //通过工程获得类
       UserService userService = (UserService) applicationContext.getBean("UserServiceImplXml");
       userService.sayHello();
    }

}
