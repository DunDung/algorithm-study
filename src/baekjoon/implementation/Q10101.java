package baekjoon.implementation;

import java.util.*;
import java.io.*;

//삼각형 외우기
public class Q10101 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] a = new int[3];
		int sum = 0;
		for(int i=0; i<3; i++) {
			a[i] = Integer.parseInt(br.readLine());
			sum += a[i];
		}
		if(sum != 180) System.out.println("Error");
		else {
			if(a[0]==60 && a[1]==60 && a[0]==60) System.out.println("Equilateral");
			else if(a[0] != a[1] && a[1] != a[2] && a[0] != a[2]) {
				System.out.println("Scalene");
			} else {
				System.out.println("Isosceles");
			}
		}
	}
}
