package com.feng.chapter2.demo14;

/**
 * @author jinx
 * @date 2018/1/4 23:03
 * Desc:
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA();
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB();
        threadA.setName("B");
        threadB.start();
        ThreadC threadC = new ThreadC(service);
        threadA.setName("C");
        threadC.start();
    }
}
