package codinggame;
// Game goal:

// Given N integers, print their English cardinal forms. For example, 525600 is spelled "five hundred twenty-five thousand six hundred".

import java.util.*;
import java.io.*;
import java.math.*;
import java.util.Arrays;

public class Solution {
	public static void main(String args[]) {
		String[] digit = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] tenth = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		String[] numer = { "", " thousand ", " million ", " billion ", " trillion ", " quadrillion ", " quintillion " };

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // number of integers to translate
		String[] num = new String[n]; // array of integers to translate
		String[] x = new String[n]; // array of strings
		for (int i = 0; i < x.length; i++) { // initialize array of strings
			x[i] = "";
		}

		for (int i = 0; i < n; i++) { // loop through array of numbers
			int count = 0; // counter of the first 3 digits of the number, ex: 1 to 3
			int threeCount = 0; // counter of every three digits, ex: 1000, 1000 000
			String digits = ""; // string to save the string before first digit translation
			boolean isNegative = false; // check if number is negative
			num[i] = in.next(); // number input
			if (num[i].charAt(0) == '-') { // to check if number is negative and remove '-' sign
				isNegative = true;
				num[i] = num[i].substring(1);
			}
			for (int j = num[i].length() - 1; j > -1; j--) {// loop through a number
				int temp = num[i].charAt(j) - 48; // the first digit
				if (count == 0) // save the string before first digit translation
					digits = x[i];
				count++; // increase the counter of the first 3 digits
				if (temp != 0) { // check if the digit is not zero
					switch (count) { // switch case based on the count of the digits
					case 1: { // translate the first digit
						x[i] = digit[temp] + x[i];
						break;
					}
					case 2: { // translate the second digit
						if (temp == 1) { // if the number is *teen
							if (j == num[i].length() - 2) { // check if this is the second digit of the number
								x[i] = digit[10 + (num[i].charAt(j + 1) - 48)]; // translate the first teen number
								break;
							} else {
								x[i] = digit[10 + (num[i].charAt(j + 1) - 48)] + digits; // translate the teen number
																							// inside the number
								break;
							}
						} else { // if the number is not teen
							if (num[i].charAt(j + 1) == '0') {// check if the previous digit is zero, ex: 20, 30
								x[i] = tenth[temp] + x[i]; // translate the number
								break;
							} else {
								x[i] = tenth[temp] + "-" + x[i]; // translate the rest of the cases
								break;
							}
						}
					}
					case 3: // translate hundreds
						x[i] = digit[temp] + " hundred " + x[i];
					}
				}

				if (count == 3) { // check if 3 digits are translated
					threeCount += count; // increase the counter of every 3 digits
					count = 0; // set the 3 digits counter to zero
					if (threeCount % 3 == 0 && j != 0) { // check every 3 digits and there are more digits left to
															// translate
						x[i] = numer[threeCount / 3] + x[i]; // add thousand and etc to the string
					}
				}
			}
			if (isNegative) // add word negative to negative number
				x[i] = "negative " + x[i];
		}
		for (int i = 0; i < x.length; i++) { // loop through cardinal string
			if (x[i].length() > 1) { // check if string has more than one character
				String result = ""; // string to store the result
				String[] strList = x[i].split(" "); // split cardinal string to array

				for (int j = 0; j < strList.length; j++) { // loop through array
					if (strList[j].isBlank() && !strList[j - 1].contains("hundred")) { // check if item is empty and the
																						// previous item is not
																						// 'hundred'
						j = strList.length + 1; // skip 2 items
					} else if (strList[j].isBlank() && strList[j - 1].contains("hundred")) { // check if if item is
																								// empty and the
																								// previous item is
																								// 'hundred'
						continue; // skip 1 item
					} else {
						result = result + " " + strList[j]; // concatenate the result string
					}
				}
				result = result.trim(); // trim empty spaces at the string ends
				if (result.charAt(result.length() - 1) == '-') { // remove '-' at the end of the string
					result = result.substring(0, result.length() - 1);
				}
				System.out.println(result); // print the result of translation
			} else {
				System.out.println("zero"); // print zero if for empty string or number zero
			}
		}

	}
}
