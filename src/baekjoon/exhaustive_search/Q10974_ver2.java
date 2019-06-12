package baekjoon.exhaustive_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//모든 순열
public class Q10974_ver2 {

	public static void backtrack(List<List<Integer>> list, List<Integer> tmp, int [] a) {
		if(tmp.size()==a.length) {
			list.add(new ArrayList<>(tmp));
			return;
		}
		for(int v : a) {
			if(!tmp.contains(v)){
				tmp.add(v);
				backtrack(list, tmp, a);
				tmp.remove(tmp.size()-1);
			}
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n];
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> tmp = new ArrayList<>();
		for(int i=1; i<=n; i++) {
			a[i-1] = i;
		}
		backtrack(list, tmp, a);
		for(List<Integer> k : list) {
			for(int i=0; i<n; i++) {
				System.out.print(k.get(i)+" ");
			}
			System.out.println();
		}

	}

}
