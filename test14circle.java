

import java.util.Scanner;

public class test14circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius :- ");
        float r = sc.nextFloat();
        System.out.println("Area of circle is = "); 
        System.out.println(3.14*r*r);
        sc.close();
    }
}
