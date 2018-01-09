package com.feng.chapter2.demo21;

/**
 * @author jinx
 * @date 2018/1/9 22:43
 * Desc:待测试的内部类
 */
public class Run {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("username");
        publicClass.setPassword("password");
        System.out.println(publicClass.getUsername()+" "+publicClass.getPassword());
        PublicClass.PrivateClass privteClass = publicClass.new PrivateClass();
        privteClass.setAddress("address");
        privteClass.setAge("age");
        System.out.println(privteClass.getAge()+" "+privteClass.getAddress());

    }
}
