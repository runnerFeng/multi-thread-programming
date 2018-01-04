package com.feng.chapter2.demo3;

/**
 * @author jinx
 * @date 2018/1/4 10:45
 * Desc:多个线程访问一个同步方法时需排队
 */
public class Run {
    public static void main(String[] args) {
        MyObject object  = new MyObject();
        ThreadA threadA = new ThreadA(object);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(object);
        threadB.setName("B");
        threadA.start();
        threadB.start();

    }
}
