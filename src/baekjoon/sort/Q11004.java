package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//K¹øÂ° ¼ö
public class Q11004 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		int k = scan.nextInt(); 
		int [] a = new int[5000001];
		
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for(int i=0; i<n; i++)
			a[Integer.parseInt(st.nextToken())]++;
		
		int cnt = 0;
		for(int i=0; i<5000001; i++) {
			if(a[i]>0) {
				cnt+=a[i];
				if(cnt>=k) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
