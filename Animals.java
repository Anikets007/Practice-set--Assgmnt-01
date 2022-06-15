package com.company;

public class Animals {
    void eat(){
        System.out.println("Animals Eating..");
    }
}

class Dogs extends Animals{
    void bark(){
        System.out.println("Dogs Barking...");
    }
}

class Cats extends Animals{
    void meow(){
        System.out.println("Cats Meowing...");
    }
    public static void main(String[] args){
        Cats c=new Cats();
        Dogs d=new Dogs();
        c.eat();
        d.bark();
        c.meow();
    }
}
