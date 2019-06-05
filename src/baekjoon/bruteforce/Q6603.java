package baekjoon.bruteforce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//·Î¶Ç	
public class Q6603 {
	public static boolean nextPermutation(int [] a) {
		
	}
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		while (true) {
	        int n = scan.nextInt();
	        if (n == 0) {
	            break;
	        }
	      //  vector<int> a(n);
	        int []a = new int[n];
	        for (int i=0; i<n; i++) {
	        	a[i] = scan.nextInt();
	        }
//	        vector<int> d;
	        List<Integer> d = new ArrayList<>();
	        for (int i=0; i<n-6; i++) {
	            d.add(0);
	        }
	        for (int i=0; i<6; i++) {
	        	d.add(1);
	        }
	       // vector<vector<int>> ans;
	        List<List<Integer>> ans = new ArrayList<>();
	        do {
	        	List<Integer> current = new ArrayList<>();
//	            vector<int> current;
	            for (int i=0; i<n; i++) {
	                if (d.get(i) == 1) {
	                    current.add(a[i]);
	                }
	            }
	           // ans.push_back(current);
	            ans.add(current);
	        } while (next_permutation(d.begin(), d.end()));
	        sort(ans.begin(), ans.end());
	        for (auto &v : ans) {
	            for (int i=0; i<v.size(); i++) {
	                cout << v[i] << ' ';
	            }
	            cout << '\n';
	        }
	        cout << '\n';
	}

}
