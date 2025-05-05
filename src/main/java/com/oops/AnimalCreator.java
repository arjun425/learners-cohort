package com.oops;

public class AnimalCreator {
    public static void main(String[] args) {
        Animal animal1 = getAnimal("Dog");
        Animal animal2 = getAnimal("Cat");
        Dog dog = new Dog();
        Cat cat = new Cat();

        assert animal1 != null;
        System.out.println(animal1.makeNoise());
        assert animal2 != null;
        System.out.println(animal2.makeNoise());

        System.out.println(dog.makeNoise());
        System.out.println(cat.makeNoise());
    }

    private static Animal getAnimal(String animal) {
        if (animal.equalsIgnoreCase("Dog")) {
            return new Dog();
        } else if (animal.equalsIgnoreCase("Cat")) {
            return new Cat();
        } else {
            return null;
        }
    }
}
