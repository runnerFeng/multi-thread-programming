package com.feng.chapter2.demo24;

/**
 * @author jinx
 * @date 2018/1/11 21:38
 * Desc:锁对象的变换，虽然testMethod加了锁，但是因为在sleep(200)后锁对象其实已经由"123"转为了"456"，故输出已经不同步了，但是把sleep(200)注释掉则输出同步，因为在修改掉锁对象之前，两个线程已经持有了相同的锁对象
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService= new MyService();
        ThreadA thread1 = new ThreadA(myService);
        thread1.setName("a");
        ThreadB thread2 = new ThreadB(myService);
        thread2.setName("b");
        thread1.start();
//        Thread.sleep(200);
        thread2.start();
    }
    /* output:
    *  a start
    *  b start
    *  a end
    *  b end
    * */
}
