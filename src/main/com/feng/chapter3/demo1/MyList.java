package com.feng.chapter3.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinx
 * @date 2018/1/16 21:44
 * Desc:
 */
public class MyList {
    private  List list = new ArrayList<>();

    public void add() {
        list.add("高红艳");
    }

    public int getSize() {
        return list.size();
    }
}
