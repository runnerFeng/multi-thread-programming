package com.feng.chapter1.demo1;

/**
 * @author jinx
 * @date 2017/12/18
 * Desc:继承thread类
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束！");
    }
}
