package baekjoon.implementation;

import java.util.Scanner;

//5와 6의 차이
public class Q2864 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		
		StringBuilder sb1 = new StringBuilder(a);
		StringBuilder sb2 = new StringBuilder(b);
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='6'){
				sb1.replace(i, i+1, "5");
			}
		}
		for(int i=0; i<b.length(); i++) {
			if(b.charAt(i)=='6'){
				sb2.replace(i, i+1, "5");
			}
		}
		System.out.print(Integer.parseInt(sb1.toString())+Integer.parseInt(sb2.toString())+" ");
		sb1 = new StringBuilder(a);
		sb2 = new StringBuilder(b);
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='5'){
				sb1.replace(i, i+1, "6");
			}
		}
		for(int i=0; i<b.length(); i++) {
			if(b.charAt(i)=='5'){
				sb2.replace(i, i+1, "6");
			}
		}
		System.out.print(Integer.parseInt(sb1.toString())+Integer.parseInt(sb2.toString()));
	}

}
