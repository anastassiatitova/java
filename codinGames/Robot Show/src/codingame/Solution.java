package codingame;

// Game Goal:
//Bots in a duct. What is the longest possible time for the bots to run around in the duct until all bots exit?
import java.util.*;
import java.io.*;
import java.math.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();// length of the service duct
		int N = in.nextInt();// number of bots
		int[] b = new int[N];// array of the location of the bots
		for (int i = 0; i < N; i++) {// input bots
			b[i] = in.nextInt();
		}
		Arrays.sort(b);// sort bot array
		int moves = b[0] > L - b[b.length - 1] ? b[b.length - 1] : L - b[0]; // calculation of the longest time
		System.out.println(moves);// print the result

	}

}
