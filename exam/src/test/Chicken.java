package test;

public class Chicken extends Pets implements ForFood, CanGiveResource {


    public Chicken(String name, int weight, int speed, int health) {
        super(name, weight, speed, health);
        setResource(weight);
    }

    @Override
    public int getResource() {
        return resource;
    }
    @Override
    public void setResource(int resource) {
        this.resource = resource;
    }


}
