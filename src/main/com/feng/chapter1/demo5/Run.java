package com.feng.chapter1.demo5;

/**
 * @author jinx
 * @date 2017/12/25 22:43
 * Desc:不共享数据的线程
 */
public class Run {
    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}
