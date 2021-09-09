import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UseFileOutputStream {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout= new FileOutputStream("D:/New folder/abhi.txt");
		
		String s= "Hey Abhishek!";
		char ch[]= s.toCharArray();     // String Method toCharArray() returns an array of Chars after converting a string into sequence of Charcater.
		
		for(int i=0; i<s.length(); i++)
		{
			fout.write(ch[i]);
		}
	}

}
