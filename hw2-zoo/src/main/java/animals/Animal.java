package animals;
import food.Food;

public abstract class Animal {
    protected String name;
    protected int satiety = 0;
    private static int animalCount = 0;

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

    public abstract void eat(Food food);
}
