package baekjoon.dp;

import java.util.Scanner;

//암호코드
//X
public class Q2011 {
	public static int mod = 1000000;
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = s.length();
        s = " " + s; //1번째 부터 시작하기 위함
        int[] d = new int[n+1];
        d[0] = 1;
        for (int i=1; i<=n; i++) {
            int x = Integer.parseInt(s.substring(i,i+1));
            if (1 <= x && x <= 9) {
                d[i] += d[i-1];
                d[i] %= mod;
            }
            if (i==1) {
                continue;
            }
            if (s.substring(i-1, i).equals("0")) {
                continue;
            }
            x = (Integer.parseInt(s.substring(i-1, i))*10) + (Integer.parseInt(s.substring(i, i+1)));
            if (10 <= x && x <= 26) {
                d[i] += d[i-2];
                d[i] %= mod;
            }
        }
        System.out.println(d[n]);
    }
}
