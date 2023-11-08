

import java.util.Scanner;

public class test24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  n number :- ");
        int n =sc.nextInt();
        if(n % 2==0)
        {
            System.out.println("even num ");
        }
        else
        {
            System.out.println("odd num");
        }
        sc.close();

    }
}
