/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kanev
 */
public class Pattern5 {
    public static void main(String[] args)
	{
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++) 
                { 
                        for (int j = rows; j > i; j--)
			{
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) 
                        { 
                                System.out.print(k + " "); 
                        } 
                        for (int l = i - 1; l >= 1; l--)
			{
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}
}
