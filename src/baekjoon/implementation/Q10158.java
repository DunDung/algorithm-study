package baekjoon.implementation;

import java.util.*;
import java.io.*;

//°³¹Ì
public class Q10158 {
	static int[] tx = {1, -1, -1, -1};
	static int[] ty = {1, 1, -1, +1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(br.readLine());
		//input
		
		int dir = 0;
		while(t-- > 0) {
			x = x+tx[dir];
			y = y+ty[dir];
			if(x)
		}
	}
}
