import java.io.*;

public class FileClass {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("D:/New folder/abhi.txt");						// File is a Class present in (java.io) package
		System.out.println("Is File Exist-> " + f1.exists());			// this method will check weather abhi.txt is present or not 
		
		f1.createNewFile();												// this will create a new file of given path in File Class
		
		System.out.println("Is File Exist-> " + f1.exists());
		System.out.println("File Size-> " + f1.length());			
		System.out.println("Can File Write-> " + f1.canWrite());			
		System.out.println("File Size-> " + f1.length());			

	}

}
