package com.silviu.learning;

import lombok.Getter;

/**
 * Created by silviu.parjolea on 15.03.2016.
 */
@Getter

public class Ship {

    private String coordAlpha;
    private Integer coordNum;
    private String direction;


//    Ship(String coordAlpha, Integer coordNum, String direction) {
//        this.coordAlpha = coordAlpha;
//        this.coordNum = coordNum;
//        this.direction = direction;
//
//    }

    public void setCoordAlpha() {
        String[] letters = new String[7];
        letters[0] = "a";
        letters[1] = "b";
        letters[2] = "c";
        letters[3] = "d";
        letters[4] = "e";
        letters[5] = "f";
        letters[6] = "g";
        this.coordAlpha = letters[(int) Math.floor(Math.random() * 8)];
    }
// test
    public void setCoordNum() {
        this.coordNum = (int) Math.floor(Math.random() * 8);
    }

    public void setDirection() {
        switch((int) Math.floor(Math.random() * 5)) {
            case 1: this.direction = "north";
                break;
            case 2: this.direction = "east";
                break;
            case 3: this.direction = "south";
                break;
            case 4: this.direction = "west";
                break;
            default: this.direction = "invalid";
                break;
        }
    }
}
