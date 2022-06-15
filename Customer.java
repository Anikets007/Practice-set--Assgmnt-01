package Encapsulation;

public class Customer {

    //private data members
    private long acc_no;
    private String name,email;
    private float amount;

     //public getter and setter methods
    public long getAcc_no() {

        return acc_no;
    }

    public void setAcc_no(long acc_no) {

        this.acc_no = acc_no;
    }

    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;

    }

    public float getAmount() {

        return amount;
    }

    public void setAmount(float amount) {

        this.amount = amount;
    }

}


class TestEncapsulation {
    public static void main(String[] args) {
        //creating instance of Account class
        Customer acc=new Customer();
        //setting values through setter methods

        acc.setName("Aniket S Narsikar");
        acc.setAcc_no(7560504000L);
        acc.setEmail("aniketnarsikar@gmail.com");
        acc.setAmount(5000000f);
        //getting values through getter methods

        System.out.println("Customer Name : "+acc.getName());
        System.out.println("Account Number :"+acc.getAcc_no());
        System.out.println("Email Address: "+acc.getEmail());
        System.out.println("Balance :"+acc.getAmount());
    }
}