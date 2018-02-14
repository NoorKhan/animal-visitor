package util;

import model.Cat;
import model.Dog;
import model.Human;

public class AnimalNameVisitor implements AnimalVisitor {

    @Override
    public String visit(Human human) {
        return human.getNickname();
    }

    @Override
    public String visit(Cat cat) {
        return cat.getName();
    }

    @Override
    public String visit(Dog dog) {
        return dog.getName();
    }
}
