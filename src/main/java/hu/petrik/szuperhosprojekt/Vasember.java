package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos {
    public Vasember() {
        super(150, true);
    }

    @Override
    public void kutyutKeszit() {
        Random random = new Random();
        double novekedes = random.nextDouble() * 10;
        this.setSzuperero(this.getSzuperero() + novekedes);
    }

    @Override
    public boolean megmentiAVilagot() {
        return this.getSzuperero() > 1000;
    }

    @Override
    public String toString() {
        return "Vasember: " + super.toString();
    }
}