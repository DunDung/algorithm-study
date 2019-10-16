package baekjoon.implementation;

import java.io.*;

//ÆÓ¸°µå·Ò
public class Q13235 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ori = br.readLine();
		if(ori.equals(new StringBuilder(ori).reverse().toString())){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}