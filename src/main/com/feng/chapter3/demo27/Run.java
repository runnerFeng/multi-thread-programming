package com.feng.chapter3.demo27;

/**
 * @author jinx
 * @date 2018/1/30 15:21
 * Desc:get返回null问题
 */
public class Run {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.start();

        ThreadB threadB = new ThreadB();
        threadB.start();
    }
}
