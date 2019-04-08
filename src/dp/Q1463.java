package dp;
import java.util.Scanner;

//1�θ����
//X
public class Q1463 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] dp = new int [n+1];
		
		dp[0]= dp[1] = 0;
		
		for(int i=2; i<=n; i++) {
			dp[i] = dp[i-1]+1; 
			if(i%2 == 0) dp[i] = Math.min(dp[i/2]+1, dp[i]); 
			if(i%3 == 0) dp[i] = Math.min(dp[i/3]+1, dp[i]);
		}
		System.out.println(dp[n]);
	}
}