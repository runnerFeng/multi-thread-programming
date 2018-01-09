package com.feng.chapter2.demo20;

/**
 * @author jinx
 * @date 2018/1/9 21:03
 * Desc:
 */
public class DealThread implements Runnable {
    private String username;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void setFlag(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        if ("a".equals(this.username)) {
            synchronized (lock1) {
                try {
                    System.out.println("username:" + username);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("按lock1->lock2顺序执行代码");
                }
            }
        }
        if ("b".equals(this.username)) {
            synchronized (lock2) {
                try {
                    System.out.println("username:" + username);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("按lock2->lock1顺序执行代码");
                }
            }
        }
    }
}
