package codeforce.educational_round65_div2;

import java.util.Scanner;

//실패
public class LostNumbers {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int [] a = new int[6];
		System.out.println("? 1 2");
		System.out.flush();
		int v1 = scan.nextInt();
		System.out.println("? 2 3");
		System.out.flush();
		int v2 = scan.nextInt();
		for(int i=1; i<v2; i++)
			for(int j=i+1; j<v2; j++) {
				for(int l=j+1; l<v2; l++) {
					if(i*j ==v1 && j*l==v2) {
						a[0] =i;
						a[1] =j;
						a[2] =l;
						break;
					}
				}
			}
		System.out.println("? 4 5");
		System.out.flush();
		int k1 = scan.nextInt();
		System.out.println("? 5 6");
		System.out.flush();
		int k2 = scan.nextInt();
		
		for(int i=a[2]+1; i<k2; i++)
			for(int j=i+1; j<k2; j++) {
				for(int l=j+1; l<k2; l++) {
					if(i*j ==k1 && j*l==k2) {
						a[3] =i;
						a[4] =j;
						a[5] =l;
						break;
					}
				}
			}

		System.out.print("! ");
		for(int z : a) {
			System.out.print(z+" ");
		}
		System.out.println();
		System.out.flush();
	}
}
