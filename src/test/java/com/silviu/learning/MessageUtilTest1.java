package com.silviu.learning;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by silviu.parjolea on 14.03.2016.
 */
public class MessageUtilTest1 {
    String message = "Silviu";
    MessageUtil messageUtil = new MessageUtil(message);


    @Test
    public void testPrintMessage() {
        System.out.println("inside testPrintMessage()");
        Assert.assertEquals(message, messageUtil.printMessage());

    }
}
