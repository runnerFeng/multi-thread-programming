package com.feng.chapter1.demo4;

/**
 * @author jinx
 * @date 2017/12/25 22:32
 * Desc:实现runnable接口
 */
public class Run {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
