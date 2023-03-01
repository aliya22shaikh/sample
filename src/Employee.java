
public class Employee {
  int empid;
  String empname;
  String designation;
  float salary;

   void insertData(int i,String en,String ds,float s)
   {
	   empid=i;
	   empname=en;
	   designation=ds;
	   salary=s;
   }
   void displayInformation()
   {
	   System.out.println(empid+" "+empname+" "+designation+" "+salary);
   }
   }