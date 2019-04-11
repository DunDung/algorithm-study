package baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

//괄호의 값
//힘겹게 맞음..
public class Q2504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		String s = scan.next();
		for(int i=0; i<s.length(); i++) {
			if(s.substring(i,i+1).equals("(")||s.substring(i,i+1).equals("[")) //( , [ 는 push
				stack.push(s.substring(i,i+1));
			else if(s.substring(i, i+1).equals(")")||s.substring(i, i+1).equals("]")) { //),]일 때
				if(stack.isEmpty()) //비어있으면 break
					break;
				if(s.substring(i, i+1).equals(")")) { //()는 2
					if(stack.peek().equals("(")) {
						stack.pop();
						stack.push("2");
					}
					else if(stack.peek().matches("[0-9]*")) {//)일 때 스택에 숫자가 있으면
						int sum = 0;
						while(true) {
							if(stack.isEmpty()) { //empty면 잘못된 식임 sum = 0
								sum = 0;
								break;
							}
							if(stack.peek().matches("[0-9]*")) { //숫자가 나오며 계속 더함
								sum += Integer.parseInt(stack.pop());
								continue;
							}
							if(stack.peek().equals("(")) { //(를 만나면 더한값에 *2 
								stack.pop();
								sum*=2;
								break;
							}
							else { //if문을 제외한 다른 값이면 잘못된 식임 sum =0
								sum=0;
								break;
							}
						}
						if(sum==0) { //잘못된 식이면 스택을 비워서 0을 출력하게함
							stack.clear();
							break;
						}
						else { //옳은 식이면 스택에 더한값을 push
							stack.push(String.valueOf(sum));
							continue; //계속 진행
						}
					}
				}

				else if(s.substring(i, i+1).equals("]")) {
					if(stack.peek().equals("[")) {
						stack.pop();
						stack.push("3");
					}
					else if(stack.peek().matches("[0-9]*")) {
						int sum = 0;
						while(true) {
							if(stack.isEmpty()) {
								sum = 0;
								break;
							}
							if(stack.peek().matches("[0-9]*")) {
								sum += Integer.parseInt(stack.pop());
								continue;
							}
							if(stack.peek().equals("[")) {
								stack.pop();
								sum*=3;
								break;
							}

							else {
								sum=0;
								break;
							}
						}
						if(sum==0) {
							stack.clear();
							break;
						}
						else {
							stack.push(String.valueOf(sum));
							continue;
						}
					}
				}
			}
		}
		
		int result = 0;
		while(true) {
			if(stack.isEmpty()) 
				break;
			if(stack.peek().matches("[0-9]*")) { //스택에 숫자들만 남아있으면 다 더함
				result += Integer.parseInt(stack.pop());
				continue;
			}
			else {
				result = 0;
				break;
			}
		}
		System.out.println(result);
		scan.close();
	}
}
