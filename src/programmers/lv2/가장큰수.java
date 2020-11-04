package programmers.lv2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

// 2020.11.02
public class 가장큰수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 0}));
    }

    public static String solution(int[] numbers) {
        Comparator<String> comparator = (o1, o2) -> {
            String s1 = o1.concat(o2);
            String s2 = o2.concat(o1);
            return s1.compareTo(s2) * -1;
        };
        String answer = Arrays.stream(numbers)
                .mapToObj(x -> String.valueOf(x))
                .sorted(comparator)
                .collect(Collectors.joining());
        if (answer.charAt(0) == '0') {
            return "0";
        }
        return answer;
    }
}
