package util;

import model.Cat;
import model.Dog;
import model.Human;

public interface AnimalVisitor {

    String visit(Human human);

    String visit(Cat cat);

    String visit(Dog dog);
}
