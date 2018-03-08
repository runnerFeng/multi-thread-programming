package com.feng.chapter4.demo4;

/**
 * @author jinx
 * @date 2018/1/30 17:16
 * Desc:condition实现等待通知错误用法
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.start();
    }
}
