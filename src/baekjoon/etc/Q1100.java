package baekjoon.etc;

import java.util.Arrays;
import java.util.Scanner;

public class Q1100 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] chessBoard = new int [8][8];
		int count = 0;
		
		for(int i=0; i<chessBoard.length; i++)
			for(int j=0; j<chessBoard[i].length; j+=2) {
				if(i%2 != 0)
					chessBoard[i][j]++;
				else
					chessBoard[i][j+1]++;
			}
		
		for(int i=0; i<chessBoard.length; i++) {
			String s = scan.next();
			for(int j=0; j<chessBoard[i].length; j++)
				if(s.substring(j, j+1).equals("F"))
					if(chessBoard[i][j]==0)
						count++;
		}
		
		System.out.println(count);
		
	}

}
