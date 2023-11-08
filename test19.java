package myprogram;

import java.util.Scanner;

public class test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r,c;
        for(r=1;r<=c;r++)
        {
            for(c=3;c>=r;c-=1)
            {
                println("   ");

            }
            for(c=1;c<=r;c+=1)
            {
                println("*");
            }
             println("\n");
        }
    }
}
