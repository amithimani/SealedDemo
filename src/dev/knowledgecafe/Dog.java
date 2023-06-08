package dev.knowledgecafe;

public final class Dog extends Animal {

    public String walk(){
        return "Dog is walking";
    }
    @Override
    public String toString() {
        return "Dog";
    }
}
