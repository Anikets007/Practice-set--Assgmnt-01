package Abstraction;

abstract class Bank{
    abstract int getRateOfInterest(); // Abstract Method
}

class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class PNB extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}

class TestBank{
    public static void main(String args[]){

        Bank b=new SBI();//method of SBI will be invoked
        int interest=b.getRateOfInterest();
        System.out.println("Rate of Interest for SBI is: "+interest+" %");

        Bank pb=new PNB();// method of PNB will be invoked
        int intrest=pb.getRateOfInterest();
        System.out.println("Rate of Interest for PNB is: "+intrest+" %");
    }
}
