package com.feng.chapter1.demo16;

/**
 * @author jinx
 * @date 2018/1/2 14:11
 * Desc:
 */
public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        //interrupted具有清除状态的功能，所以输出为true false
        System.out.println("是否停止1：" + Thread.interrupted());
        System.out.println("是否停止2：" + Thread.interrupted());
    }
}
