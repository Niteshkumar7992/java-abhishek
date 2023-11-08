import java.util.Scanner;

public class test17MatrixDiogonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     int  A[][]= new int [2][2];
     int c,r;
     System.out.println("Enter the a matrix ");
     for (r=0;r<=1;r++)
     {
        for(c=0;c<=1;c++)
        {
          A[r][c]=sc.nextInt();
        }
     } 
       System.out.println("Display A matrix \n ");
       for(r=0;r<=1;r++)
       {
        for(c=0;c<=1;c++)
        {
            A[r][c]=sc.nextInt();
         
        }
        System.out.println("A[r][c]+");

      }
    }
       }
                     
            
      

  

