import java.util.Scanner;

public class Q6064 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i=0; i<t; i++) {
			int m =scan.nextInt();
			int n =scan.nextInt();
			int x =scan.nextInt();
			int y =scan.nextInt();

			int a=1;
			int b=1;
			int add=1;
			int count =1;

			while(true) {
				if(x==a)
					add = m;
				else if(y == b)
					add = n;
				
				a = ((a+add)%m == 0) ? m : (a+add)%m;
				b = ((b+add)%n == 0) ? n : (b+add)%n;
				count += add;
				
				if(a==x && b==y)
					break;
				if(count>m*n) {
					count = -1;
					break;
				}
				System.out.println(a+":"+b);
			}
			System.out.println(count);
		}
	}
}
