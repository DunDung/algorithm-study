package kakao.T2020;
import java.util.*;
//100%
public class Q2 {

	public static void main(String[] args) {
		System.out.println(solution("()))((()"));
	}
	public static String solution(String p) {
		if(p.equals("")) {
			return "";
		} else if(check(p)) {
			return p;
		}
		int a = 0, b = 0;
		String u = "", v = "";
		for(int i=0; i<p.length(); i++) {
			if((a==0&&b==0) || (a!=b)) {
				if(p.charAt(i)=='(') {
					a++;
					u+="(";
				} else {
					b++;
					u+=")";
				}
			} else {
				v+=p.charAt(i);
			}
		}
		if(check(u)) {
			return u+solution(v);
		} else {
			String temp = "("+solution(v)+")";
			for(int i=1; i<u.length()-1; i++) {
				if(u.charAt(i)=='(') {
					temp+=")";
				} else {
					temp+="(";
				}
			}
			return temp;
		}
	}
	public static boolean check(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==('(')) {
				stack.add(s.charAt(i));
			} else{
				if(stack.isEmpty()) {
					return false;
				} else if(stack.peek() == '(') {
					stack.pop();
				}
			}
		}
		if(stack.isEmpty()) return true;
		else return false;
	}
}
