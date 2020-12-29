package programmers.lv2;

// 2020. 12. 28
public class JadenCase문자열만들기 {
    public String solution(String s) {
        String[] tokens = s.split(" ");
        String answer = "";
        for (String token : tokens) {
            answer += convert(token) + " ";
        }
        return answer.trim();
    }

    private String convert(String token) {
        String result = token.substring(0, 1).toUpperCase();
        if (token.length() > 1) {
            result += token.substring(1).toLowerCase();
        }
        return result;
    }
}
