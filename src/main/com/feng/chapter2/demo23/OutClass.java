package com.feng.chapter2.demo23;

/**
 * @author jinx
 * @date 2018/1/9 23:26
 * Desc:
 */
public class OutClass {
    static class InnerClass1 {
        public void method1(InnerClass2 innerClass2) {
            synchronized (innerClass2) {
                System.out.println(Thread.currentThread().getName() + "进入InnerClass1.method1方法");
                for (int i = 0; i < 10; i++) {
                    System.out.println("i:" + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "退出InnerClass1.method1方法");
            }
        }

        synchronized public void method2() {
            System.out.println(Thread.currentThread().getName() + "进入InnerClass1.method2方法");
            for (int j = 0; j < 10; j++) {
                System.out.println("j:" + j);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "退出InnerClass1.method2方法");
        }
    }

    static class InnerClass2 {
        synchronized public void method1() {
            System.out.println(Thread.currentThread().getName() + "进入InnerClass2.method1方法");
            for (int k = 0; k < 10; k++) {
                System.out.println("k:" + k);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "退出InnerClass2.method1方法");
        }
    }
}
