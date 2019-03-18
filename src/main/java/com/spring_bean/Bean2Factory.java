package com.spring_bean;

/**
 * @Auther: 梓
 * @Date: 2019/3/18 15:30
 * @Description:Bean2静态工厂 在工厂类中提供一个静态方法 放回Bean2实例
 */
public class Bean2Factory {
    public static Bean2 createBean2(){
        System.out.println("Bean2Factory被执行");
        return new Bean2();
    }
}
