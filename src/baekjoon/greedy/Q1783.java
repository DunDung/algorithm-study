package baekjoon.greedy;

import java.util.Scanner;

//병든 나이트
//X
public class Q1783 {

	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int width = scan.nextInt();
        if (height == 1) {
            System.out.println(1);
        } else if (height == 2) {
            System.out.println(Math.min(4, (width+1)/2));
        } else if (height >= 3) {
            if (width >= 7) {
                System.out.println(width-2);
            } else {
                System.out.println(Math.min(4, width));
            }
        }
    }
}
