package javabasics;

import java.util.concurrent.TimeoutException;

public class TryCatchExample {
    public static void main(String[] args) {
        String a = null;
        try {
            a = "$1234";
            int b = Integer.parseInt(a);
            double c = 3.14 * b;
            System.out.println(c);
        } catch (NumberFormatException i) {
            int d = Integer.parseInt(a.substring(1));
            double e;
            System.out.println(e = 3.14 * d);

        }
        //catch (TimeoutException e) {
        //    System.out.println("--Timeout happened--");
       // }


    }
}
