package programmers.lv2;

// 2020. 07. 01
// 큰수 만들기
public class MakeMaxValue {
    public static void main(String[] args) {
        System.out.println(solution("1231234", 3));
    }

    public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int size = number.length() - k;
        int index = 0;
        int max = 0;
        for (int i = 0; i < number.length() - k; i++) {
            for (int j = index; j + size <= number.length(); j++) {
                int num = number.charAt(j) - '0';
                if (max < num) {
                    max = num;
                    index = j + 1;
                }
            }
            answer.append(max);
            max = 0;
            size--;
        }
        return answer.toString();
    }
}
