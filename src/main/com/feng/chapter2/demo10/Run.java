package com.feng.chapter2.demo10;

/**
 * @author jinx
 * @date 2018/1/4 16:46
 * Desc:1.同步代码块之间也是同步的，即：synchronized使用的“对象监视器”是同一个
 * 2.同步代码块是锁定对象的
 */
public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
