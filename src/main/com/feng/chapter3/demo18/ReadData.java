package com.feng.chapter3.demo18;

import java.io.IOException;
import java.io.PipedReader;

/**
 * @author jinx
 * @date 2018/1/29 15:50
 * Desc:
 */
public class ReadData {
    public void readMethod(PipedReader input) {
        try {
            System.out.println("read:");
            char[] charArray = new char[20];
            int readLength = input.read(charArray);
            while (readLength != -1) {
                String newData = new String(charArray, 0, readLength);
                System.out.print(newData);
                readLength = input.read(charArray);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
