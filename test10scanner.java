

import java.util.Scanner;

public class test10scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number a :- ");
        int a = sc.nextInt();
        System.out.println("Enter the sec number b :- ");
        int b =  sc.nextInt();
        System.out.println("sub is = ");
        System.out.println(a-b);  
        sc.close();
    }
}
