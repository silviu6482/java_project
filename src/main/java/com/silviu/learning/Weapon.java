package com.silviu.learning;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by trainingPC on 2/10/2016.
 */
@Getter
@Setter
@EqualsAndHashCode
public class Weapon {

    private int fireRange;
    private int fireRate;

    Weapon (int fireRange, int fireRate) {
        this.fireRange = fireRange;
        this.fireRate = fireRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weapon)) return false;

        Weapon weapon = (Weapon) o;

        if (getFireRange() != weapon.getFireRange()) return false;
        return getFireRate() == weapon.getFireRate();

    }

    @Override
    public int hashCode() {
        int result = getFireRange();
        result = 31 * result + getFireRate();
        return result;
    }

//    public int getFireRange() {
//        return fireRange;
//    }
//
//    public int getFireRate() {
//        return fireRate;
//    }
//
//    public void setFireRate(int fireRate) {
//        this.fireRate = fireRate;
//    }
//
//    public void setFireRange(int fireRange) {
//        this.fireRange = fireRange;
//    }
}


