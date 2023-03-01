package assignment3;

import java.util.Scanner;

public class StudentCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     System.out.print("Roll no of student:");
     int rollNo=input.nextInt();
     System.out.println("Name of student:");
     String name=input.next();
     System.out.println("Marks of Physics,Chemistry and Computer Application:");
     int physicsMarks=input.nextInt();
     int chemistryMarks=input.nextInt();
     int computerAppMarks=input.nextInt();
     double total=physicsMarks+chemistryMarks+computerAppMarks;
     double percentage=((total/300) * 100);
     System.out.println("ROLL NO:"+rollNo);
     System.out.println("Name of student:"+name);
     System.out.println("Marks in Physics:"+physicsMarks);
     System.out.println("Marks in Chemistry:"+chemistryMarks);
     System.out.println("Marks in Computer Application:"+computerAppMarks);
     System.out.println("Total Marks:"+total);
     System.out.println("Percentage:"+percentage);
     if(percentage>90)
     {
    	 System.out.println("Grade:DISTINCTION");
    	 
     }else if(percentage>60)
    	 System.out.println("Grade:FIRST CLASS");
     else if(percentage>50)
    	 System.out.println("Grade:SECOND CLASS");
     else
    	 System.out.println("FAILS");
     
     
     
     
	}

}
