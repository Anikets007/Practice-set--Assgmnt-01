package Collection;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> li = new ArrayList<>(); //Creating arraylist
        ArrayList<Integer> li1 = new ArrayList<>();

        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);
        li.add(6, 7); // Adding an element on 6th index


        li1.add(11);
        li1.add(12);
        li1.add(13);
        li1.add(14);


        li.add(0, 5);
        li.add(0, 1);
        li.addAll(0, li1);
        System.out.println(li.contains(27));
        System.out.println(li.indexOf(6));
        System.out.println(li.lastIndexOf(4));



        System.out.println(li);

        li.remove(0);
        System.out.println("ArrayList after removing the value at index 0 :" + li); // Removing an element od 0th index

        //Checking if an ArrayList contains a specific value or not

        System.out.println("Checking if an ArrayList contains a specific value or not");
        System.out.println("L1 list contains 7 : " + li.contains(8));
        System.out.println("L1 list contains 4 : " + li.contains(4));

        //Merging two ArrayLists - L1 Array list after merging

        li.addAll(li1);
        System.out.println("L1 Array list after merging: "+ li);

    }
}
