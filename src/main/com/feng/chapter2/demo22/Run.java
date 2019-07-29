package com.feng.chapter2.demo22;

/**
 * @author jinx
 * @date 2018/1/9 23:19
 * Desc:当持有的锁对象不同时打印为异步，当持有的锁对象相同时则打印是同步的。
 */
public class Run {
    public static void main(String[] args) {
        OutClass.InnerClass innerClass = new OutClass.InnerClass();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass.method1();
            }
        }, "A");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass.method2();
            }
        }, "B");
        thread1.start();
        thread2.start();
    }
}
