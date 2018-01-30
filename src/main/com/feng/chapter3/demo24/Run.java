package com.feng.chapter3.demo24;

/**
 * @author jinx
 * @date 2018/1/30 14:16
 * Desc:join后的代码提前执行
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        ThreadA threadA = new ThreadA(threadB);
        threadA.start();
        threadB.start();
        //释放锁,join方法是指threadB加入main线程的时间，即当threadB在main中实例化的那一刻就已经开始计算了，等到执行threadB.join(3000)时，线程会计算这个时间，如果时间早就到了那么立刻执行join之后的代码，否则等待时间。
        threadB.join(3000);
//        threadB.join(6000);

        System.out.println("main thread run");
    }
}
