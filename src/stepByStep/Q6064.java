import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q6064 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<t; i++) {
			int m =scan.nextInt();
			int n =scan.nextInt();
			int x =scan.nextInt();
			int y =scan.nextInt();

			int count =0;
			int a=0;
			int b=0;
			if(x!=y) {
				a=n;
				b=n;
				count+=n;
			}
			while(true) {
				a++; b++;
				count++;
				
					
				if(a==m && b==n) {
					list.add(-1);
					break;
				}
				if(a==x && b==y) {
					list.add(count);
					break;
				}
				if(a>m)
					a=1;
				if(b>n)
					b=1;
			}
		}
		for(int z : list)
			System.out.println(z);
	}

}
