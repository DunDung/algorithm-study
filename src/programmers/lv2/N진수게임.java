package programmers.lv2;

// 2020.12.02
public class N진수게임 {
    public String solution(int n, int t, int m, int p) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            String converted = convert(count, n);
            stringBuilder.append(converted);
            if (stringBuilder.length() >= t * m) {
                break;
            }
            count++;
        }
        String answer = "";
        while (answer.length() < t) {
            answer += stringBuilder.charAt(p - 1);
            p += m;
        }
        return answer;
    }

    public String convert(int number, int n) {
        if (number == 0) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (number > 0) {
            int result = number % n;
            if (result >= 10) {
                stringBuilder.append((char) ('A' + (result - 10)));
            } else {
                stringBuilder.append(result);
            }
            number /= n;
        }
        return stringBuilder.reverse().toString();
    }
}
