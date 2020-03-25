package test;

public class Farmer {
    protected String name;
    protected int resource;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Farmer(String name) {
        this.name = name;
        this.resource = 5;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }
    
    public void collectResource(Pets[] myPets){
        for (Pets myPet : myPets) {
            if (myPet instanceof CanGiveResource && myPet.onFarm) {
                if (myPet.resource > 0) {
                    resource += ((CanGiveResource) myPet).giveResource();
                    myPet.setResource(0);
                }else {
                    System.out.println("Фермер съел " + myPet.name);
                    myPet = null;
                }
            }
        }
    }
    private void awayWildAnimals(){

    }
}
