package programmers.lv2;

public class 일이삼나라의숫자 {

    public static void main(String[] args) {
        System.out.println(solution(16));
    }

    public static String solution(int n) {
        StringBuilder builder = new StringBuilder();
        while (n > 0) {
            int 나머지 = n % 3;
            if (나머지 == 0) {
                n--;
                builder.insert(0, "4");
            } else {
                builder.insert(0, 나머지);
            }
            n /= 3;
        }
        return builder.toString();
    }
}
