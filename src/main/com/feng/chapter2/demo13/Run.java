package com.feng.chapter2.demo13;

/**
 * @author jinx
 * @date 2018/1/4 22:47
 * Desc:synchronized加到静态方法上表示对该类持锁
 */
public class Run {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB();
        threadB.setName("B");
        threadB.start();
    }
}
