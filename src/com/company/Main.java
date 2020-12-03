package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Alf";
        dog.sound = "woff";
        dog.age = 3;
        dog.onDisplay();

        Animal cat = new Animal();
        cat.name = "Murka";
        cat.sound = "meow";
        cat.weight = 4;
        cat.onDisplay();
    }

    static class Animal
    {
        String name;
        String sound;
        int weight;
        int age;

        void onDisplay(){
        System.out.printf("Name: %s \tSound: %s \tWeight: %d \tAge: %d\n", name, sound, weight, age);
        }
    }
}
