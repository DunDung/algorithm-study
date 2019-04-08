package baekjoon;

import java.util.Scanner;

//A+B-4
//테스트 케이스가 명시되어 있지 않다면
//Scanner 클래스의 hasNext를 사용하면 된다. true는 X
public class Q10951 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt())
			System.out.println(scan.nextInt()+scan.nextInt());
	}

}
