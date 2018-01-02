package com.feng.chapter1.demo18;

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
            if (this.isInterrupted()) {
                System.out.println("已经是停止状态了，我要退出了！");
                break;
            }
            System.out.println("i " + (i + 1));
        }
        System.out.println("如果此代码被执行，说明线程并未停止！");
    }
}
