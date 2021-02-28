package javaIO;

import java.io.*;

public class TestDataStream {

	public static void main(String[] args) throws IOException{
		try(// Create an output stream for file temp1.dat
				DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("temp1.dat")));
				) {
			// Write student test scores  to the file
			output.writeUTF("John");
			output.writeDouble(85.5);
			output.writeUTF("Jim");
			output.writeDouble(185.5);
			output.writeUTF("George");
			output.writeDouble(105.25);
		}
		
		try(// Create an input stream for file temp1.dat
				DataInputStream input = new DataInputStream (new BufferedInputStream(new FileInputStream("temp1.dat")));
				){
			// Read student test scores from the file 
			System.out.println(input.readUTF() + " " + input.readDouble());
			System.out.println(input.readUTF() + " " + input.readDouble());
			System.out.println(input.readUTF() + " " + input.readDouble());
		}
				

	}

}
