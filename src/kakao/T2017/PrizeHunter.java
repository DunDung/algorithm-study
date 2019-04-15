package kakao.T2017;

import java.util.Scanner;

public class PrizeHunter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arr1 = {500, 300, 300, 200, 200, 200, 50, 50, 50, 50, 30, 30, 30, 30, 30, 10, 10, 10, 10, 10, 10};
		int [] arr2 = {512, 256, 256, 128, 128, 128, 128, 64, 64, 64, 64, 64, 64, 64, 64,
					   32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
		int tc = scan.nextInt();
		for(int t=0; t<tc; t++) {
			int sum = 0;
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(a>21||a==0) 
				sum+=0;
			else 
				sum+=arr1[a-1];
			
			if(b>31||b==0) 
				sum+=0;
			else 
				sum+=arr2[b-1];
			System.out.println(Integer.parseInt(String.valueOf(sum)+"0000"));
		}
	}

}
