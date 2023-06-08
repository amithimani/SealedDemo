package dev.knowledgecafe;

public sealed class Animal permits Cat, Dog {

    public String walk(){
        return "Animal is walking";
    }
}
