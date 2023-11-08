import java.util.Scanner;
public class test42spareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][]= new int[3][3];
        int r,c,count=0;
        System.out.println("Enter a matrix:-");
        for(r=0;r<=2;r++)
        {
            for(c=0;c<=2;c++)
            {
                 A[r][c]=sc.nextInt();
            }
        }
        System.out.println("Display a Matrix : ");
        for(r=0;r<=2;r++)
        {
            for(c=0;c<=2;c++)
            {
                System.out.print(A[r][c]+" ");
            }
            System.out.println();
        }
        // logic of sprase 
        int counta=0,countb=0;
        for(r=0;r<=2;r++)
        {
            for(c=0;c<=2;c++)
            {
                if(A[r][c]==0)
                {
                    counta+=1;
                }
                else
                {
                    countb+=1;
                }
            }
        }
        if(counta>countb)
        System.out.print("Array is Sprase Matrix");
        else
        System.out.print("Not a Sprase Matrix");
      
                  
    } 
}
