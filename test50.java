class customer 
{
    public int sum(int a,int b)
    {
        return a+b;
    }
    public int sum (int p,int q,int r)
    {
     return p*q;
       
    }
}
public class test50 {
    public static void main(String[] args) {
        customer c1 = new customer();
        System.out.println(c1.sum(20,30));
        System.out.println(c1.sum(20,30,50));
    }
}
