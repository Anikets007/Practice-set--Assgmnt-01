package Polymorphism;

public class MethodOverloading {

    void show(int a, int b){
          System.out.println("First method printed....");
    }

    void show(int a){
        System.out.println("Second method printed....");
    }

    public static void main(String[] args){

        MethodOverloading mo=new MethodOverloading();
        mo.show(10, 24);
    }
}
