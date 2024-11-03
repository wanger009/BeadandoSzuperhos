package hu.petrik.szuperhosprojekt;

public class Batman implements Szuperhos, Milliardos {
    private double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        return this.mekkoraAzEreje() > szuperhos.mekkoraAzEreje();
    }

    @Override
    public double mekkoraAzEreje() {
        return this.lelemenyesseg * 2;
    }

    @Override
    public String toString() {
        return "Batman: leleményesség: " + String.format("%.2f", this.lelemenyesseg);
    }
}