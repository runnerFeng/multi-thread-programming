package com.feng.chapter3.demo33;

/**
 * @author jinx
 * @date 2018/1/30 17:16
 * Desc:condition错误用法
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.start();
    }
}
