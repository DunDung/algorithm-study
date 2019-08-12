package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//책 나눠주기
//X
public class Q9576 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		while(tc-- > 0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			boolean [] check = new boolean[n+1]; // 책이 있는지 체크할 배열
			Book [] books = new Book[m];
			for(int i=0; i<m; i++) {
				st = new StringTokenizer(bf.readLine());
				books[i] = new Book();
				books[i].a = Integer.parseInt(st.nextToken());
				books[i].b = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(books);
			int ans = 0;
			for(int i=0; i<books.length; i++) {
				for(int j=books[i].a; j<=books[i].b; j++) {
					if(!check[j]) {
						check[j] = true;
						ans++;
						break;
					}
				}
			}
			sb.append(ans+"\n");
		}
		System.out.print(sb.toString());
	}

} class Book implements Comparable<Book> {
	int a;
	int b;
	
	@Override
	public int compareTo(Book o) {
		int r = this.b - o.b;
		if(r==0) r = this.a - o.a;
		return r;
	}
}
