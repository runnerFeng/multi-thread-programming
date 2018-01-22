package com.feng.chapter3.demo9;

/**
 * @author jinx
 * @date 2018/1/22 22:21
 * Desc:过早的通知会打断程序的正常逻辑
 */
public class MyRun {
    private static Boolean isFirstRunB = false;
    private static String string = new String("");
    private static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            synchronized (string) {
                try {
                    while (isFirstRunB == false) {
                        System.out.println("begin wait");
                        string.wait();
                        System.out.println("end wait");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private static Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            synchronized (string) {
                System.out.println("begin notify");
                string.notify();
                System.out.println("end notify");
                isFirstRunB = true;
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread(runnable);
//        thread.start();
//        Thread thread1 = new Thread(runnable2);
//        thread1.start();

        Thread thread1 = new Thread(runnable2);
        thread1.start();
        Thread.sleep(100);
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
