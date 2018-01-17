package com.feng.chapter3.demo4;

/**
 * @author jinx
 * @date 2018/1/16 21:45
 * Desc:
 */
public class ThreadA extends Thread {
    private Object object;

    public ThreadA(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        try {
            synchronized (object) {
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if (5 == MyList.getSize()) {
                        System.out.println("notify()了");
                        object.notify();
                    }
                    System.out.println("添加了:" + (i + 1) + "个元素！");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
