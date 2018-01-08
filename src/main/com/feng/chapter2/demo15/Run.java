package com.feng.chapter2.demo15;

/**
 * @author jinx
 * @date 2018/1/8 21:52
 * Desc:数据类型为String的字符串常量池特性;该例中String的两个值都是AA,两个线程持有相同的锁，所以造成b线程不能执行，这就是String常量池带来的问题。所以大多数情况下synchronized代码块都不用String作为锁对象。
 */
public class Run {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.setName("a");
        threadA.start();
        ThreadB threadB = new ThreadB();
        threadB.setName("b");
        threadB.start();
    }
}
