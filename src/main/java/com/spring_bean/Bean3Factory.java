package com.spring_bean;

/**
 * @Auther: 梓
 * @Date: 2019/3/18 15:35
 * @Description:
 */
public class Bean3Factory {
    public Bean3 createBean3(){
        System.out.println("Bean3Factory被执行");
        return new Bean3();
    }
}
