import java.util.Scanner;
public class akash1 {
    public static void main(String[] args) {
        System.out.println("***********************************************");
        System.out.println("*****Welcome to cbse Result****");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of five subject:- ");
        System.out.print("Enter the the marks in math:-");
        int math= sc.nextInt();
        System.out.print("Enter the the marks in english:-");
        int english= sc.nextInt();
        System.out.print("Enter the the marks in science:-");
        int science= sc.nextInt();
        System.out.print("Enter the the marks in hindi:-");
        int hindi= sc.nextInt();
        System.out.print("Enter the the marks in social science:-");
        int sst= sc.nextInt();
        int s= math+english+hindi+science+sst;
        int per =s/5;
        System.out.println("total percent is :-");
        System.out.print(per);



    }
}
