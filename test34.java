import java.util.Scanner;

public class test34 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       

        System.out.println("Enter you age :-");
        int age = sc.nextInt();
        if (age>56)
        {
            System.out.println("you are divser");

        }
        else
        {
            System.out.println("you can not divser");
        }
        sc.close();
    }
}
