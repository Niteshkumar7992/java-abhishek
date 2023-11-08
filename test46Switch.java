import java.util.Scanner;

public class test46Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day of number ");
        int day =sc.nextInt();
        switch(day)
        {
 case 1 :
        System.out.println("The day of :- monday");
        break;
  case 2 :
        System.out.println("The day of :- tuesay");
        break;
   case 3 :
        System.out.println("The day of :- wedneday");
        break;
   case 4 :
        System.out.println("The day of :- thursday");
        break;
    case 5 :
         System.out.println("The day of :- friday");
         break;
     case 6 :
         System.out.println("The day of :- saturaday");
         break;
    case 7 : 
        System.out.println("The day of :- sunday");
       
           break;
           
        default:
        System.out.println("Wrong choice");
        }
    }
}
