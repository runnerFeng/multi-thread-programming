package com.feng.chapter3.demo18;

import java.io.PipedWriter;

/**
 * @author jinx
 * @date 2018/1/29 15:59
 * Desc:
 */
public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedWriter outputStream;

    public ThreadWrite(WriteData writeData, PipedWriter outputStream) {
        this.writeData = writeData;
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        writeData.writeMethod(outputStream);
    }
}
