package com.feng.chapter1.demo16;


/**
 * @author jinx
 * @date 2018/1/2 14:11
 * Desc:
 */
public class Run3 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        //isInterrupted不具有清除状态的功能，所以输出为true true
        System.out.println("是否停止1："+Thread.currentThread().isInterrupted());
        System.out.println("是否停止2："+Thread.currentThread().isInterrupted());

    }
}
