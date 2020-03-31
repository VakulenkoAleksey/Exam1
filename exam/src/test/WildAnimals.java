package test;

import java.util.Random;

public abstract class WildAnimals extends Animal {
    protected int power;
    protected int visitsCount; //кол-во посещений, когда фермер прогнал животное
    protected boolean stealth; //незаметность дикого животного

    Random random = new Random();

    public WildAnimals(String name, int weight, int speed) {
        super(name, weight, speed);
    }

    public boolean getStealth() {
        return stealth;
    }
    public void setStealth(boolean stealth) {
        this.stealth = stealth;
    }
    public int getVisitsCount() {
        return visitsCount;
    }
    public void setVisitsCount(int visitsCount) {
        this.visitsCount = visitsCount;
    }
    public void setPower(int power) {
        this.power = power;
    }


    public void eatHomeAnimal(Pets[] pets){
        int i = random.nextInt(pets.length);
        if (pets[i] != null) {
            if (speed > pets[i].getSpeed()) {
                int liveCount = pets[i].health - power;
                if (liveCount > 0) {
                    pets[i].setHealth(liveCount);
                    System.out.println("Домашнее животное " + pets[i].getName() + " было поколечено");
                } else {
                    System.out.println("Домашнее животное " + pets[i].getName() + " было съедено");
                    pets[i] = null;
                }
            } else {
                System.out.println("Дикое животное не догнало домашнее животное " + pets[i].getName());
            }
        }else {
            System.out.println("Дикое животное не нашло домашних животных.");
        }
    }
}
