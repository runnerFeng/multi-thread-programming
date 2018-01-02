package com.feng.chapter1.demo17;

/**
 * @author jinx
 * @date 2018/1/2 13:55
 * Desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5000000; i++) {
            if (this.isInterrupted()){
                System.out.println("已经是停止状态了，我要退出了！");
                break;
            }
            System.out.println("i "+(i+1));
        }
    }
}
