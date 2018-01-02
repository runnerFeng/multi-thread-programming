package com.feng.chapter1.demo16;

/**
 * @author jinx
 * @date 2018/1/2 11:54
 * Desc:interrupt()其实停止的是当前线程
 */
public class Run {
    public static void main(String[] args) {

        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            //注意此处用的方法为interrupt()
            myThread.interrupt();
            //interrupt()方法停止的是当前线程，这里当前线程是main方法，所以以下输出均为false
            System.out.println(Thread.currentThread());
            //测试interrupted()方法
            System.out.println("是否停止1：" + Thread.interrupted());
            System.out.println("是否停止2：" + Thread.interrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
