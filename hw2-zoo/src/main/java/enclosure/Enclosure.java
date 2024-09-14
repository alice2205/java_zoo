package enclosure;

import animals.Animal;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Enclosure<T extends Animal> {
    private Set<T> animals = new HashSet<>();
    private EnclosureSize size;
    private String name;

    public Enclosure(EnclosureSize size, String name) {
        this.size = size;
        this.name = name;
    }

    public void addAnimal(T animal) throws WrongEnclosureSizeException {
        if (animal.getEnclosureSize().compareTo(this.size) <= 0) {
            animals.add(animal);
            System.out.println(animal.getName() + " находится в " + name);
        } else {
            throw new WrongEnclosureSizeException(animal.getName() + " не помещается в " + name);
        }
    }

    public void removeAnimal(String name) {
        animals = animals.stream()
                .filter(animal -> !animal.getName().equals(name))
                .collect(Collectors.toSet());
    }

    public Optional<T> getAnimalByName(String name) {
        return animals.stream()
                .filter(animal -> animal.getName().equals(name))
                .findFirst();
    }

    public Set<T> getAllAnimals() {
        return animals;
    }
}

