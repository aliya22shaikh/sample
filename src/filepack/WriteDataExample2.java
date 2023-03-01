package filepack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataExample2 {

	public static void main(String[] args) 
			throws IOException {
		// TODO Auto-generated method stub
      FileInputStream fileinputstream=new FileInputStream("hello.txt");
      byte[] array=new byte[20];
     
	fileinputstream.read(array);
      fileinputstream.close();
      FileOutputStream fout=new FileOutputStream("HelloCopy.txt");
      for(byte b : array)
      {
    	  fout.write(b);
      }
      
      fout.close();
      
	}

}
