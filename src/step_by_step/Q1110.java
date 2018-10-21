package step_by_step;

import java.util.Scanner;

public class Q1110 {
	static String q = null;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		if(s.length() == 1)
			s= "0"+s;
		q = s;
		System.out.println(addCycle(s, q));
	}

	public static int addCycle(String s, String q) {
		int p,b;
	
		p = Integer.parseInt(s.substring(0, 1));
		b = Integer.parseInt(s.substring(1, 2));

		int sum = p+b;
		String v =new String(sum+"");
		int r = 0;
		if(v.length()==2) { 
			r = Integer.parseInt(v.substring(1, 2));
		}
		else {
			r = Integer.parseInt(v);
		}
		StringBuilder builder = new StringBuilder();
		builder.append(b);
		builder.append(r);
		if(builder.toString().equals(q))
			return 1;
		else
			return addCycle(builder.toString(), q)+1;
	}
}
