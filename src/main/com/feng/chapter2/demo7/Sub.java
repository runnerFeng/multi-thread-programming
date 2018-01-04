package com.feng.chapter2.demo7;

/**
 * @author jinx
 * @date 2018/1/4 12:51
 * Desc:重入锁在继承关系中的调用
 */
public class Sub extends Main {
    synchronized public void operateISubMethod(){
        try {
            while (i>0){
                i--;
                System.out.println("sub print:"+i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
