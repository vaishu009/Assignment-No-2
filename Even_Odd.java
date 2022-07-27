
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kanev
 */
public class Even_Odd {
       public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
 
        int number;
        char choice;
        int even = 0;
        int odd = 0;
 
        do
        {
            System.out.print("Enter any number ");
            number = console.nextInt();
 
            if( number % 2 == 0)
            {
                even += number;
            }
            else
            {
                odd += number;
            }
 
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
 
        }while(choice=='y' || choice == 'Y');
 
        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);
    }  
}
