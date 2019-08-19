package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//간단한 369 게임
public class Q1926 {

	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=n; i++) {
			int k = i;
			int cnt=0;
			while(k>0) {
				if(k%10 > 0 && (k%10)%3==0) {
					cnt++;
				}
				k/=10;
			}
			if(cnt==0) {
				sb.append(i);
			} else {
				for(int j=0; j<cnt; j++) {
					sb.append("-");
				}
			}
			sb.append(" ");
		}
		System.out.print(sb.toString());
	}

}
