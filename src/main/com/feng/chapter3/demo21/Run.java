package com.feng.chapter3.demo21;

/**
 * @author jinx
 * @date 2018/1/30 10:00
 * Desc:join与异常  threadB中run方法中的其他线程调用join是依赖于threadB本身的,当threadB调用了interrupt方法时，则会出现异常
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        threadB.start();
        Thread.sleep(500);
        ThreadC threadC = new ThreadC(threadB);
        threadC.start();
    }
}
