package animals.carnivorous;
import enclosure.EnclosureSize;
import animals.interfaces.Swim;

public class Fish extends Carnivorous implements Swim {
    public Fish() {
        //super("Рыба", EnclosureSize.SMALL);
        this.name = "Рыба";
        this.enclosureSize = EnclosureSize.SMALL;
    }

    @Override
    public void swim() {
        System.out.println("Рыба плавает");
    };
}
