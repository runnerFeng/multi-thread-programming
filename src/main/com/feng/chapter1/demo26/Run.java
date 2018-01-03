package com.feng.chapter1.demo26;

/**
 * @author jinx
 * @date 2018/1/3 10:16
 * Desc:
 */
public class Run {
    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(2000);

            Thread thread2 = new Thread() {
                @Override
                public void run() {
                    System.out.println("thread2启动了，但是进入不了printString()方法！，因为printString()方法被a线程锁定并且永远suspend暂停了！");
                    object.printString();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
