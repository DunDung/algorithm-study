package baekjoon.etc;

import java.util.Scanner;

public class Q10808 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int [] alphabet = new int[26];
		for(int i=0; i<word.length(); i++)
			alphabet[word.substring(i,i+1).compareTo("a")]++;
		
		for(int n : alphabet)
			System.out.print(n+" ");
	}
}
