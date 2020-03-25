package test;

public abstract class WildAnimals extends Animal {
    protected int power;
    protected boolean outCast;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isOutCast() {
        return outCast;
    }

    public void setOutCast(boolean outCast) {
        this.outCast = outCast;
    }
}
