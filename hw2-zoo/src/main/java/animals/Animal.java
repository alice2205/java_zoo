package animals;
import enclosure.EnclosureSize;
import food.Food;
import food.WrongFoodException;

import java.util.Objects;

public abstract class Animal {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    protected String name;
    protected EnclosureSize enclosureSize;
    protected int satiety = 0;
    private static int animalCount = 0;

    public EnclosureSize getEnclosureSize() {
        return enclosureSize;
    }

    public int getSatiety(int amountFood) {
        satiety += amountFood;
        return satiety;
    }

    {
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public String getName() {
        return name;
    }

    public abstract void eat(Food food) throws WrongFoodException;
}
