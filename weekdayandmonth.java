import java.util.Scanner;

public class weekdayandmonth 
{
    public static void main(String[] args) 
    {
        weekdayandmonth s1 = new weekdayandmonth();
        s1.first();
    }

    void first()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the week and month.......... ");
        System.out.println("hello what you want......");
        System.out.println("press 1 for week and 2 for month.........");
        char userinput = sc.next().charAt(0);
        if (userinput == '1') {
            week();

        } else if (userinput == '2')
         {
            month();

        } else {
            nothing();
        }
        sc.close();
    }

    void nothing()
     {
        System.out.println("please select valid input");
        System.out.println("If you want to run the code press any key....");
        first();
    }

    void week()
     {
        Scanner wee = new Scanner(System.in);
        System.out.println("Enter the number of day between 1 to 7 :- ");
        int w = wee.nextInt();
        switch ('w') {
            case 1:
                System.out.println("At the first day of week is 'Sunday' .....");
                System.out.println("Sunday is beautiful day for all of us........");
                break;
            case 2:
                System.out.println("At the Second day of week is 'Monday' .....");
                System.out.println("Monday is  day for Loard Shiv jee........");
                break;
            case 3:
                System.out.println("At the third day of week is 'Tuesday' .....");
                System.out.println("Tuesday  is  day for Loard Haluman jee........");
                break;
            case 4:
                System.out.println("At the fourth day of week is 'Wednesday' ");
                System.out.println("Wednesday is day for Lord Ganesha jee");
                break;
            case 5:
                System.out.println("At the fifth day of week is 'Thrusday' ");
                System.out.println("Thrusday is day for Lord Bishnu jee");
                break;
            case 6:
                System.out.println("At the sixth day of week is 'Friday' ");
                System.out.println("Friday is day for goddess Lakshmi mata and goddess Santoshi mata");
                break;
            case 7:
                System.out.println("At the sevenths day of week is 'Satuarday' ");
                System.out.println("Satuarday is day for Lord Shani Maharaj jee");
                break;
            default:
                System.out.println("Please enter the number between 1 to 7 ....");
                System.out.println("Beacause the week is of 7 days........");
                week();

        }
        wee.close();

    }

    void month()
     {
        Scanner mon = new Scanner(System.in);
        System.out.println("Welcome to the month name:......");
        System.out.println("Enter the number of month between 1 to 12 :- ");
        int m = mon.next().charAt(0);
        switch ('m')
         {
            case 1:
                System.out.println("At the second month of year is 'January' ");
                break;
            case 2:
                System.out.println("At the second month of year is 'February' ");
                break;
            case 3:
                System.out.println("At the thiid month of year is 'March' ");
                break;
            case 4:
                System.out.println("At the fourth month of year is 'April' ");
                break;
            case 5:
                System.out.println("At the fifth month of year is 'May' ");
                break;
            case 6:
                System.out.println("At the sixth month of year is 'June' ");
                break;
            case 7:
                System.out.println("At the seventh month of year is 'July' ");
                break;
            case 8:
                System.out.println("At the eight month of year is 'August' ");
                break;
            case 9:
                System.out.println("At the nine month of year is 'September' ");
                break;
            case 10:
                System.out.println("At the ten month of year is 'October' ");
                break;
            case 11:
                System.out.println("At the eleven month of year is 'November' ");
                break;
            case 12:
                System.out.println("At the first month of year is 'December' ");
                break;
                default:
                System.out.println("Please enter the number between 1 to 12....");
                System.out.println("Beacause the year is of 12 month........");
                month();
        }
        mon.close();

    }
}