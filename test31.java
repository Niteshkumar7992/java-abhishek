package myprogram;

import java.util.Scanner;

public class test31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,n;
        double sum =0;
        System.out.println("Enter the number : ");
        a=sc.nextInt();
        for(n=1;n<=a;n++)
        {
            if(n%2==0)
            {
                sum =sum+(Math.pow(n,2));
            }
        }
        System.out.println("sum is = "+sum); 
    }
}

