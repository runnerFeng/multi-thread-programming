package com.feng.chapter1.demo13;

/**
 * @author jinx
 * @date 2017/12/29 17:10
 * Desc:
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("bengin:"+System.currentTimeMillis());
        myThread.run();
        System.out.println("end:"+System.currentTimeMillis());
    }
}
