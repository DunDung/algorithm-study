package baekjoon.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q1755 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] arr = {"zero ", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine"};
		int n = scan.nextInt();
		int m = scan.nextInt();
		List<Num> list = new ArrayList<>();
		
		for(int i=n; i<=m; i++) {
			if(i<=9)
				list.add(new Num(i, arr[i]));
			else
				list.add(new Num(i, arr[i/10]+arr[i%10]));
		}
		
		Collections.sort(list);
		for(int i=0; i<list.size(); i++) {
			if(i>=10 && i%10 == 0)
				System.out.println();
			System.out.print(list.get(i).num+" ");
		}
	}
}
class Num implements Comparable<Num>{
	int num;
	String eng;
	
	public Num(int num, String eng) {
		this.num = num;
		this.eng = eng;
	}
	
	@Override
	public int compareTo(Num o) {
		return eng.compareTo(o.eng);
	}
}
