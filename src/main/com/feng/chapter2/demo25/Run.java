package com.feng.chapter2.demo25;

/**
 * @author jinx
 * @date 2018/1/11 23:49
 * Desc:锁对象属性的改变输出结果还是同步的
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        UserInfo userInfo = new UserInfo();
        ThreadA threadA = new ThreadA(service, userInfo);
        threadA.setName("a");
        threadA.start();
        Thread.sleep(2000);
        ThreadB threadB = new ThreadB(service, userInfo);
        threadB.setName("b");
        threadB.start();
    }
}
