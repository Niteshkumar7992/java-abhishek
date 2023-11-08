import java.util.Scanner;

public class test38matrix 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
         int arr[]= {23,12,45,84,46,1,2,3,4,5,56,47};
         int count =0 ;
         System.out.println("Array element using of each ");
        
         for(int p: arr)
       {
        
        System.out.println(p);
        count +=1;
       }
       System.out.println("Total value of array element:- "+count);
       
    }
    
    
}
