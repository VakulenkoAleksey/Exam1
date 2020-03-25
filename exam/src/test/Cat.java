package test;

public class Cat extends Pets implements ForFood {

    public Cat(String name, int weight, int speed, int health, boolean onFarm, boolean eaten) {
        getName(name);
        getWeight(weight);
        getSpeed(speed);
        getHealth(health);
        isEaten(eaten);
        isOnFarm(onFarm);
        getResource(0);
    }

    @Override
    public void toBeEaten() {

    }
}
