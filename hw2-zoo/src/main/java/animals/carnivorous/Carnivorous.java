package animals.carnivorous;
import animals.Animal;
import food.Food;
import food.Meat;

public class Carnivorous extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            getSatiety(100);
            System.out.println(this.name + " ест " + food.getNameFood() + " и сытость теперь " + this.satiety + "%");
        } else {
            System.out.println(this.name + " не ест " + food.getNameFood());
        }
    }
}
