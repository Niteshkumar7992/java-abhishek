import java.util.Scanner;

public class test7AreaofTriange {
    
public static void main(String[] args) {
   System.out.println("The tringle of the are ");
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the height  h of Tringle ");
   int h = sc.nextInt();
   System.out.println("Enter the breath  b of tringle ");
   int b = sc.nextInt();
   float area_tringle = h*b/2;
   System.out.println("The tringle of the area ");
   System.out.println(area_tringle); 
}
}
