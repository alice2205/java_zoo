package animals.herbivore;
import animals.Animal;
import food.Food;
import food.Grass;

public class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            getSatiety(97);
            System.out.println(this.name + " ест " + food.getNameFood() + " и сытость теперь " + this.satiety + "%");
        } else {
            System.out.println(this.name + " не ест " + food.getNameFood());
        }
    }
}
