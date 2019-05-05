package baekjoon.math;

import java.util.Scanner;

//분수 합
//유클리드 호제법
public class Q1735 {
	static int gcd(int a, int b) { //유클리드호제법의 최대공약수 구하기
		if(b==0)
			return a;
		return gcd(b, a%b);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		int downGcd = b*d/gcd(b, d); //분모들의 최대공약수
		a *= downGcd/b; //분자 * (최소공배수/분모)
		c *= downGcd/d;
		
		int up = a+c; //합한 분자
		int down = downGcd; //합한 분모
		
		int sumGcd = gcd(up, down); //합쳐진 분모, 분자의 최대공약수 구하기 
		up /= sumGcd; //분자 최대공약수로 나누기
		down /= sumGcd;
		System.out.println(up+" "+down);
	}

}
