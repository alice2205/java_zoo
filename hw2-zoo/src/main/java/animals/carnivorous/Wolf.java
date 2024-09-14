package animals.carnivorous;
import enclosure.EnclosureSize;
import animals.interfaces.Run;
import animals.interfaces.Voice;

public class Wolf extends Carnivorous implements Run, Voice {
    public Wolf() {
        this.name = "Волк";
        this.enclosureSize = EnclosureSize.MEDIUM;
    }

    @Override
    public void run() {
        System.out.println("Волк бегает");
    };

    @Override
    public String voice() {
        return "Волк воет";
    }
}
