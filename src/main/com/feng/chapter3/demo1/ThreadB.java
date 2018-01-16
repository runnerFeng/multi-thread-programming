package com.feng.chapter3.demo1;

/**
 * @author jinx
 * @date 2018/1/16 21:49
 * Desc:
 */
public class ThreadB extends Thread {
    private MyList list;

    public ThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            if (5 == list.getSize()) {
                list.getSize();
                System.out.println("==5了，线程b要退出了！");
                try {
                    throw new InterruptedException();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
