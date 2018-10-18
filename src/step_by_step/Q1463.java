package step_by_step;
import java.util.Scanner;

public class Q1463 {
	public static int oneCreate(int x) {
		
	}
	public static int oneCreate1(int x) {
		if(x!=1)
			return oneCreate(x-1)+1;	
	}
	public static int oneCreate2 (int x) {
		
		else
			return 0;
	}
	public static int oneCreate3 (int x) {
		if(x==1)
			return 0;
		if(x % 3 ==0)	
			return oneCreate3(x/3)+1;
		if(x % 2 == 0)
			return oneCreate3(x/2)+1;
		else
			return oneCreate3(x-1)+1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n >= 1 && n<= 1000000 ) {
		int result = (oneCreate(n) > oneCreate2(n)) ? oneCreate2(n) : oneCreate(n);
		result = (result> oneCreate3(n)) ? oneCreate3(n) : result;
		System.out.println(result);
		}
	}
}
