package test;

public class Pets extends Animal {
    protected int health;
    protected boolean onFarm;
    protected int resource;
    protected int maxHealth = health;

    public Pets(String name, int weight, int speed, int health) {
        super(name, weight, speed);
        setHealth(health);
    }

    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public boolean isOnFarm() {
        return this.onFarm;
    }
    public void setOnFarm(boolean onFarm) {
        this.onFarm = onFarm;
    }


    public void toEat(Pets pet){}


    public void eat() {
        if (health < maxHealth){
            health++;
        }
    }
}
