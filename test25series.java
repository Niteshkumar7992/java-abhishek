

import java.util.Scanner;

public class test25series {
    
    public static void main(String[] args) {
        
        int sum = 0;
        int n,i;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the series:");
        n = sc.nextInt();
        
        for( i = 1; i <= n; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum of series:"+sum);
        sc.close();

    }

}


