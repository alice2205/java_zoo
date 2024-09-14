package animals.carnivorous;
import enclosure.EnclosureSize;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Lion extends Carnivorous implements Run, Swim, Voice {
    public Lion() {
        this.name = "Лев";
        this.enclosureSize = EnclosureSize.LARGE;
    }

    @Override
    public void run () {
        System.out.println("Лев бегает");
    };

    @Override
    public void swim () {
        System.out.println("Лев плавает");
    };

    @Override
    public String voice() {
        return "Лев рычит";
    }
}
