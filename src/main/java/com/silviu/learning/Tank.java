package com.silviu.learning;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by trainingPC on 2/9/2016.
 */
@Getter
@Setter
@EqualsAndHashCode

public class Tank {
    private String name;
    private String color;
    private String weight;
    private String height;
    private Engine engine;
    private Weapon weapon;

    Tank(String name, String color, String weight, String height, Engine engine, Weapon weapon) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.engine = engine;
        this.weapon = weapon;
    }

    Tank(Engine engine, Weapon weapon) {
        this.engine = engine;
        this.weapon = weapon;
    }

    public String toString() {
        return "Name: " + this.name + "\n" +
                "Color: " + this.color + "\n" +
                "Weight: " + this.weight + "\n" +
                "Height: " + this.height + "\n" +
                "Engine type: " + this.engine.getType() + "\n" +
                "Engine power: " + this.engine.getPower() + "\n" +
                "Engine max speed: " + this.engine.getMaxSpeed() + "\n" +
                "Weapon fire range: " + this.weapon.getFireRange() + "\n" +
                "Weapon fire rate: " + this.weapon.getFireRate();

    }


//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getColor() {
//        return this.color;
//    }
//
//    public void setWeight(String weight) {
//        this.weight = weight;
//    }
//
//    public String getWeight() {
//        return this.weight;
//    }
//
//    public void setHeight(String height) { this.height = height; }
//
//    public String getHeight() {
//        return this.height;
//    }
//
//    public Engine getEngine() {
//        return engine;
//    }
//
//    public Weapon getWeapon() {
//        return weapon;
//    }
//
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }
//
//    public void setWeapon(Weapon weapon) {
//        this.weapon = weapon;
//    }

    public void moveTank(int direction, int speed) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tank)) return false;

        Tank tank = (Tank) o;

        if (getName() != null ? !getName().equals(tank.getName()) : tank.getName() != null) return false;
        if (getColor() != null ? !getColor().equals(tank.getColor()) : tank.getColor() != null) return false;
        if (getWeight() != null ? !getWeight().equals(tank.getWeight()) : tank.getWeight() != null) return false;
        if (getHeight() != null ? !getHeight().equals(tank.getHeight()) : tank.getHeight() != null) return false;
        if (getEngine() != null ? !getEngine().equals(tank.getEngine()) : tank.getEngine() != null) return false;
        return getWeapon() != null ? getWeapon().equals(tank.getWeapon()) : tank.getWeapon() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + (getWeight() != null ? getWeight().hashCode() : 0);
        result = 31 * result + (getHeight() != null ? getHeight().hashCode() : 0);
        result = 31 * result + (getEngine() != null ? getEngine().hashCode() : 0);
        result = 31 * result + (getWeapon() != null ? getWeapon().hashCode() : 0);
        return result;
    }
}
