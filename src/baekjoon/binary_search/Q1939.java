package baekjoon.binary_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//중량제한
//X
public class Q1939 {

	static boolean check(List<Weight>[] a, int limit, int start, int end, boolean [] b) {
		if(b[start])
			return false;
		b[start] = true;
		if(start == end)
			return true;
		for(Weight v : a[start]) {
			if(v.g >= limit) {  //입력받은 중량으로 이동할 수 있는지 체크
				//return check(a, limit, v.v, end, b) 
				//이렇게 하면 check가 false 한번이라도 되면 for문이 끝나버린다. 헤맨 부분
				if(check(a, limit, v.v, end, b)){ //if문으로 해야 for문이 끝나지 않고 계속 돈다.
					return true;
				}
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		int m = scan.nextInt();
		List<Weight> [] a = (List<Weight> []) new ArrayList[n+1];

		for(int i=1; i<=n; i++)
			a[i] = new ArrayList<>();

		int max = 0;
		for(int i=0; i<m; i++) {
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			int g = scan.nextInt();
			a[v1].add(new Weight(v2, g));
			a[v2].add(new Weight(v1, g));
			max = Math.max(g, max);
		}
		int tx = scan.nextInt();
		int ty = scan.nextInt();



		int start = 1;
		int end = max;
		int ans = 0;
		while(start<=end) {
			boolean []b = new boolean[n+1];
			int mid = (start+end)/2;
			if(check(a, mid, tx, ty, b)) {
				start = mid+1;
				ans = Math.max(ans, mid);
			}
			else
				end = mid-1;
		}
		System.out.println(ans);
	}

}
class Weight{
	int v;
	int g;

	public Weight(int v, int g) {
		this.v = v;
		this.g = g;
	}
}
