package kakao.T2020;
//100%
public class Q1 {

	public static void main(String[] args) {
		String s = "aabbaccc";
		System.out.println(solution(s));
	}
	public static int solution(String s) {
		int answer = Integer.MAX_VALUE;
		for(int i=1; i<=s.length(); i++) {
			answer = Math.min(answer, slice(s, i));
		}
        return answer;
    }
	public static int slice(String s, int k) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length();) {
			if(i+k > s.length()) {
				sb.append(s.substring(i, s.length()));
				break;
			}
			String temp = s.substring(i, i+k);
			int cnt = 1;
			for(int j=i+k; j<s.length(); j+=k) {
				if(j+k <= s.length() && temp.equals(s.substring(j, j+k))) {
					cnt++;
				} else {
					break;
				}
			}
			if(cnt != 1) {
				sb.append(cnt+temp);
				i += k*cnt;
			} else {
				sb.append(temp);
				i+=k;
			}
		}
		return sb.length();
	}
}
