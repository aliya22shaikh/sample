package assignment4;

import java.util.Scanner;

public class FactorialOfEnteredNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the number to find factorial:");
       int no=input.nextInt();
       int i,fact=1;
       for(i=1;i<=no;i++)
       {
    	   fact=fact*i;
       }
       System.out.println("Factorial of entered number is:"+fact);
	}

}
