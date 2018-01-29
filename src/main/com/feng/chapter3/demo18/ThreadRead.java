package com.feng.chapter3.demo18;

import java.io.PipedReader;

/**
 * @author jinx
 * @date 2018/1/29 16:01
 * Desc:
 */
public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedReader inputStream;

    public ThreadRead(ReadData readData, PipedReader inputStream) {
        this.readData = readData;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        readData.readMethod(inputStream);
    }
}
