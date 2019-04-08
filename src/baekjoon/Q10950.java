package baekjoon;

import java.util.Scanner;

//A+B-3
//입출력 패턴을 알기 위한 ... 
public class Q10950 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
	
		for(int i=0; i<t; i++)
			System.out.println(scan.nextInt()+scan.nextInt());
	}
}
