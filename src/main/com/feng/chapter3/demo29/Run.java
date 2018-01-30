package com.feng.chapter3.demo29;

/**
 * @author jinx
 * @date 2018/1/30 16:11
 * Desc:值继承
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("main 中取值：" + Tools.t.get());
            Thread.sleep(100);
        }
        ThreadA threadA = new ThreadA();
        threadA.start();
    }
}
