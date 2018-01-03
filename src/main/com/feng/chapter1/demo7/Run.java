package com.feng.chapter1.demo7;

/**
 * @author jinx
 * @date 2017/12/27 22:34
 * Desc:两个线程访问同一个对象的实例变量是非线程安全的，需在修改实例变量的方法前加关键字synchronized进行同步
 */
public class Run {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
