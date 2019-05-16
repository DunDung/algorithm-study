package baekjoon.divide_and_conquer;

import java.util.Scanner;

//하노이 탑 이동 순서
public class Q11729 {
	static int cnt = 0;
	public static void solve(int n, int x, int y, StringBuilder sb) {
        if (n == 0) return;
        cnt++;
        solve(n-1, x, 6-x-y, sb);
        sb.append(x + " " + y + "\n");
        solve(n-1, 6-x-y,y, sb);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        solve(n, 1, 3, sb);
        System.out.println(cnt);
        System.out.println((int)Math.pow(2, n)-1);
        System.out.println(sb);
    }
}

