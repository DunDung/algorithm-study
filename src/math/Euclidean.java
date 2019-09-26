package math;

//유클리드 호제법
//최대공배수 구하기
public class Euclidean {
	static int gcd1(int a, int b) { //재귀 사용
		if(b==0)
			return a;
		return gcd1(b, a%b);
	}
	
	static int gcd2(int a, int b) { //반복문 사용
		while(b!=0) {
			int r = a%b;
			a=b;
			b=r;
		}
		return a;
	}
	public static void main(String[] args) {
		int a = 1000000000-1;
		int b = 1;
		b = gcd1(a, b);
		System.out.println(b);
	}

}
