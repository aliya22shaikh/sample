package assignment3;

import java.util.Scanner;

public class DayNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number:");
    int no=input.nextInt();
    switch(no)
    {
    case 1:System.out.println("SUNDAY");
    break;
    
    case 2:System.out.println("MONDAY");
    break;
    
    case 3:System.out.println("TUESDAY");
    break;
    
    case 4:System.out.println("WEDNESDAY");
    break;
    
    case 5:System.out.println("THURSDAY");
    break;
    
    case 6:System.out.println("FRIDAY");
    break;
    
    case 7:System.out.println("SATURDAY");
    break;
    
    case 8:System.out.println("SUNDAY");
    break;
    
    default:
    	 System.out.println("Invalid input,Please check it");
    }
	}

}
