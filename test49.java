abstract class A {
    abstract void disp();// abstract mathod 
    void show()// non abstract mathod 
    {
        System.out.println("Hello BCA");

    }  
} class B extends A
  
{

    public void disp()
    {
        System.out.println(" Hello Nitesh");

    }
}
public class test49 
{
    public static void main(String[] args) 
    {
        B b1= new B ();
        b1.disp();
        b1.show();
    }
}
