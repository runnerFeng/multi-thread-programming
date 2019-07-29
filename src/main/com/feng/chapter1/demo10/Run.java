package com.feng.chapter1.demo10;

/**
 * @author jinx
 * @date 2017/12/29 14:46
 * Desc:currentThread()方法
 */
public class Run {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        System.out.println("main begin thread isAlive:" + countOperate.isAlive());
        //没有指定线程名称,此时Thread.currentThread()和this.Thread其实是同一个值(Thread-0)
        countOperate.start();
        System.out.println("main begin thread isAlive:" + countOperate.isAlive());
    }
}
