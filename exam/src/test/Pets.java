package test;

public class Pets extends Animal implements ForFood {
    protected int health;
    protected int resource;
    protected boolean eaten;
    protected boolean onFarm;
    protected int maxHealth;



    public void toEat(Pets pet){ }

    public void canRun(){}

    public boolean isOnFarm(boolean onFarm) {
        return this.onFarm;
    }

    public void setOnFarm(boolean onFarm) {
        this.onFarm = onFarm;
    }

    @Override
    public void eat() {
        addHealth();
    }

    public void addHealth(){
        if (health < maxHealth){
            health++;
        }
    }

    public int getHealth(int health) {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getResource(int resource) {
        return this.resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public boolean isEaten(boolean eaten) {
        return this.eaten;
    }

    public void setEaten(boolean eaten) {
        this.eaten = eaten;
    }

    @Override
    public void toBeEaten() {

    }
}
