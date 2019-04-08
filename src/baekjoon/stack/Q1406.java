	package baekjoon;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Stack;
	import java.util.StringTokenizer;
	
	//에디터
	//스택문제
	//X
	public class Q1406 {
	
		public static void main(String[] args) throws IOException {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s = reader.readLine();
			int n = Integer.parseInt(reader.readLine());
			Stack<String> left = new Stack<>();
			Stack<String> right = new Stack<>();
			
			for(int i=0; i<s.length(); i++) //왼쪽 스택에 입력받은 문자열을 전부 넣는다.
				left.push(s.substring(i,i+1));
			
			
			for(int i=0; i<n; i++) {
				StringTokenizer st = new StringTokenizer(reader.readLine());
				String c = st.nextToken();
				switch(c) {
					case "L":
						if(!left.isEmpty())
							right.push(left.pop());
						break;
					case "D":
						if(!right.isEmpty())
							left.push(right.pop());
						break;
					case "B":
						if(!left.isEmpty()) 
							left.pop();
						break;
					case "P":
						left.push(st.nextToken());
						break;
				}
			}
			
		/*	for(int i=0; i<left.size(); i++) //틀렸었다. left.size와 left.pop()을 같이 썼기 때문
				right.push(left.pop());
			for(int i=0; i<right.size(); i++) 
				System.out.print(right.pop());
		*/
			while(!left.isEmpty())
				right.push(left.pop());
			
			while(!right.isEmpty())
				System.out.print(right.pop());
		}
	
	}
