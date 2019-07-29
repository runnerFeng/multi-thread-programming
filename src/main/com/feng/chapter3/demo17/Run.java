package com.feng.chapter3.demo17;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author jinx
 * @date 2018/1/29 16:02
 * Desc:通过管道进行线程间的通信：字节流
 */
public class Run {
    public static void main(String[] args) throws InterruptedException, IOException {
        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();

        PipedInputStream inputStream = new PipedInputStream();
        PipedOutputStream outputStream = new PipedOutputStream();
        inputStream.connect(outputStream);

        ThreadRead threadRead = new ThreadRead(readData, inputStream);
        threadRead.start();

        Thread.sleep(2000);

        ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
        threadWrite.start();


    }
}
