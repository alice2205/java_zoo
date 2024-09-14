import animals.Animal;
import enclosure.Enclosure;
import enclosure.EnclosureSize;
import animals.carnivorous.Carnivorous;
import animals.carnivorous.Fish;
import animals.carnivorous.Lion;
import animals.carnivorous.Wolf;
import animals.herbivore.Duck;
import animals.herbivore.Elephant;
import animals.herbivore.Herbivore;
import animals.herbivore.Rabbit;
import animals.interfaces.Swim;
import enclosure.WrongEnclosureSizeException;
import food.Grass;
import food.Meat;
import food.WrongFoodException;

import java.util.Optional;
import java.util.Set;

public class Zoo {
    public static void main(String[] args) throws WrongFoodException {
        Lion lion = new Lion();
        Fish fish = new Fish();
        Wolf wolf = new Wolf();
        Duck duck_1 = new Duck();
        Duck duck_2 = new Duck();
        Elephant elephant = new Elephant();
        Rabbit rabbit = new Rabbit();
        Worker worker = new Worker();

        Meat meat = new Meat();
        Grass grass = new Grass();

        System.out.println("Всего животных в зоопарке " + Animal.getAnimalCount() + ", их день проходит обычно вот так:");

        fish.swim();
        lion.swim();
        lion.run();
        wolf.run();
        duck_1.fly();
        duck_1.run();
        duck_1.swim();
        elephant.run();
        elephant.swim();
        rabbit.run();

        System.out.println("\uA540 \uA540 пруд \uA540 \uA540");
        Swim[] pond = { fish, duck_1, elephant, lion, duck_2 };
        for (Swim swimmer : pond) {
            swimmer.swim();
        }
        System.out.println("\uA540 \uA540 пруд \uA540 \uA540");
        System.out.println("Всего в пруду плавает " + pond.length + " зверей");

        System.out.println(":::Животные подают голос рабочему:::");
        worker.getVoice(duck_1);
        worker.getVoice(lion);
        worker.getVoice(wolf);
        worker.getVoice(elephant);


        System.out.println(":::Рабочий кормит животных:::");
        try {
            worker.feed(fish, meat);
        } catch (WrongFoodException e) {
            System.out.println(e.getMessage());
        }

        try {
            worker.feed(lion, grass);
        } catch (WrongFoodException e) {
            System.out.println(e.getMessage());
        }

        try {
            worker.feed(wolf, meat);
        } catch (WrongFoodException e) {
            System.out.println(e.getMessage());
        }

        try {
            worker.feed(duck_1, grass);
        } catch (WrongFoodException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(":::Вольер:::");
        Enclosure<Carnivorous> carnivorousEnclosure = new Enclosure<>(EnclosureSize.LARGE, "вольере для хищников");
        Enclosure<Herbivore> herbivoreEnclosure = new Enclosure<>(EnclosureSize.LARGE, "вольере для травоядных");

        try {
            carnivorousEnclosure.addAnimal(lion);
        } catch (WrongEnclosureSizeException e) {
            System.out.println(e.getMessage());
        }

        try {
            carnivorousEnclosure.addAnimal(wolf);
        } catch (WrongEnclosureSizeException e) {
            System.out.println(e.getMessage());
        }

        try {
            herbivoreEnclosure.addAnimal(elephant);
        } catch (WrongEnclosureSizeException e) {
            System.out.println(e.getMessage());
        }

        try {
            herbivoreEnclosure.addAnimal(rabbit);
        } catch (WrongEnclosureSizeException e) {
            System.out.println(e.getMessage());
        }

        carnivorousEnclosure.removeAnimal("Лев");

        System.out.println(":::Все животные в вольере для хищников:::");
        Set<Carnivorous> allCarnivorous = carnivorousEnclosure.getAllAnimals();
        for (Carnivorous animal : allCarnivorous) {
            System.out.println(animal.getName());
        }

        Optional<Carnivorous> foundLion = carnivorousEnclosure.getAnimalByName("Лев");
        if (foundLion.isPresent()) {
            System.out.println("Найдено животное: " + foundLion.get().getName());
        } else {
            System.out.println("Животное с таким именем не найдено.");
        }
    }
}
