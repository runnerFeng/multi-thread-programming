package com.feng.chapter2.demo4;

/**
 * @author jinx
 * @date 2018/1/4 10:45
 * Desc:关键字synchronized取得的锁都是对象锁，只对同步方法需要等待，非同步方法是异步的【无需排队】
 */
public class Run {
    public static void main(String[] args) {
        MyObject object  = new MyObject();
        ThreadA threadA = new ThreadA(object);
        threadA.setName("a");
        ThreadB threadB = new ThreadB(object);
        threadB.setName("b");
        threadA.start();
        threadB.start();

    }
}
