package myprogram;

import java.util.Scanner;

public class testscaneer {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first num a :- ");
        int a = sc.nextInt();
        System.out.println("Enter the sec num b :- ");
        int b = sc.nextInt();
        System.out.println("sum is = ");
        System.out.println(a+b);
    }
}
