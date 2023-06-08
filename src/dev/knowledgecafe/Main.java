package dev.knowledgecafe;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        //Traditional Way with cast- which is mandatory if we don't have sealed class
        if(cat instanceof Animal) {
           String response =  ((Animal)cat).walk();
            System.out.println(response);
        }
        //Without Casting
        if(dog instanceof Animal){
            String response = dog.walk();
            System.out.println(response);
        }

        //Use of reflection

        System.out.println("Check if Dog class is sealed " + dog.getClass().isSealed());

        for(Class className: dog.getClass().getSuperclass().getPermittedSubclasses()) {
            System.out.println("Permitted subclass: " + className.getCanonicalName());
        }


    }
}
