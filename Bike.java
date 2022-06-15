package Abstraction;

abstract class Bike{
    Bike(){

        System.out.println("bike is Started....");
    }
    abstract void run();
    void changeGear(){

        System.out.println("gear is changed......");
    }
}
//Creating a Child class which inherits Abstract class
class Honda extends Bike{
    void run(){System.out.println("running safely......");
    }
}
//Creating a Test class which calls abstract and non-abstract methods
class TestAbstraction2{
    public static void main(String args[]){

        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
