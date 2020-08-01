package toss2020.server1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] kims = br.readLine().split(" ");
        String[] lees = br.readLine().split(" ");
        int leeValue = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < kims.length; i++) {
            int kim = Integer.parseInt(kims[i]);
            int lee = Integer.parseInt(lees[i]);
            kim -= leeValue;
            leeValue = 0;
            int result = kim - lee;
            if (result < 0) {
                leeValue += result * -1;
                result = 0;
            }
            builder.append(result);
            builder.append(" ");
        }
        System.out.println(builder.toString().trim());
    }
}
