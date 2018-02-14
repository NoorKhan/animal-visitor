import model.Animal;
import model.Cat;
import model.Dog;
import model.Human;
import util.AnimalNameVisitor;

import java.util.ArrayList;
import java.util.List;

public class AnimalClient {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Human("Daniel", 20, "Danny"));
        animals.add(new Cat("Cheshire", 10));
        animals.add(new Dog("Max", 10, true));

        animals.forEach(animal -> System.out.println(animal.accept(new AnimalNameVisitor())));
    }
}
