package myprogram;

import java.util.Scanner;

public class test30 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        double a, x , n,sum =0;
        System.out.println("Enter the number : ");
        a=sc.nextInt();
        System.out.println("Enter the power : ");
        x=sc.nextInt();

        for(n=1;n<=a;n+=1)
        {
            sum = sum +(Math.pow(n,x));
        }
        System.out.println("Sum is = "+sum);
      }
}
