package assignment4;

import java.util.Scanner;

public class TableOfEnteredNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input=new Scanner(System.in);
      System.out.println("Enter a positive integers:");
      int no=input.nextInt();
      int i;
      for(i=1;i<=10;i++)
      {
    	  System.out.println(no+"*"+i+"="+no*i);
      }
      
	}

}
