package baekjoon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Q1181 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Set<String> set = new HashSet<>();
		for(int i=0; i<n; i++) {
			set.add(scan.next());
		}
		Data [] a = new Data[set.size()];
		Iterator<String> it = set.iterator();
		for(int i=0; i<a.length; i++) {
			a[i] = new Data(it.next()); 
		}	
		Arrays.sort(a);
		for(Data d: a)
			System.out.println(d.s);
	}
	
}
class Data implements Comparable<Data>{
	String s;

	public Data(String s){
		this.s = s;
	}
	
	@Override
	public int compareTo(Data o) {
		int r = this.s.length()-o.s.length();
		if(r==0)
			r = this.s.compareTo(o.s);
		return r;		
	}
}
