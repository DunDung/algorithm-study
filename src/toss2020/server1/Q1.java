package toss2020.server1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        boolean isOk = true;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!(c == '1' || c == '2')) {
                isOk = false;
                break;
            }
            if (c == '1') {
                if (i == input.length() - 1 || input.charAt(i + 1) != '2') {
                    isOk = false;
                    break;
                }
            }
        }
        System.out.println(isOk);
    }
}
