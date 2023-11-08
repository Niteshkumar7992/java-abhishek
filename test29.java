

import java.util.Scanner;

public class test29 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n, digits , sum = 0,a;
         System.out.println("Enter a number : ");
         n=sc.nextInt();
         a=n;
         while(n>0)
         {
            digits=n%10;
            sum = sum +digits+digits+digits;
            n=n/10;

         }
         if(a==sum)
         {
            System.out.println("Armstrong number ");
         }
          System.out.println("Not armstrong number");
    }
}
