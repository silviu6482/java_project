package com.silviu.learning;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by silviu.parjolea on 14.03.2016.
 */
public class MessageUtilTest2 {
    String message = "Silviu";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage() {
        System.out.println("inside testSalutationMessage()");
        message = "Hi! " + "Silviu";
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }
}
