package com.feng.chapter4.demo8;

/**
 * @author jinx
 * @date 2018/02/05 21:50
 * Desc:生产者/消费模式 一对一交替打印
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA threadA = new MyThreadA(myService);
        threadA.start();
        MyThreadB threadB = new MyThreadB(myService);
        threadB.start();
    }
}
