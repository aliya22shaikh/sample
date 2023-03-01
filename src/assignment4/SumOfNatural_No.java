package assignment4;

import java.util.Scanner;

public class SumOfNatural_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		int num=input.nextInt();
     int i,sum = 0;
     for(i=1;i<=num;++i)
     {
    	 sum=sum+i;
    	 
     }
     System.out.print("Sum of natural number is:"+sum);
	}

}
