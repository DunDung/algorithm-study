package baekjoon.math;

import java.io.*;
import java.util.*;

//이진수 덧셈
public class Q1252 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		int aSize = a.length()-1;
		int bSize = b.length()-1;
		StringBuilder sb = new StringBuilder();
		
		//0으로 시작할 때 고려
		int aStart = a.indexOf("1");
		int bStart = b.indexOf("1");
		if(aStart == -1 && bStart == -1) {//a와 b 둘다 1이 없을 때
			System.out.println(0);
		} else if(bStart == -1) { //b에 1이 없을 때
			System.out.println(a.substring(aStart, a.length()));
		} else if(aStart == -1) { //a에 1이 없을 때
			System.out.println(b.substring(bStart, b.length()));
		} else {
			int c = 0;
			while(aSize>=aStart || bSize>=bStart) {
				int aValue = 0;
				int bValue = 0;
				if(aSize >= aStart) {
					aValue = (a.charAt(aSize--)-'0');
				}
				if(bSize >= bStart ) {
					bValue = (b.charAt(bSize--)-'0');
				}
				int value = aValue + bValue + c;
				if(value >= 2) {
					sb.append(value-2);
					c = 1;
				} else {
					sb.append(value);
					c = 0;
				}
			}
			if(c > 0) {
				sb.append(1);
			}
			System.out.println(sb.reverse().toString());
		}
	}
}
