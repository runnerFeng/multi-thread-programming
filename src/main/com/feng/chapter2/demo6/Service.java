package com.feng.chapter2.demo6;

/**
 * @author jinx
 * @date 2018/1/4 11:52
 * Desc:
 */
public class Service {
    synchronized public void service1(){
        System.out.println("service1");
        service2();
    } synchronized public void service2(){
        System.out.println("service2");
        service3();
    } synchronized public void service3(){
        System.out.println("service3");
    }
}
