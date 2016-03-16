package com.silviu.learning;

import org.testng.annotations.*;

/**
 * Created by silviu.parjolea on 14.03.2016.
 */
public class ParamsTest1 {
    @Test
    @Parameters("myName")
    public void paramTest(String myName) {
        System.out.println("Parameter value is: " + myName);
    }
}
