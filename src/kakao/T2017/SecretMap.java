package kakao.T2017;

import java.util.Scanner;

//비밀지도
//난이도 하
public class SecretMap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr1 = new int[n];
		int [] arr2 = new int[n];
		
		for(int i=0; i<n; i++)
			arr1[i] = scan.nextInt();
		
		for(int i=0; i<n; i++)
			arr2[i] = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			String sm = Integer.toBinaryString(arr1[i]|arr2[i]);
			sm = sm.replaceAll("1", "#");
			sm = sm.replaceAll("0", " ");
			System.out.println(sm);
		}
	}
}
