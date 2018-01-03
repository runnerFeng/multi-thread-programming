package com.feng.chapter2.demo1;

/**
 * @author jinx
 * @date 2018/1/3 18:24
 * Desc:
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(hasSelfPrivateNum);
        threadA.start();
        ThreadB threadB  = new ThreadB(hasSelfPrivateNum);
        threadB.start();
    }
}
