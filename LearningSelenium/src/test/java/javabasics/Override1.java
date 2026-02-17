package javabasics;

public class Override1 {

    public static void main(String[] args) {
        Override1 o = new Override1();
        o.m1(2);
    }

    public void m1(int a) {
        System.out.println(a + "Main");
    }

}
    class Override2 extends Override1 {
        public void m1(int a) {
            System.out.println(a+"Sub");

        }


    }