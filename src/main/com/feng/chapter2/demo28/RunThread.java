package com.feng.chapter2.demo28;

/**
 * @author jinx
 * @date 2018/1/14 14:39
 * Desc:
 */
public class RunThread extends Thread {
    volatile private boolean isRunning = true;
//    private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("进入run方法");
        while (isRunning){}
        System.out.println("退出run方法");
    }
}
