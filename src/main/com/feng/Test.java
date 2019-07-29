package com.feng;

/**
 * @author jinx
 * @date 2017/12/18 23:57
 * Desc:
 */
public class Test {
    public static void main(String[] args) {
//        ThreadPoolExecutor executor = new ThreadPoolExecutor();
//        executor.execute();
//        int c = Runtime.getRuntime().availableProcessors();
//        System.out.println(c);
//        System.out.println(11);
        if (true) {
            new Thread(() -> {
                try {
                    test1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        if (true) {
            new Thread(() -> {
                try {
                    test2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    public static void test1() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);
            System.out.println("test1:" + i);
        }
    }

    public static void test2() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);
            System.out.println("test2:" + i);
        }
    }
}
