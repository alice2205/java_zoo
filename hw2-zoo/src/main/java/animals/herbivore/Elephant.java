package animals.herbivore;
import enclosure.EnclosureSize;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Elephant extends Herbivore implements Run, Swim, Voice {
    public Elephant() {
        this.name = "Слон";
        this.enclosureSize = EnclosureSize.HUGE;
    }

    @Override
    public void run() {
        System.out.println("Слон бегает");
    }

    @Override
    public void swim() {
        System.out.println("Слон плавает");
    }

    @Override
    public String voice() {
        return  "Слон издает звук";
    }
}
