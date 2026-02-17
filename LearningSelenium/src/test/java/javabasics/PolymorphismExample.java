package javabasics;

public class PolymorphismExample {

    public static void main(String[] args) {

        PolymorphismExample p=new PolymorphismExample();
        p.m1("Subash");

    }
    public void m1(int a)
    {
        System.out.println(a);
    }
    public void m1(String a)
    {
        System.out.println(a);
    }
    public void m1(int a, int b)
    {
        System.out.println(a+b);
    }
    public void m1(String a, String b)
    {
        System.out.println(a+" " +b);
    }
}
