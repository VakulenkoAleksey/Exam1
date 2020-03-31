package test;

public class Farmer {
    protected String name;
    protected int resource = 5;


    public Farmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }


    public void collectResource(Pets[] myPets) {

            for (int i = 0; i < myPets.length; i++) {
                if (myPets[i] instanceof CanGiveResource) {
                    if (myPets[i].resource > 0) {
                        resource++;
                        myPets[i].resource--;
                        System.out.println("Фермер собрал ресурс у животного " + myPets[i].name);
                    } else {
                        if (myPets[i] instanceof ForFood) {
                            System.out.println("Фермер съел животное - " + myPets[i].name);
                            myPets[i] = null;
                        }
                    }
                }
            }

    }

    public Boolean awayWildAnimals(WildAnimals animals) {
        if (animals.getStealth()) {
            System.out.println("Фермер не заметил как пришло дикое животное " + animals.getName());
            return true;
        } else {
            animals.setVisitsCount(animals.getVisitsCount() + 1);
            System.out.println("Фермер прогнал дикое животное " + animals.getName());
            return false;
        }
    }


    public void feedAnimals(Pets[] pets) {
        for (Pets pet : pets) {
            if (pet != null) {
                pet.eat();
                System.out.println(name + " покормил животное " + pet.getName());
            }
        }

    }
}
