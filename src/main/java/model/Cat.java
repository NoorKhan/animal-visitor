package model;

import util.AnimalVisitor;

public class Cat extends Animal {

    private int lives;

    public Cat(String name, int age) {
        super(name, age);

        this.lives = 9;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    @Override
    public String accept(AnimalVisitor animalVisitor) {
        return animalVisitor.visit(this);
    }
}
