package baekjoon;

import java.util.Scanner;

public class Q12790 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i=0; i<t; i++) {
			int hp = scan.nextInt();
			int mp = scan.nextInt();
			int attack = scan.nextInt();
			int defense = scan.nextInt();
			hp += scan.nextInt();
			mp += scan.nextInt();
			attack += scan.nextInt();
			defense += scan.nextInt();
			if(hp < 1 || mp < 1 || attack < 0) {
				if(hp < 1)
					hp = 1;
				if(mp < 1)
					mp =1;
				if(attack < 0)
					attack = 0;
			}

			System.out.println(hp+5*mp+2*attack+2*defense);
		}
	}
}

