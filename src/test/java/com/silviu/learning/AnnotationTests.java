package com.silviu.learning;

import org.testng.annotations.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by silviu.parjolea on 14.03.2016.
 */
public class AnnotationTests {

    private int range, rate, power, speed;
    private String type, name, color, weight, height;
    private Boolean status;
    private Tank tankA, tankB;


    @BeforeSuite
    public void valuesUpdateWE() {
        range = 1000;
        rate = 236;
        type = "diesel";
        power = 3500;
        speed = 50;

        System.out.println("Updated values Weapon & Engine: " + range + " " + rate + " " + type + " " + power + " " + speed);
    }

    @AfterSuite
    public void valuesResetWE() {
        range = 0;
        rate = 0;
        type = "x";
        power = 0;
        speed = 0;

        System.out.println("Default values Weapon & Engine: " + range + " " + rate + " " + type + " " + power + " " + speed);
    }

    @BeforeTest
    public void statusBefore() {
        name = "T-55";
        color = "brown";
        weight = "30 tons";
        height = "3,47 meters";

        System.out.println("Updated values Tank: " + name + " " + color + " " + weight + " " + height);

    }

    @AfterTest
    public void statusAfter() {
        System.out.println(status);
    }

    @BeforeClass
    public void valuesUpdateTank() {

        status = false;
        System.out.println(status);

        Weapon weapon1 = new Weapon(range, rate);
        Engine engine1 = new Engine(speed, type, power);

        Weapon weapon2 = new Weapon(1000, 236);
        Engine engine2 = new Engine(50, "diesel", 3500);

        tankA = new Tank(name, color, weight, height, engine1, weapon1);
        tankB = new Tank("T-55", "brown", "30 tons", "3,47 meters", engine2, weapon2);
    }

    @AfterClass
    public void valuesResetTank() {
        name = "x";
        color = "x";
        weight = "x";
        height = "x";

        System.out.println("Default values Tank: " + name + " " + color + " " + weight + " " + height);
    }

    @Test
    public void comparison() {

        status = true;
        assertThat(tankB, equalTo(tankA));
        assertThat(tankA.hashCode(), equalTo(tankB.hashCode()));
    }

}
