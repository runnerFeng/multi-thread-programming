package com.feng.chapter2.demo23;

/**
 * @author jinx
 * @date 2018/1/9 23:42
 * Desc:该测试中InnerClass.method1和InnerClass2.method2持有相同的锁（InnerClass2的this对象锁），故这两个方法的输出是同步的。而InnerClass1.method2持有的锁时InnerClass1的this锁，故跟其他两个方法输出异步。
 */
public class Run {
    public static void main(String[] args) {
        OutClass.InnerClass1 innerClass1 = new OutClass.InnerClass1();
        OutClass.InnerClass2 innerClass2 = new OutClass.InnerClass2();
        Thread thread1 = new Thread(() -> innerClass1.method1(innerClass2), "A");
        Thread thread2 = new Thread(innerClass1::method2, "B");
        Thread thread3 = new Thread(() -> innerClass2.method1(), "C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
