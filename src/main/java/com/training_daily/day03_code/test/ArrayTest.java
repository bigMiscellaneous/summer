package com.training_daily.day03_code.test;

import com.training_daily.day03_code.arraydemo.Array;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayTest {

    @Before
    public void init(){
        System.out.println("init...");
    }

    @Test
    public void testAdd(){
        Array array = new Array();
        array.addFirst(1);
        array.add(1,2);
        System.out.println(array);
    }

    @After
    public void close(){
        System.out.println("close....");
    }
}
