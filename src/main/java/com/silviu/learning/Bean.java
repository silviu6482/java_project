package com.silviu.learning;

/**
 * Created by silviu.parjolea on 14.03.2016.
 */
public class Bean {
    private String val;
    private int i;

    public Bean (String val, int i) {
        this.val = val;
        this.i = i;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
