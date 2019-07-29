package com.feng.chapter1.demo6;


/**
 * @author jinx
 * @date 2017/12/25 22:54
 * Desc:共享数据的线程，但是此时会有多个线程同一时刻修改同一个数据的问题,即非线程安全,解决方案是给该方法添加synchronize关键字
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        Thread a = new Thread(myThread,"A");
//        Thread b = new Thread(myThread,"B");
//        Thread c = new Thread(myThread,"C");
//        Thread d = new Thread(myThread,"D");
//        Thread e = new Thread(myThread,"E");
//        a.start();
//        b.start();
//        c.start();
//        d.start();
//        e.start();

        MyThread1 myThread1 = new MyThread1();
        Thread aa = new Thread(myThread1, "A");
        Thread bb = new Thread(myThread1, "B");
        Thread cc = new Thread(myThread1, "C");
        Thread dd = new Thread(myThread1, "D");
        Thread ee = new Thread(myThread1, "E");
        aa.start();
        bb.start();
        cc.start();
        dd.start();
        ee.start();
    }
}
