package com.feng.chapter3.demo17;

import java.io.PipedInputStream;

/**
 * @author jinx
 * @date 2018/1/29 16:01
 * Desc:
 */
public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedInputStream inputStream;

    public ThreadRead(ReadData readData, PipedInputStream inputStream) {
        this.readData = readData;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        readData.readMethod(inputStream);
    }
}
