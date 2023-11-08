import java.util.Scanner;

public class test48 {
      static int a,b,r,h, sum = 0,i,n,age,c;//static variable
    static void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first num : ");
        a=sc.nextInt();
        System.out.println("Enter sec num : ");
        b=sc.nextInt();
    }
    static void circle_input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius : ");
        r=s.nextInt();
        System.out.println("Enter height(if applicable) : ");  
        h=s.nextInt();
    }
    static void show()//definition
    {
        System.out.println("Hello");
    }
    static void disp()
    {
        System.out.println("World");
    }
    static void sum()
    {
        input();
        System.out.print("Sum is = "+(a+b));
    }
    static void sub()
    {
        input();
        System.out.println("Sub is = "+(a-b));
    }
    static void circle()
    {
        circle_input();
        System.out.println("Area of circle is = "+(3.14*r*r));
    }
    static void multipaly()
    {
        input();
        System.out.println("mul is = "+a*b);
    }
    static void cube ()
    {
        circle_input();
        System.out.println("cube is ="+ r*r);
    } 
    static void series()
    {
         Scanner c = new Scanner(System.in);
         int x=c.nextInt();
      
      
        System.out.println("Enter the last numbr of  series:");
       n = c.nextInt();
            
            for( i = 1; i <= n; i++)
            {
                sum = sum + i;
            }
            System.out.println("Sum of series:"+sum);
        }
     static void Switch()
               {
           Scanner v = new Scanner(System.in);
           System.out.println("Enter day of number ");
            int day =v.nextInt();
        switch(day)
            {
    case 1 :
                    System.out.println("monday");
            break;
    case 2 :
                  System.out.println("tuesay");
            break;
    case 3 :
                   System.out.println("wedneday");
            break;
     case 4 :
                    System.out.println("thursday");
            break;
    case 5 :
              System.out.println("friday");
           break;
    case 6 :
             System.out.println("saturaday");
         break;
    case 7 : 
            System.out.println("sunday");
        break;
            default:
            System.out.println("Wrong choice");
            }
           
        }
          static void age ()
             {
                Scanner x = new Scanner (System.in);
                System.out.println("Enter you are age ");
                int age = x.nextInt();
                if(age>18)
                {
                     System.out.println("you can divser ");
                     
                }
                else
                {
                     System.out.println("you can not divser ");
                }
                System.out.println("Enter you age:- ");

             }
        static void matrix ()
        {
            Scanner m =new Scanner (System.in);
            int A [][]= new int[3][3];
              
            System.out.print("Enter matrix element :- ");
            for(r=0;r<=2;r++)
            {
                for(c=0;c<=2;c++)
                {
                    A [r][c]= m.nextInt();
                }
            }
            System.out.print("Matrix elements :-");
            for(r=0;r<=2;r++)
            {
                for(c=0;c<=2;c++)
                {
                   System.out.print(A[r][c]+" ");
              }
              System.out.println();
            }                                
        }
        static void even()
        {
            Scanner z= new Scanner (System.in);
            System.out.println("Enter the number :- ");
            int n= z.nextInt();
            if(n % 2==0)
            {
                System.out.println("Even number :- ");
            }
            else 
            {
                System.out.println("Odd number :- ");

            }
        }
       
        
           
        public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Press 1 :  show()");
        System.out.println("Press 2 :  disp()");
        System.out.println("Press 3 :  sum()");
        System.out.println("Press 4 :  sub()");
        System.out.println("Press 5: circle()");
        System.out.println("press 6: multiply");
        System.out.println("press 7:  cube");
        System.out.println("press 8: series");
        System.out.println("press 9: Switch ");
        System.out.println("Press 10: age ");
        System.out.println("Press 11: Matrix element");
        System.out.println("press 12: even");
       System.out.println("Enter your choice : ");
       int ch=ob.nextInt();
       switch(ch)
       {
        case 1:
                show();
            break;
        case 2:
                disp();
            break;
        case 3:
                sum();
            break;
        case 4:
                sub();
            break;
        case 5:
                circle();
                break;
         case 6:
                 multipaly();
                 break;
         case 7:
                 cube ();
                 break;
        case 8:
              series();
              break;
       case 9:
            Switch();
            break;
      case 10:
            age ();
            break;
     case 11:
            matrix  ();
          break;
    case 12:
        even();
        break;
        default:
            System.out.println("Wrong choice ");
       }
   }
}
