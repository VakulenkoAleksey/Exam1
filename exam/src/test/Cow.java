package test;

public class Cow extends Pets implements ForFood, CanGiveResource {

    public Cow(String name, int weight, int speed, int health) {
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
