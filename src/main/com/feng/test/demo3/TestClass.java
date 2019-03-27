package com.feng.test.demo3;

import java.math.BigInteger;

/**
 * @author jinx
 * @date 2018/1/25 10:34
 * Desc:pow()指数函数
 */
public class TestClass {
    public static void main(String[] args) {
        TestInterface[] testInterfaces = new TestInterface[10];
        BigInteger x = BigInteger.valueOf(2).pow(256);
        System.out.println(x);
    }
}
