package baekjoon.etc;

import java.util.Scanner;

public class Q16165 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int teamNum = scan.nextInt();
		int qnum = scan.nextInt();

		Girl [] g = new Girl[teamNum];
		int memberNum;

		for(int i=0; i<teamNum; i++) {
			String s  = scan.nextLine();
			memberNum = scan.nextInt();
			g[i].member = new String[memberNum];
			for(int j=0;j<memberNum; j++)
				g[i].member[j] = scan.nextLine();
		}

	}
	class Girl {
		String teamName;
		String [] member;
	}
}
