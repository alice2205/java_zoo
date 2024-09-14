package animals.herbivore;
import enclosure.EnclosureSize;
import animals.interfaces.Fly;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {
    public Duck() {
        this.name = "Утка";
        this.enclosureSize = EnclosureSize.MEDIUM;
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }

    @Override
    public void run() {
        System.out.println("Утка бегает");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }

    @Override
    public String voice() {
        return "Утка крякает";
    }
}
