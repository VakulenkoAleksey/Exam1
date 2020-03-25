package test;

public class Farm {
    private Farmer farmer;
    Pets[] pets = new Pets[10];


    public void addPet(Pets pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null) {
                pets[i] = pet;
                pet.setOnFarm(true);
                pet.isOnFarm(true);
            }
        }
    }
public void dayOnFarm(){
        farmer.resource -=2;
        farmer.collectResource(pets);
}

}
