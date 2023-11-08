package myprogram;

import java.util.Scanner;

public class test32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,n;
        double sum =0;
        System.out.println("Enter the last number :" );
        a=sc.nextInt();
        for(n=1;n<=a;n++)
        {
            if(n%2!=0)
            {
                sum = sum +(Math.pow(n,2));

            }
        }
        System.out.println("Sum is = "+sum);
    }
}
