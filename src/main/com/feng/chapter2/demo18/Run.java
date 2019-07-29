package com.feng.chapter2.demo18;

/**
 * @author jinx
 * @date 2018/1/8 22:26
 * Desc:同步方法无限等待问题（都使用了this锁，而第一个方法在使用锁时正好死循环占用了this对象导致第二个方法不能进行），此例中线程B调用的方法不能执行，解决方法时使用同步方法。
 * 该例中中虽然使用了同步方法但是问题依然一样，因为该例子中虽然使用了Object对象作为锁，但是两个对象使用了同一个Object对象，所以等价于使用了this锁，所以问题的本质是不同的同步方法不要使用相同的锁对象
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
