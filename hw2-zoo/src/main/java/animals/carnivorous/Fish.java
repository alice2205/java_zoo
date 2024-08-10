package animals.carnivorous;
import animals.interfaces.Swim;

public class Fish extends Carnivorous implements Swim {
    public Fish() {
        this.name = "Рыба";
    }

    @Override
    public void swim() {
        System.out.println("Рыба плавает");
    };
}
