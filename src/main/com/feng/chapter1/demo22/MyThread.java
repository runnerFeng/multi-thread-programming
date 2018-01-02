package com.feng.chapter1.demo22;

/**
 * @author jinx
 * @date 2018/1/2 21:39
 * Desc:
 */
public class MyThread extends Thread {
    private int i = 0;
    @Override
    public void run() {
        try {
            super.run();
            while (true){
                i++;
                System.out.println("i:"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
