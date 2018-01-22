package com.feng.chapter3.demo10;

/**
 * @author jinx
 * @date 2018/1/22 23:39
 * Desc:wait条件发生变化也易发生逻辑变化
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String string = new String("");
        Add add = new Add(string);
        Subtract subtract = new Subtract(string);
        ThreadB threadB = new ThreadB(subtract);
        threadB.setName("threadB");
        threadB.start();
        ThreadB threadB2 = new ThreadB(subtract);
        threadB2.setName("threadB2");
        threadB2.start();
        Thread.sleep(1000);
        ThreadA threadA = new ThreadA(add);
        threadA.setName("threadA");
        threadA.start();
    }
}
