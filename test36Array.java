import java.util.Scanner;

public class test36Array {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0 ,i;
    // c -> int a[5];
   // c++ -> int a[5];
   // java -> datatype arrname []= new datatype [array size ];
   int a [] = new int [50];
   int s;
  System.out.println("Enter number of element :-");
   s = sc.nextInt();

    System.out.println("Enter number of element :- ");
    for(i=0;i<=s-1;i++)
    {
       a [i]=sc.nextInt();
    }
    // a[] = a[i]
    for(i=0;i<=s-1;i++)
    {
        System.out.println("a["+i+"] = " + a[i]);
        sum = sum + a[i];
    }
    System.out.println("sum of given element = " + sum);
    int n;
    System.out.println("Enter the number u wantr to find ");
    n = sc.nextInt();


    for (i= 0; i<=s-1;i++)
    {
        if (a[i]==n)
        {
            System.out.println("Element found at posintion a["+i+"]");
            break;
           
        }
    }
             if (i==s)
            {
                System.out.println("Element not found ");
            }
          
 }   
      
}
