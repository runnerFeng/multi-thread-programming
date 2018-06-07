package com.feng.chapter2.demo6;

/**
 * @author jinx
 * @date 2018/06/07 22:38
 * Desc:
 */
public class Run {
    public static void main(String[] args) {
        Service1 service1 = new Service1();
        MyThreadA myThreadA = new MyThreadA(service1);
        myThreadA.setName("A");
        myThreadA.start();
        MyThreadB myThreadB = new MyThreadB(service1);
        myThreadB.setName("B");
        myThreadB.start();
    }
}
