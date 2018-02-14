package model;

import util.AnimalVisitor;

public class Dog extends Animal {

    private boolean friendly;

    public Dog(String name, int age, boolean friendly) {
        super(name, age);
        this.friendly = friendly;
    }

    public boolean isFriendly() {
        return friendly;
    }

    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }

    @Override
    public String accept(AnimalVisitor animalVisitor) {
        return animalVisitor.visit(this);
    }
}
