package javabasics;

public class ArrayExample {
    public static void main(String[] args) {
        int a[] = {45,23,89,90};
        System.out.println(a.length);
        System.out.println(a[3]);
        //System.out.println(a[4]);

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        String det[] = {"Aravinth","Learnmore"};
        for (int j=0;j<det.length;j++){
            System.out.println(det[j]);
        }
    }
}
