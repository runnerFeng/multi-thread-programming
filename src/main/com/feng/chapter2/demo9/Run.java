package com.feng.chapter2.demo9;

/**
 * @author jinx
 * @date 2018/1/4 15:56
 * Desc:同步不具有继承性
 */
public class Run {
    public static void main(String[] args) {
        Sub sub = new Sub();
        ThreadA threadA = new ThreadA(sub);
        threadA.setName("a");
        threadA.start();
        ThreadB threadB  = new ThreadB(sub);
        threadB.setName("b");
        threadB.start();
    }
}
