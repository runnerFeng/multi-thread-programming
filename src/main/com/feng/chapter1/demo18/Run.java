package com.feng.chapter1.demo18;

/**
 * @author jinx
 * @date 2018/1/2 18:12
 * Desc:break并未正真停止线程代码，如果for循环下还有代码会继续执行
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(3000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
