import java.util.Scanner;

public class test35allprg {
    public static void main(String[] args)
     { 
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter you choice");
        int ch  = sc.nextInt();
           int n1 , n2,z; 
           int j;
        switch(ch)
        {
 case 1:  
       
          System.out.println("Enter the first number :");
           int x =sc.nextInt();
           System.out.println("Enter the sec number : ");
            int y= sc.nextInt();
            System.out.println("sum is = "+(x+y));
            break;
case 2:
              System.out.println("Enter the first number :");
            int a =sc.nextInt();
           System.out.println("Enter the sec number : ");
            int b= sc.nextInt();
            System.out.println("sub is = "+(a-b));
            break;
   case 3:
            System.out.println("Enter the num - ");
           float s= sc.nextFloat();
          System.out.println("square is = ");
           System.out.println(s*s);
            break;
  case 4:
           System.out.println("Enter the num - ");
          float v= sc.nextFloat();
            System.out.println("cube is = ");
            System.out.println(v*v*v);
            break;
   case 5:
               System.out.println("Enter the  first number :");
            int c=sc.nextInt();
            System.out.println("Enter the sec number : ");
            int h = sc.nextInt();
            System.out.println("mul is = ");
            System.out.println(c*h);
            break;
   case 6:
            int age ;
            System.out.println("Enter you are age:-");
            age =sc.nextInt();
            if (age >60)
            {
              System.out.println("you semi-semi  divser");
            }
            else
            {
              if(age>46)
              {
                System.out.println("You are semi-divser");
              }
              else
              {
                if (age>18)
                {
                  System.out.println("you are divser");
                }
                else
                System.out.println("You are not divser");
              }
            }
          break;
    case 7:
                  	System.out.print("Enter radius : ");
                   	float radius= sc.nextFloat();
	                  System.out.print("Area of circle is = "+(3.14*radius*radius));
               	  break;
       case 8:
                  int sum = 0;
                  int n,i;
                  System.out.print("Enter the series:");
                  n = sc.nextInt();
                  
                  for( i = 1; i <= n; i++)
                  {
                      sum = sum + i;
                  }
                  System.out.println("Sum of series:- "+sum);
                  break;
                  case 9:
                  
      default:
            System.out.println("Not a valid input");  
             
        }
    }
  }
