package com.feng.chapter3.demo26;

/**
 * @author jinx
 * @date 2018/1/30 15:21
 * Desc:验证线程变量的隔离性
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();
        for (int i = 0; i < 100; i++) {
            Tools.t.set("main:" + (i + 1));
            System.out.println("main get value:" + Tools.t.get());
            Thread.sleep(200);
        }
    }
}
