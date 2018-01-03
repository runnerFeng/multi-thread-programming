package com.feng.chapter1.demo33;

/**
 * @author jinx
 * @date 2018/1/3 17:41
 * Desc:守护线程，当非守护线程结束后，守护线程也会自动销毁
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("我" + Thread.currentThread().getName() + "线程执行完后，thread守护线程也就停止了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
