

import java.util.Scanner;

public class test27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
int number = 987654, reverse = 0;  
while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
sc.close();
    }
}
