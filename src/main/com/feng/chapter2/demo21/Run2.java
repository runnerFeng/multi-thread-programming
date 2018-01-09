package com.feng.chapter2.demo21;

/**
 * @author jinx
 * @date 2018/1/9 22:43
 * Desc:待测试的静态内部类
 */
public class Run2 {
    public static void main(String[] args) {
        PublicClass1 publicClass = new PublicClass1();
        publicClass.setUsername("username");
        publicClass.setPassword("password");
        System.out.println(publicClass.getUsername()+" "+publicClass.getPassword());
        PublicClass1.PrivateClass privteClass = new PublicClass1.PrivateClass();
        privteClass.setAddress("address");
        privteClass.setAge("age");
        System.out.println(privteClass.getAge()+" "+privteClass.getAddress());

    }
}
