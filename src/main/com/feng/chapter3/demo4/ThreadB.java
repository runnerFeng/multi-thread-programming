package com.feng.chapter3.demo4;

/**
 * @author jinx
 * @date 2018/1/16 21:49
 * Desc:
 */
public class ThreadB extends Thread {
    private Object object;

    public ThreadB(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object) {
            try {
                if (5 != MyList.getSize()) {
                    System.out.println("wait begin");
                    object.wait();
                    System.out.println("wait end");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
