package com.silviu.learning;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by trainingPC on 2/10/2016.
 */
@Getter
@Setter
public class Engine {

    private int maxSpeed;
    private String type;
    private int power;

    Engine (int maxSpeed, String type, int power) {
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;

        Engine engine = (Engine) o;

        if (getMaxSpeed() != engine.getMaxSpeed()) return false;
        if (getPower() != engine.getPower()) return false;
        return getType() != null ? getType().equals(engine.getType()) : engine.getType() == null;

    }

    @Override
    public int hashCode() {
        int result = getMaxSpeed();
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + getPower();
        return result;
    }

//    public int getPower() {
//        return power;
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = maxSpeed;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public void setPower(int power) {
//        this.power = power;
//    }
}
