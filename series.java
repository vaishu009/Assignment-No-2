
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
public class series {
     public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
 
        int number;  
 
        double sum = 0;
 
        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();
 
        for(int i = 1; i <= number; i++)
    {
            sum += 1.0/i;
    }
 
        System.out.println("sum: " + sum);
    }  
}
