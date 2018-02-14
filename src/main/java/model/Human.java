package model;

import util.AnimalVisitor;

public class Human extends Animal {

    private String nickname;

    public Human(String name, int age, String nickname) {
        super(name, age);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String accept(AnimalVisitor animalVisitor) {
        return animalVisitor.visit(this);
    }
}
