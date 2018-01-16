package com.feng.chapter2.demo32;

/**
 * @author jinx
 * @date 2018/1/14 22:56
 * Desc:该测试中虽然addAndGet方法内是原子性的，但是两次调用却不能保证同步，所以输出结果有误，解决这样的问题必须使用同步。
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThread[] threads = new MyThread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new MyThread(service);
        }
        for (int i = 0; i < 5; i++) {
            threads[i].start();
        }
        Thread.sleep(100);
        System.out.println(MyService.atomicLong.get());

    }
}
