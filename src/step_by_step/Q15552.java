package step_by_step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(r.readLine());
		
		if(n<=10000000) {
			int [] a = new int[n];
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(r.readLine());
				int z = Integer.parseInt(st.nextToken());
				int x =Integer.parseInt(st.nextToken());
				if(z<=1000 && x<=1000)
					a[i] = z+x;
			}
			
			for(int i=0; i<n; i++)
				w.write(a[i]+"\n");
			w.flush();	
		}
	}
}
