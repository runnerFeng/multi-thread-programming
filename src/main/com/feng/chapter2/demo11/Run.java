package com.feng.chapter2.demo11;

/**
 * @author jinx
 * @date 2018/1/4 21:25
 * Desc:synchronized(非this对象)，注意此非this对象必须是同一个对象,否则就会出现异步，该例子中为anything，这种方式不会与其他的锁this对象争抢this锁，可以大大提高效率
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();
    }
}
