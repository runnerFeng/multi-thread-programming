package com.feng.chapter1.demo26;

/**
 * @author jinx
 * @date 2018/1/3 10:08
 * Desc:suspend()和resume()方法的缺点：独占锁
 */
public class SynchronizedObject {
    synchronized public void printString(){
        System.out.println("begin");
        if (("a").equals(Thread.currentThread().getName())){
            System.out.println("a线程永远suspend了！");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
