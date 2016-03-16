package com.silviu.learning;

import org.testng.annotations.*;


/**
 * Created by silviu.parjolea on 14.03.2016.
 */
public class ParamsTestDataProvider2 {
    @DataProvider(name = "test3")
    public static Object[][] primeNumbers() {
        return new Object[][] { { new Bean("hi I am the bean", 111) } };
    }

    @Test(dataProvider = "test3")
    public void testMethod(Bean myBean) {
        System.out.println(myBean.getVal() + " " + myBean.getI());
    }
}
