package basic;

import java.util.*;
import java.io.*;
import java.math.*;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
	public static final String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","","thousand","million","billion","trillion","quadrillion","quintillion"};
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int z = 0; z < n; z++) {
            String s = in.next();
		    String ns = s.replaceFirst("^-?0*", "");
		    ns = (ns.length()%3==0?"":ns.length()%3==1?"00":"0") + ns;
		    char[] nc = ns.toCharArray();
		    String res =  (s.startsWith("-") ? "negative " : "") + (nc.length/3 == 0 ? arr[0]:"" );
		    for(int i = 0; i < nc.length/3; i++) {
			    int d1 = nc[i*3]-48, d2 = nc[i*3+1]-48, d3 = nc[i*3+2]-48;
			    res += " " + (d1>0 ? arr[d1] + " hundred" : "") + " " + (d2+d3>0 ? d2*10+d3<20? arr[d2*10+d3] : arr[20+d2] + (d3>0 ? "-" + arr[d3] : "") : "") + " " + (d1+d2+d3>0 ? arr[nc.length/3-i+29] : "");
		    }
		    System.out.println(res.replaceAll("\\s{2,}", " ").trim());
        }
    }
}
	

