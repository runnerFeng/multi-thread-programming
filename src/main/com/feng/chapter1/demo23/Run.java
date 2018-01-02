package com.feng.chapter1.demo23;

/**
 * @author jinx
 * @date 2018/1/2 22:32
 * Desc:释放锁的不良后果
 */
public class Run {
    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread myThread = new MyThread(object);
            myThread.start();
            Thread.sleep(500);
            myThread.stop();
            System.out.println(object.getUsername()+" "+object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
