package com.feng.chapter2.demo2;

/**
 * @author jinx
 * @date 2018/1/3 18:24
 * Desc:多个对象多个锁，关键字synchronized取得的锁都是对象锁，而不是把一段代码或者方法当做锁。
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum privateNum1 = new HasSelfPrivateNum();
        HasSelfPrivateNum privateNum2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(privateNum1);
        threadA.start();
        ThreadB threadB  = new ThreadB(privateNum2);
        threadB.start();
    }
}
