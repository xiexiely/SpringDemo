package com.spring_ioc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: 梓
 * @Date: 2019/3/18 14:33
 * @Description:
 *          IOC 反转控制
 *              将需要手动[创建]的对象的控制权交给Spring框架管理.
 *          DI 依赖注入
 *              在spring创建这个对象的过程中,将这个对象所依赖的[属性]注入进去
 */
public class SpringDemo1Test {

   @Test
   /**
    * 传统方式开发 有耦合
    */
   public void demo1(){
    //    UserService userService = new UserServiceImpl();
    //    userService.sayHello();

    UserServiceImpl userService1 = new UserServiceImpl();
    userService1.setName("张三");
    userService1.sayHello();
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
