package baekjoon.samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//°æ»ç·Î
public class Q14890 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int [][] a = new int[n][n];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(reader.readLine());
			for(int j=0; j<n; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());	
			}
		}
		int ans = 0;
		for(int i=0; i<n; i++) {
			List<Integer> listRow = new ArrayList<>();
			List<Integer> listCol = new ArrayList<>();
			for(int j=0; j<n; j++) {
				listRow.add(a[i][j]);
				listCol.add(a[j][i]);
			}
			ans += solve(listRow, m);
			ans += solve(listCol, m);
		}
		System.out.println(ans);
	}
	public static int solve(List<Integer> list, int m) {
			int v = list.get(0);
			boolean [] b = new boolean[list.size()];
			boolean isOk = true;
			for(int i=1; i<list.size(); i++) {
				if(list.get(i) == v) {
					continue;
				} else if(list.get(i) == v+1) {
					if(i-m<0) {
						isOk = false;
						break;
					} else {
						for(int k=1; k<=m; k++) {
							if(b[i-k] || list.get(i-k) != v) {
								isOk = false;
								break;
							}
						}
						if(isOk) {
							for(int k=1; k<=m; k++) {
								b[i-k] = true;
							}
						}
					}
				} else if(list.get(i) == v-1) {
					if(i+m > list.size()) {
						isOk = false;
						break;
					} else {
						for(int k=0; k<m; k++) {
							if(list.get(i+k) != v-1) {
								isOk = false;
								break;
							}
						}
						if(isOk) {
							for(int k=0; k<m; k++) {
								b[i+k] = true;
							}
						}
					}
				} else {
					isOk = false;
					break;
				}
				if(!isOk) {
					break;
				} else {
					v = list.get(i);
				}
			}
			if(isOk) {
				return 1;
			} else {
				return 0;
			}
		}
}
