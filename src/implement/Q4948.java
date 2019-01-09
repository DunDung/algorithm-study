package implement;

import java.util.Scanner;

public class Q4948 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int n = scan.nextInt();
			if(n==0)
				break;
			int count=0;
			boolean b = false;
			for(int i=n+1; i<=n*2; i++) {
				b = false;
				for(int j=2; j<i; j++ ) {
					if(i%j==0) {
						b=true;
						break;
					}
				}
				if(!b)
					count++;
			}
		
			
			System.out.println(count);
		}
	}

}
