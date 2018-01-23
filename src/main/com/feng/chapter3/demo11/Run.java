package com.feng.chapter3.demo11;

/**
 * @author jinx
 * @date 2018/1/23 21:48
 * Desc:生产者消费者模式：一个生产者一个消费者 操作值
 */
public class Run {
    public static void main(String[] args) {
        String s = new String("");
        P p = new P(s);
        C c = new C(s);
        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(c);
        threadP.start();
        threadC.start();
    }
}
