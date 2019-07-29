package com.feng.chapter2.demo22;

/**
 * @author jinx
 * @date 2018/1/9 23:15
 * Desc:
 */
public class OutClass {
    static class InnerClass {
        public void method1() {
            synchronized ("其他锁对象") {
//            synchronized (this){
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " i:" + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        synchronized public void method2() {
            for (int i = 11; i <= 20; i++) {
                System.out.println(Thread.currentThread().getName() + " i:" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
