package javaIO;

import java.io.*;

public class TestObjectStreamForArray {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		int[] num = { 1, 2, 3, 4, 5 };
		String[] str = { "John", "Mike", "Lulu" };

		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("array.dat, true"));) {
			output.writeObject(num);
			output.writeObject(str);
		}

		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("array.dat"));) {
			int[] newNum = (int[]) (input.readObject());
			String[] newStr = (String[]) (input.readObject());
			for (String s : newStr) {
				System.out.print(s + ", ");
			}
			for (int n : newNum) {
				System.out.print(n + ", ");
			}
		}
	}
}
