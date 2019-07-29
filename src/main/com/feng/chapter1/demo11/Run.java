package com.feng.chapter1.demo11;

/**
 * @author jinx
 * @date 2017/12/29 14:51
 * Desc:isAlive()方法
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("begin:" + myThread.isAlive());
        myThread.start();
        //此值虽然打印为true,，但是此值是不确定的，此处打印true是应为myThread还未执行完毕
        System.out.println("end:" + myThread.isAlive());
    }
}
