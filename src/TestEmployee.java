
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee emp1=new Employee(),emp2=new Employee();
    // Employee emp2=new Employee();
     emp1.insertData(1, "Aliya", "Developer", 20000);
     emp2.insertData(2, "Arshan", "tester", 30000);
     emp1.displayInformation();
     emp2.displayInformation();
	}

}
