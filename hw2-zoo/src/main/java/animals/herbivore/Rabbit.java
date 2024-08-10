package animals.herbivore;
import animals.interfaces.Run;

public class Rabbit extends Herbivore implements Run {
    public Rabbit() {
        this.name = "Заяц";
    }

    @Override
    public void run() {
        System.out.println("Заяц бегает");
    }
}
