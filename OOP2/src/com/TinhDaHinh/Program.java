package com.TinhDaHinh;

public class Program {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.sound();

        Animal animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();
    }
}
