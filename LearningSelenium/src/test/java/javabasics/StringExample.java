package javabasics;

public class StringExample {

    public static void main(String[] args) {
        String a = "Subash";
        System.out.println(a.charAt(1));
        System.out.println(a.length());
        String b = "Pandi";
        System.out.println(a.replace('b','p'));
        System.out.println(a.concat(" "+b));
        System.out.println(a.substring(1,3));
    }
}
