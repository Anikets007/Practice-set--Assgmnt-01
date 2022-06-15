package Abstraction;

interface Bank1{
    float rateOfInterest();
}

class SBI_Bank implements Bank1{

    public float rateOfInterest(){
        return 9.15f;
    }
}
class PNB_Bank implements Bank1{

    public float rateOfInterest(){
        return 9.7f;
    }
}
class TestInterface2{

    public static void main(String[] args){

        Bank1 b=new SBI_Bank();

        System.out.println("ROI for SBI : "+b.rateOfInterest());

        Bank1 pb=new PNB_Bank();

        System.out.println("ROI for PNB : "+pb.rateOfInterest());
    }
}
