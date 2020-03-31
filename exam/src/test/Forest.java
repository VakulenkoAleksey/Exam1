package test;

import java.util.Random;

public class Forest {
    protected WildAnimals[] wildAnimals = new WildAnimals[3];
    private int animalInForest;


    Random random = new Random();

    public void setWildAnimals(WildAnimals animal) {
        for (int i = 0; i < wildAnimals.length; i++) {
            if (wildAnimals[i] == null) {
                wildAnimals[i] = animal;
                animalInForest++;
                break;
            }
        }
    }

    public WildAnimals comeToFarm() {
        int x = random.nextInt(animalInForest);
        if (wildAnimals[x].visitsCount <= 3) {
            wildAnimals[x].setStealth(random.nextBoolean());
            wildAnimals[x].visitsCount++;
            System.out.println("На ферму пришло животное " + wildAnimals[x].getName());
            return wildAnimals[x];
        }
        return null;
    }
}

