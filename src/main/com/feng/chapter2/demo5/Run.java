package com.feng.chapter2.demo5;

/**
 * @author jinx
 * @date 2018/1/4 11:35
 * Desc:脏读测试
 */
public class Run {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA threadA = new ThreadA(publicVar);
            threadA.start();
            //打印结果受此时间长短影响
            Thread.sleep(4000);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
