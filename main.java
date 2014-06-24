/**
 * @(#)main.java
 *
 *
 * @author 
 * @version 1.00 2014/6/24
 */

import java.util.Scanner;

public class main 

{

   public static void main(String[] args)
   {
   	
	   	int array[] = new int[10];
	   	System.out.println("Hello, please enter 10 numbers: ");
	   	Scanner scan = new Scanner(System.in);
	   	
	   	for (int j=0; j<10; j++)
	   	{
	   		array[j] = scan.nextInt();
	   		
	   	}
   	
   		for (int n =0; n<9; n++)
   		{	
   		
   			System.out.println("*" + array[n]);
   		}	
   			
   	
   	}
    
}