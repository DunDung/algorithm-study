package codeforce.round560_div3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AlmostAllDivisors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();

		while(tc-->0) {
			int n = scan.nextInt();
			List<Integer> list =new ArrayList<>();

			for(int i=0; i<n; i++) {
				list.add(scan.nextInt());
			}

			Collections.sort(list);
			int start = 0;
			int end = n-1;
			boolean isOk = true;
			while(start<=end) {
				int result = list.get(start++)*list.get(end--);
				isOk = true;
				for(int i=start; i<=end; i++) {
					if(!list.contains((result/list.get(i)))) {
						isOk = false;
						break;
					}
				}
				if(isOk) {
					System.out.println(result);
					break;
				}
			}
			if(!isOk)
				System.out.println(-1);
		}
	}
}
