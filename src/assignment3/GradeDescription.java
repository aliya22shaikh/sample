package assignment3;

import java.util.Scanner;

public class GradeDescription {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input=new Scanner(System.in);
      System.out.println("Enter a grade:");
      char grade=input.next().charAt(0);
      switch(grade)
      {
      case 'A','a':System.out.println("Average");
      break;
      
      case 'G','g':System.out.println("Good");
      break;
      
      case 'V','v':System.out.println("Very Good");
      break;
      
      case 'E','e':System.out.println("Excellent");
      break;
      
      case 'F','f':System.out.println("Invalid Input");
      break;
      }
      
      
      
	}

}
