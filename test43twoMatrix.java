import java.util.Scanner;

public class test43twoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int A [][]= new int[3][3];
        int r,c; 
        System.out.print("Enter matrix element :- ");
        for(r=0;r<=2;r++)
        {
            for(c=0;c<=2;c++)
            {
                A [r][c]= sc.nextInt();
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
}
