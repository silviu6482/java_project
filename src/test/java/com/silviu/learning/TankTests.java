package com.silviu.learning;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by trainingPC on 2/10/2016.
 */
public class TankTests {

    @Test
    public void setTankA() {

        Weapon weapon = new Weapon(1000, 236);
        Engine engine = new Engine(50, "diesel", 3500);

        Tank tankA = new Tank("T-55", "brown", "30 tons", "3,47 meters", engine, weapon);

        System.out.println(tankA.getName()+"\n"+tankA.getHeight());

        tankA.setColor("light-dark");
        System.out.println(tankA.getColor());

        System.out.println(tankA.getWeapon().getFireRate());

        tankA.getEngine().setPower(tankA.getEngine().getPower() + 500);
        System.out.println(tankA.getEngine().getPower());
//        String[] tankEngine = TankA.getEngine();
//        tankEngine[2] = "4000 horse power";
//        TankA.setEngine(tankEngine[0], tankEngine[1], tankEngine[2]);
//        System.out.println(Arrays.toString(TankA.getEngine()));

//        System.out.println(TankA.getName()+"\n"+TankA.getHeight()+"\n"+TankA.getColor()+"\n"+TankA.getWeapon());
//        System.out.println("" + TankA.toString());
    }

    @Test
    public void setTankB() {

        Weapon weapon = new Weapon(2000, 336);
        Engine engine = new Engine(100, "electric", 7000);

        Tank tankB = new Tank(engine, weapon);
        tankB.setName("A-80");
        tankB.setColor("pink");
        tankB.setWeight("20 tons");
        tankB.setHeight("4.01 meters");

        System.out.println(tankB);
    }

    @Test
    public void comparison() {
        Weapon weapon1 = new Weapon(1000, 236);
        Engine engine1 = new Engine(50, "diesel", 3500);

        Weapon weapon2 = new Weapon(1000, 236);
        Engine engine2 = new Engine(50, "diesel", 3500);

        Tank tankA = new Tank("T-55", "brown", "30 tons", "3,47 meters", engine1, weapon1);
        Tank tankB = new Tank("T-55", "brown", "30 tons", "3,47 meters", engine2, weapon2);

//        tankB.getEngine().setPower(tankB.getEngine().getPower() - 500);
//        System.out.println(tankB.getEngine().getPower());
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>" + tankA.equals(tankB));
//        assertThat(tankB.getEngine(), equalTo(tankA.getEngine()));
        assertThat(tankB, equalTo(tankA));
        assertThat(tankA.hashCode(), equalTo(tankB.hashCode()));
        System.out.println(tankA.hashCode());
        System.out.println(tankB.hashCode());
    }
}
