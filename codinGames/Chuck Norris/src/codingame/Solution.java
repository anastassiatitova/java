package codingame;
// Game Goal:
//Write a program that takes an incoming message as input and displays as output the message encoded using Chuck Norris’ method.
//Let’s take a simple example with a message which consists of only one character: Capital C. C in binary is represented as 1000011, so with Chuck Norris’ technique this gives:
//So C is coded as: 0 0 00 0000 0 00
import java.util.*;
import java.io.*;
import java.math.*;

public class Solution {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String MESSAGE = in.nextLine();//message input
		String binary = ""; // binary string
		String answer = "";//final coded string
		for (int i = 0; i < MESSAGE.length(); i++) {// loop through message
			String temp = Integer.toBinaryString(MESSAGE.charAt(i));// convert a character to binary number
			while (temp.length() < 7)// add 0 at the beginning if binary is shorter than 7 digits
				temp = "0" + temp;
			binary += temp; // concatenate binary message
		}
		for (int i = 0; i < binary.length(); i++) {// loop through binary message
			if (i == 0) {// check if it is a first digit
				if (binary.charAt(i) == '1') { // if the first digit is 0
					answer += "0 0";
				} else {// if the first digit is 1
					answer += "00 0";
				}
			} else {// other digits after the first
				if (binary.charAt(i) == '1' && binary.charAt(i - 1) == '0') {//check if digits switch from 1 to 0
					answer += " 0 0";
				} else if (binary.charAt(i) == '0' && binary.charAt(i - 1) == '1') {// check if digits switch from 0 to 1
					answer += " 00 0";
				} else {
					answer += "0"; // code the rest of digits
				}
			}
		}
		System.out.println(answer);// print the final code
	}
}
