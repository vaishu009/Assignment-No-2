/*
Write a program that prompts the user to input a positive integer. It 
should then output a message indicating whether the number is a prime 
number.
 */
import java.util.*;
public class primeno {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        n=sc.nextInt();
        
        if(n%2==0)
        {
            System.out.println("number is  not prime");
        }
        else
        {
                System.out.println("number is prime");
        }
    }
    
}
