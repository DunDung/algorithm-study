package baekjoon.math;

import java.util.Scanner;

//ÀúÇ×
public class Q1076 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] color = {"black", "brown", "red", "orange", "yellow", "green",
				"blue", "violet", "grey", "white"};
		R []r = new R[10];
		int k = 1;
		for(int i=0; i<10; i++) {
			r[i] = new R(color[i], i, k);
			k*=10;
		}
		
		long ans = 0;
		for(int i=0; i<3; i++) {
			String s = scan.next();
			for(int j=0; j<10; j++) {
				if(r[j].name.equals(s)) {
					if(i==0) {
						ans += r[j].num*10;
					}
					else if(i==1) {
						ans += r[j].num;
					}
					else {
						ans *= r[j].mul;
					}
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
class R{
	String name;
	int num;
	int mul;

	public R(String name, int num, int mul) {
		this.name = name;
		this.num = num;
		this.mul = mul;
	}
}
