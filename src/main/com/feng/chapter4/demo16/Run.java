package com.feng.chapter4.demo16;

/**
 * @author jinx
 * @date 2018/03/22 23:02
 * Desc:boolean isFair() 判断该锁是否为公平锁
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = service::serviceMethod;
        Thread threadA = new Thread(runnable);
        threadA.start();

        final Service service1 = new Service(false);
        Runnable runnable1 = service1::serviceMethod;
        Thread threadB = new Thread(runnable1);
        threadB.start();
    }
}
