package com.feng.chapter2.demo16;

/**
 * @author jinx
 * @date 2018/1/8 21:52
 * Desc:数据类型为String的字符串常量池特性;大多数情况下synchronized代码块都不用String作为锁对象,而是Object对象。
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
