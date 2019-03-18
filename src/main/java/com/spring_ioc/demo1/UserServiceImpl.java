package com.spring_ioc.demo1;

/**
 * @Auther: 梓
 * @Date: 2019/3/18 14:32
 * @Description:
 */
public class UserServiceImpl implements UserService {

    //添加属性
    private String name;

    @Override
    public void sayHello() {
        System.out.println("hello spring_ioc"+ name );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
