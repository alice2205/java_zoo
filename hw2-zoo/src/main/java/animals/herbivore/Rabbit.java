package animals.herbivore;
import enclosure.EnclosureSize;
import animals.interfaces.Run;

public class Rabbit extends Herbivore implements Run {
    public Rabbit() {
        this.name = "Заяц";
        this.enclosureSize = EnclosureSize.MEDIUM;
    }

    @Override
    public void run() {
        System.out.println("Заяц бегает");
    }
}
