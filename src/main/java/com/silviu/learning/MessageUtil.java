package com.silviu.learning;

/**
 * Created by silviu.parjolea on 14.03.2016.
 */
public class MessageUtil {
    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);
        return message;
    }

    public String salutationMessage() {
        message = "Hi! " + message;
        System.out.println(message);
        return message;
    }
}
