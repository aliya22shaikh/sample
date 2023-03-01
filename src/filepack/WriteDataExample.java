package filepack;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataExample {

	public static void main(String[] args) {
		// TODO Auto-generated method
		try {
			char[] byteVal= {65,66,67,68,70};
			FileWriter filewriter=new FileWriter("hello.txt",true);
			filewriter.write(byteVal);
			
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("---->"+e.getMessage());
		}
		
	}

}
