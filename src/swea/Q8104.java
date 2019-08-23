package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//조 만들기
public class Q8104 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(reader.readLine());
		for(int t=1; t<=tc; t++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int [][] a = new int[k][n];
			int x = 0;
			int y = 0;
			int rank = 1;
			while(rank<=n*k) {
				if(y%2==0) {
					a[x++][y] = rank++;
				}else {
					a[x--][y] = rank++;
				}
				if(x>=k) {
					y++;
					x--;
				} else if(x<=-1) {
					x++;
					y++;
				}
			}
			sb.append("#"+t+" ");
			for(int i=0; i<k; i++) {
				int sum = 0;
				for(int j=0; j<n; j++) {
					sum+=a[i][j];
				}
				sb.append(sum+" ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}

}
