package com.feng.chapter2.demo1;

/**
 * @author jinx
 * @date 2018/1/3 18:24
 * Desc:方法中的变量是线程安全的，对比chapter.demo7实例变量非线程安全需用synchronized关键字
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
