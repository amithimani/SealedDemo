package dev.knowledgecafe;

public final class Cat extends Animal{

    public String walk() {
        return "Cat is walking";
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
