package test;

public class Farm {
    private Farmer farmer;
    private Forest forest;
    Pets[] pets = new Pets[5];
    int i = 1;  //  порядковый номер дня на ферме

    public Farm(Farmer farmer, Forest forest) {
        setFarmer(farmer);
        setForest(forest);
    }

    public void setForest(Forest forest) {
        this.forest = forest;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public void addPet(Pets pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null) {
                pets[i] = pet;
                pet.setOnFarm(true);
                break;
            }
        }
    }

    public void dayOnFarm() {
        while (true) {
            System.out.println("\n" + i + "-й день на ферме!");
            i++;
            if (farmer.getResource() > 2) {
                farmer.setResource(farmer.getResource() - 2);
                WildAnimals animal = forest.comeToFarm();
                if (animal != null) {
                    if (farmer.awayWildAnimals(animal)) {
                        animal.eatHomeAnimal(pets);
                    }
                }
                farmer.feedAnimals(pets);
                farmer.collectResource(pets);
            }else {
                break;
            }
        }
        System.out.println("Игра закончена, у фермера кончились ресурсы");
    }
}
