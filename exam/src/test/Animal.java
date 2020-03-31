package test;

public abstract class Animal {
    protected String name;
    protected int weight;
    protected int speed;

    public Animal(String name, int weight, int speed) {
        setName(name);
        setWeight(weight);
        setSpeed(speed);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
