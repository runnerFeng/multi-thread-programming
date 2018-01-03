package com.feng.chapter1.demo28;

/**
 * @author jinx
 * @date 2018/1/3 11:36
 * Desc:suspend()和resume()方法不同步
 */
public class Run {
    public static void main(String[] args) {
        try {
            final MyObject object = new MyObject();
            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    object.setValue("a", "aa");
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(2000);

            Thread thread2 = new Thread() {
                @Override
                public void run() {
                    object.printUsernameAndPassword();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
