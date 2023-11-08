

import java.util.Scanner;

public class test28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum=0;
         
      
        System.out.print("Enter first Number :" );
        int n= sc.nextInt();
         System.out.print("Enter sec Number :" );
        int b= sc.nextInt();
        for(int i=9, a=1; i<=n-1; i--)
        {
          sum= sum + a ;
        }
        System.out.println("sum : "+(n+b));

        
    }
}
