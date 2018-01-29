package com.feng.chapter3.demo18;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * @author jinx
 * @date 2018/1/26 11:38
 * Desc:
 */
public class WriteData {
    public void writeMethod(PipedWriter out) {
        try {
            System.out.println("write:");
            for (int i = 0; i < 300; i++) {
                String outData = (i + 1) + "";
                out.write(outData);
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}