package programmers.lv2;

//2020. 07. 02
public class 조이스틱 {
    public static void main(String[] args) {
        System.out.println(solution("CANAAAAANAN"));
    }
    public static int solution(String name) {
        int answer = 0;
        int actualIndex = 0;
        for (int i = 0; i < name.length(); i++) {
            char nowAlphabet = name.charAt(i);
            if (nowAlphabet == 'A') {
                continue;
            }
            answer += move(actualIndex, i, name.length()) ;
            actualIndex = i;
        }
        return answer;
    }

    public static int move(int actualIndex, int expectedIndex, int size) {
        int right = Integer.MAX_VALUE;
        if (expectedIndex >= actualIndex) {
            right = expectedIndex - actualIndex;
        }
        int left = 0;
        if (expectedIndex <= actualIndex) {
            left = actualIndex - expectedIndex;
        } else {
            left = (actualIndex - 0) + (size - expectedIndex);
        }
        return Math.min(left, right);
    }

}
