package baekjoon.implementation;

import java.util.*;

//중복 빼고 정렬하기
public class Q10867 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Set<Integer> set = new TreeSet<>();
		for(int i=0; i<n; i++) set.add(scan.nextInt());
		for(int v : set) System.out.print(v+" ");
	}
}