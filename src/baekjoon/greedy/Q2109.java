package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

//순회강연
public class Q2109 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Lecture [] a = new Lecture[n];
		boolean [] b = new boolean[100001];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int p = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			a[i] = new Lecture(p, d);
		}
		Arrays.sort(a);

		int ans = 0;
		for(int i=0; i<n; i++) {
			if(!b[a[i].d]) {
				ans += a[i].p;
				b[a[i].d] = true;
			}
			else
				for(int j=a[i].d-1; j>=1; j--) {
					if(!b[j]) {
						ans += a[i].p;
						b[j] = true;
						break;
					}
				}
		}
		System.out.println(ans);
	}

}
class Lecture implements Comparable<Lecture> {
	int p;
	int d;
	
	public Lecture(int p, int d) {
		this.p = p;
		this.d = d;
	}

	@Override
	public int compareTo(Lecture o) {
		int r = (this.p - o.p) *-1;
		if(r==0)
			r= this.d - o.d ;
		return r;
	}
	
}