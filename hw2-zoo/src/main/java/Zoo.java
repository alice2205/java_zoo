import animals.Animal;
import animals.carnivorous.Fish;
import animals.carnivorous.Lion;
import animals.carnivorous.Wolf;
import animals.herbivore.Duck;
import animals.herbivore.Elephant;
import animals.herbivore.Rabbit;
import animals.interfaces.Swim;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {
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
        worker.feed(fish, meat);
        worker.feed(lion, grass);
        worker.feed(wolf, meat);
        worker.feed(duck_1, grass);
        worker.feed(elephant, meat);
        worker.feed(rabbit, grass);
    }
}
