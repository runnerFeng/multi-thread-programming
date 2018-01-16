package com.feng.chapter3.demo1;

/**
 * @author jinx
 * @date 2018/1/16 21:52
 * Desc:等待/通信机制；该例中两个线程不能通信故线程A执行完线程B也未执行
 */
public class Run {
    public static void main(String[] args) {
        MyList myList = new MyList();
        ThreadA threadA = new ThreadA(myList);
        threadA.start();
        ThreadB threadB = new ThreadB(myList);
        threadB.start();
    }
}
