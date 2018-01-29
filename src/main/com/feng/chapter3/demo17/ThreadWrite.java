package com.feng.chapter3.demo17;

import java.io.PipedOutputStream;

/**
 * @author jinx
 * @date 2018/1/29 15:59
 * Desc:
 */
public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedOutputStream outputStream;

    public ThreadWrite(WriteData writeData, PipedOutputStream outputStream) {
        this.writeData = writeData;
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        writeData.writeMethod(outputStream);
    }
}
