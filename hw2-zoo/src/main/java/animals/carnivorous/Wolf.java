package animals.carnivorous;
import animals.interfaces.Run;
import animals.interfaces.Voice;

public class Wolf extends Carnivorous implements Run, Voice {
    public Wolf() {
        this.name = "Волк";
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
