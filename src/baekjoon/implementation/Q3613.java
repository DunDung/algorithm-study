package baekjoon.implementation;

import java.util.Scanner;

//Java vs C++
//반례를 다생각하지 못함
//첫글자가 소문자가 아닌경우
//_가 연속으로 나올경우
//마지막이 _인경우
//알파벳, _가 아닌 다른 문자가 올경우
//_다음 대문자가 올경우
//모두 소문자는 가능
public class Q3613 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.next());
		if(!(sb.charAt(0)>='a' && sb.charAt(0)<='z')) {
			System.out.println("Error!");
		} else if(sb.indexOf("__")>=0){
			System.out.println("Error!");
		} else if(sb.charAt(sb.length()-1)=='_'){
			System.out.println("Error!");
		}else {
			boolean java = false, c = false;
			for(int i=0; i<sb.length(); i++) {
				if(sb.charAt(i)=='_') {
					c = true;
					if(sb.charAt(i+1) >='A' && sb.charAt(i+1)<='Z') {
						java= true;
						break;
					}
					sb.delete(i, i+1);
					sb.replace(i, i+1, sb.substring(i, i+1).toUpperCase());
				}else if(sb.charAt(i)>='A' && sb.charAt(i)<='Z') {
					java = true;
					if(i+1 < sb.length() && sb.charAt(i+1) =='_') {
						c= true;
						break;
					}
					sb.replace(i, i+1, sb.substring(i, i+1).toLowerCase());
					sb.insert(i, '_');
				}else if(Character.isLetter(sb.charAt(i))) {
					continue;
				} else {
					java =true;
					c= true;
					break;
				}
			}
			if((java && c)) {
				System.out.println("Error!");
			} else {
				System.out.println(sb.toString());
			}
		}
	}

}
