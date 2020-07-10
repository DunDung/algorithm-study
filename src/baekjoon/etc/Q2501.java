package baekjoon.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2501 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = scan.nextInt();
        int k = scan.nextInt();
        for(int i=1; i<=n; i++)
            if(n%i==0)
                list.add(i);

        if(list.size()<=k-1)
            System.out.println(0);
        else
            System.out.println(list.get(k-1));
    }

}
