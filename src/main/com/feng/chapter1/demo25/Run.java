package com.feng.chapter1.demo25;

/**
 * @author jinx
 * @date 2018/1/3 9:52
 * Desc:suspend()和resume()的使用
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(5000);
            //A段
            thread.suspend();
            System.out.println("A:"+System.currentTimeMillis()+" i "+thread.getI());
            Thread.sleep(5000);
            System.out.println("A:"+System.currentTimeMillis()+" i "+thread.getI());

            //B段
            thread.resume();
            Thread.sleep(5000);
            thread.suspend();
            System.out.println("B:"+System.currentTimeMillis()+" i "+thread.getI());
            Thread.sleep(5000);
            System.out.println("B:"+System.currentTimeMillis()+" i "+thread.getI());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
