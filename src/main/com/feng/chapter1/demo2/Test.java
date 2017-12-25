package com.feng.chapter1.demo2;


/**
 * @author jinx
 * @date 2017/12/25 21:54
 * Desc:线程执行的随机性
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("myThread");
        myThread.start();
        for (int i = 0; i < 10; i++) {
            int time = (int) (Math.random()*1000);
            try {
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
