package baekjoon.exhaustive_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//모든 순열
public class Q10974_ver2 {

	public static void backtrack(List<List<Integer>> list, List<Integer> tmp, int [] nums) {
		if(tmp.size()==nums.length) {
			list.add(new ArrayList<>(tmp));
			return;
		}
		for(int num : nums) {
			if(!tmp.contains(num)){
				tmp.add(num);
				backtrack(list, tmp, nums);
				tmp.remove(tmp.size()-1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] nums = new int[n];
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> tmp = new ArrayList<>();
		for(int i=1; i<=n; i++) {
			nums[i-1] = i;
		}
		backtrack(list, tmp, nums);
		for(List<Integer> k : list) {
			for(int i=0; i<n; i++) {
				System.out.print(k.get(i)+" ");
			}
			System.out.println();
		}
	}
}
