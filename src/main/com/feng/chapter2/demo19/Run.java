package com.feng.chapter2.demo19;

/**
 * @author jinx
 * @date 2018/1/8 22:26
 * Desc:同步方法无限等待问题；解决demo17和demo18中提出的问题。
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
