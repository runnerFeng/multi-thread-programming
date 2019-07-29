package com.feng.chapter1.demo12;

/**
 * @author jinx
 * @date 2017/12/29 16:16
 * Desc:
 */
public class Run {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);
        System.out.println("main begin thread isAlive:" + thread.isAlive());
        //指定了线程名称为A,此时Thread.currentThread()和this.Thread已经不是同一个值了
        //指定的线程为:A this线程为：Thread-0
        thread.setName("A");
        thread.start();
        System.out.println("main end thread isAlive:" + thread.isAlive());
    }
}
