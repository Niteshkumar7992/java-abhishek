
public class test52 {
    static int sum (int a)
    {
        return a;
    }
    static int sum (int b, int c)
    {
        return b*c;
    }
   static int sum (double p ) 
   {
    return p+p;
    
   }
   static  int sum (double x, double y) 
   {
         return x-y;
   }
    public static void main(String[] args) {
        System.out.println("sum is = "+sum(20));
        System.out.println("mul is = "+sum(20,31));
        System.out.println("sum is = "+sum(2,3) );
    }
    
}
