package com.spring_bean_range;

/**
 * @Auther: 梓
 * @Date: 2019/3/18 16:01
 * @Description:
 */
public class Man {
    public Man(){
        System.out.println("man实例化");
    }

    public void setup(){
        System.out.println("man被初始化");
    }

    public void teardown(){
        System.out.println("man被销毁了");
    }
}
