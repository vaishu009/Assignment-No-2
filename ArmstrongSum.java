/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kanev
 */
public class ArmstrongSum {
     public static void main(String[] args) 
     {
        int n, count = 0, a, b, c, sum = 0;
        System.out.print("Armstrong numbers from 1 to 500:");
        for(int i = 1; i <= 500; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}
