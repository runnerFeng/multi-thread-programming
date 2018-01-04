package com.feng.chapter2.demo12;

/**
 * @author jinx
 * @date 2018/1/4 21:47
 * Desc:
 */
public class ThreadA extends Thread {
    MyList list  = new MyList();

    public ThreadA(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
        list.add("threadA"+i);
        }
    }
}
