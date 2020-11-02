package programmers.lv2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

// 2020.11.02
public class 가장큰수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{40, 403}));
    }

    public static String solution(int[] numbers) {
        Comparator<String> comparator = (o1, o2) -> {
            int index1 = 0;
            int index2 = 0;
            char now1 = '0';
            char now2 = '0';
            while ((index1 < o1.length()) && (index2 < o2.length())) {
                now1 = o1.charAt(index1);
                now2 = o2.charAt(index2);
                if (now1 == now2) {
                    index1++;
                    index2++;
                    continue;
                }
                return (now1 - now2) * -1;
            }
            if (o1.charAt(o1.length() - 1) > o2.charAt(0)) {
                return -1;
            }
            return o1.length() - o2.length();
        };
        String answer = Arrays.stream(numbers)
                .mapToObj(x -> String.valueOf(x))
                .sorted(comparator)
                .collect(Collectors.joining());
        return answer;
    }
}
