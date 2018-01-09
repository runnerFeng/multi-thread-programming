package com.feng.chapter2.demo20;

/**
 * @author jinx
 * @date 2018/1/9 21:32
 * Desc:多线程死锁，本例通过嵌套同步方法实现死锁；如果【互相等待】对方释放锁就有可能出现死锁。
 */
public class Run {
    public static void main(String[] args) {
        try {
            DealThread dealThread = new DealThread();
            dealThread.setFlag("a");
            Thread thread1 = new Thread(dealThread);
            thread1.start();
            Thread.sleep(200);
            dealThread.setFlag("b");
            Thread thread2 = new Thread(dealThread);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
