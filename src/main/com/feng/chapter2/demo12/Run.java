package com.feng.chapter2.demo12;

/**
 * @author jinx
 * @date 2018/1/4 21:49
 * Desc:
 */
public class Run {
    public static void main(String[] args) {
        MyList list = new MyList();
        ThreadA threadA = new ThreadA(list);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(list);
        threadB.setName("B");
        threadB.start();
    }
}
