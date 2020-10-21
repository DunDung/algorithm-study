package programmers.lv2;

import java.util.Arrays;

// 2020.10.21
public class 소수찾기 {
    private static boolean[] primes = 에라토스테네스의체();
    private static int count = 0;

    public static int solution(String numbers) {
        calculate(numbers, "", new boolean[numbers.length()]);
        return count;
    }

    public static void calculate(String numbers, String now, boolean[] check) {
        if (!now.isEmpty() && now.charAt(0) != '0' && primes[Integer.parseInt(now)]) {
            primes[Integer.parseInt(now)] = false;
            count++;
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!check[i]) {
                check[i] = true;
                String indexString = String.valueOf(numbers.charAt(i));
                calculate(numbers, now + indexString, check);
                check[i] = false;
            }
        }
    }

    public static boolean[] 에라토스테네스의체() {
        int length = 10000000;
        boolean[] check = new boolean[length];
        Arrays.fill(check, true);
        check[0] = false;
        check[1] = false;
        for (int i = 2; i * i < length; i++) {
            if (check[i]) {
                for (int j = i * i; j < length; j += i) {
                    check[j] = false;
                }
            }
        }
        return check;
    }
}