package com.feng.chapter3.demo18;

import java.io.*;

/**
 * @author jinx
 * @date 2018/1/29 16:02
 * Desc:通过管道进行线程间的通信：字符流
 */
public class Run {
    public static void main(String[] args) throws InterruptedException, IOException {
        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();

        PipedReader inputStream = new PipedReader();
        PipedWriter outputStream = new PipedWriter();
        inputStream.connect(outputStream);

        ThreadRead threadRead = new ThreadRead(readData, inputStream);
        threadRead.start();

        Thread.sleep(2000);

        ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
        threadWrite.start();


    }
}
