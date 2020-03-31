package test;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Forest forest = new Forest();
        Wolf wolf = new Wolf("Волк", random.nextInt(50 + 1) + 50, random.nextInt(5+1)+5,
                random.nextInt(30 + 1) + 50);
        Bear bear = new Bear("Медведь", random.nextInt(100+1)+400, random.nextInt(3+1)+3,
                random.nextInt(20+1)+80);
        Fox fox = new Fox("Лиса", random.nextInt(10+1)+10, random.nextInt(3+1)+3,
                random.nextInt(30+1)+10);

        forest.setWildAnimals(wolf);
        forest.setWildAnimals(bear);
        forest.setWildAnimals(fox);

        Farmer farmer = new Farmer("Фермер");
        Farm farm = new Farm(farmer, forest);
        Cat cat = new Cat("Кот", random.nextInt(5+1)+5, random.nextInt(+5+1)+5,
                random.nextInt(30+1)+10);
        Cow cow = new Cow("Корова", random.nextInt(100+1)+400, random.nextInt(3+1)+3,
                random.nextInt(20+1)+80);
        Bunny bunny = new Bunny("Заяц", random.nextInt(3+1)+3, random.nextInt(5+1)+5,
                random.nextInt(30+1)+10);
        Chicken chicken = new Chicken("Курица", random.nextInt(2+1)+1,
                random.nextInt(2+1)+1, random.nextInt(10)+1);

        farm.addPet(cat);
        farm.addPet(cow);
        farm.addPet(chicken);
        farm.addPet(bunny);

        farm.dayOnFarm();
    }
}
