import java.util.Scanner;

public class test40matrix {
    public static void main(String[] args) {
  


        Scanner sc = new Scanner(System.in);

     int  A[][]= new int [2][2];
     int c,r;
     System.out.print("Enter the a matrix ");
     for (r=0;r<=1;r++)
     {
        for(c=0;c<=1;c++)
        {
            A[c][r]=sc.nextInt();
        }
     } 
     System.out.print("Matrix of  element\n");
     for(r=0;r<=1;r++)
     {
      for(c=0;c<=1;c++)
      {
        System.out.print(A[r][c]+" ");
      }
      System.out.println();
     }
     System.out.print("Transpose of Matrix of \n");
     for(r=0;r<=1;r++)
     {
      for(c=0;c<=1;c++)
      {
        System.out.print(A[c][r]+" ");
      }
      System.out.println();
     }
  }
}
   
    

