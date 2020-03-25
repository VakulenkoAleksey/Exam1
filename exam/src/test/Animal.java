package test;

public abstract class Animal {
    protected String name;
    protected int weight;
    protected int speed;

    public void eat(){ }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight(int weight) {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed(int speed) {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
