package com.feng.chapter2.demo31;

/**
 * @author jinx
 * @date 2018/1/14 22:44
 * Desc:使用原子类实现同步,原子类其实是在之前提到的三步中自身保持了原子性
 */
public class Run {
    public static void main(String[] args) {
        AddCountThread thread = new AddCountThread();
        Thread thread1 = new Thread(thread);
        thread1.start();
        Thread thread2 = new Thread(thread);
        thread2.start();
        Thread thread3 = new Thread(thread);
        thread3.start();
        Thread thread4 = new Thread(thread);
        thread4.start();
        Thread thread5 = new Thread(thread);
        thread5.start();
    }
}
