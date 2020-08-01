package toss2020.server1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Q2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        Set<Integer> set = new HashSet<>();
        boolean isOk = true;
        int preValue = -1;
        for (int i = 0; i < inputs.length; i++) {
            int v = Integer.parseInt(inputs[i]);
            if (v >= 1 && v <= 45) {
                if (v < preValue) {
                    isOk = false;
                    break;
                }
                preValue = v;
                set.add(v);
            } else {
                isOk = false;
                break;
            }
        }
        if (set.size() != 6) {
            isOk = false;
        }
        System.out.println(isOk);
    }
}
