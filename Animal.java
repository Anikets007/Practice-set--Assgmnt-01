package com.company;

public class Animal { //Parent Class
     void eat(){
         System.out.println("Animals eating......");
     }
}

class Dog extends Animal{ //Child-Class or Sub Class
    //Single Inheritance

    void bark(){
        System.out.println("Dogs bark.....");
    }

    }
class BabyDog extends Dog{ //Child-Class or Sub Class
    //Multi-level Inheritance

    void weep(){
        System.out.println("Baby Dogs Weepning....");
    }
    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.bark();
        bd.eat();
        bd.weep();

    }
}