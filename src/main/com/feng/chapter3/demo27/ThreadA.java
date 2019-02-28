package com.feng.chapter3.demo27;

import java.util.Date;

/**
 * @author jinx
 * @date 2018/1/30 15:18
 * Desc:
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (null == Tools.t.get()) {
                Tools.t.set(new Date());
            }
            System.out.println("threadA get value:" + Tools.t.get());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
