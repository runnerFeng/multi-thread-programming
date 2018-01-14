package com.feng.chapter2.demo27;

/**
 * @author jinx
 * @date 2018/1/12 22:29
 * Desc:使用多线程解决同步死循环问题
 *      思考：虽然使用多线程解决了同步死循环问题(因为造成死循环的代码main方法在两个不同的线程中——main线程和thread-0线程)，但是应该注意到此时的printString方法并没有执行，因为在while判断时
 *            PrintString类中的全部变量的值已经被修改为false；分析得在thread-0线程调用完start()方法之后该线程开始执行run方法所花费的时间大概是30~100毫秒之间(应该跟cpu性能相关)，而正在这
 *            段时间PrintString类的全局变量被修改。
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        PrintString printString = new PrintString();
        new Thread(printString).start();
//        Thread.sleep(30);
        Thread.sleep(100);
        System.out.println("stop printStringMethod:" + Thread.currentThread().getName());
        printString.setContinuePrintString(false);
    }
}
