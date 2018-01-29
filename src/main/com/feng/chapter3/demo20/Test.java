package com.feng.chapter3.demo20;

/**
 * @author jinx
 * @date 2018/1/29 18:23
 * Desc:join的作用是当start方法之心完后，再执行其后的代码
 *      join具有是线程排队的作用，与synchronized的区别是：join内部使用wait()方法进行等待，而synchronized使用对象监视器原理进行同步。
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.join();
            System.out.println("当mythread执行完后我再执行！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
