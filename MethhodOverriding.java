package Polymorphism;

public class MethhodOverriding {
    void show(String a, int b){

        System.out.println("Starting class method printed....");
    }
}

class Test extends MethhodOverriding{

    void show(String a, int b){
        System.out.println("Test Class method printed.....");
    }

    public static void main(String[] args) {
        MethhodOverriding mo=new MethhodOverriding();
        mo.show("Ann",29);
        Test t=new Test();
        t.show("Abb", 23);

    }
}
