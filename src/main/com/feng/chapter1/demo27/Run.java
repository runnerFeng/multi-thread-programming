package com.feng.chapter1.demo27;

/**
 * @author jinx
 * @date 2018/1/3 11:00
 * Desc:独占锁
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            //可以打印main end因为run方法中没有锁，所以不会出现独占锁造成的线程停止
            System.out.println("main end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
