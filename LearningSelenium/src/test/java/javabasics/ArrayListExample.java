package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(45);
        l1.add(55);
        System.out.println(l1);
        l1.add(65);
        System.out.println(l1);
        l1.add(65);

        l1.add(2,22);
        System.out.println("Size of List is: " + l1.size());

        for(int a : l1){
            System.out.println(a);
        }
    }
}
