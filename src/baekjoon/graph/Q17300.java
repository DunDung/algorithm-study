package baekjoon.graph;

import java.io.*;
import java.util.*;

//패턴
//X
//예외가 넘많아서 못풀음
public class Q17300 {
    static boolean[] numberDup;
    static int pre;
    static boolean chk = true;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int L = Integer.parseInt(line);
        numberDup = new boolean[10];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cur = Integer.parseInt(st.nextToken());
        numberDup[cur] = true;
        pre = cur;
        for (int i = 1; i < L; i++) {
            cur = Integer.parseInt(st.nextToken());
            amhoChk(cur);
        }

        if (chk) {
            bw.write("YES\n");
        } else {
            bw.write("NO\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
    public static void amhoChk(int cur){
        if(cur == 1 && !numberDup[cur]){
            if(pre == 2 ||pre == 4 || pre == 5 ||  pre == 6 || pre == 8){
                numberDup[cur] = true;
                pre = cur;
            } else if(pre == 3 && numberDup[2]) {
                numberDup[cur] = true;
                pre = cur;
            } else if(pre == 7 && numberDup[4]) {
                numberDup[cur] = true;
                pre = cur;
            } else if(pre == 9 && numberDup[5]) {
                numberDup[cur] = true;
                pre = cur;
            } else {
                chk = false;
            }
        } else if(cur == 2 && !numberDup[cur]){
            if(pre == 1 || pre == 3 || pre == 4 || pre == 5 || pre == 6 || pre == 7 || pre == 9){
                numberDup[cur] = true;
                pre = cur;
            } else if(pre == 8 && numberDup[5]) {
                numberDup[cur] = true;
                pre = cur;
            } else {
                chk = false;
            }
        } else if(cur == 3 && !numberDup[cur]){
            if(pre == 2 || pre == 5 || pre == 6 || pre == 4 || pre == 8){
                numberDup[cur] = true;
                pre = cur;
            } else if(pre == 1 && numberDup[2]) {
                numberDup[cur] = true;
                pre = cur;
            } else if(pre == 7 && numberDup[5]) {
                numberDup[cur] = true;
                pre = cur;
            } else if(pre == 9 && numberDup[6]) {
                numberDup[cur] = true;
                pre = cur;
            }  else {
                chk = false;
            }
        } else if(cur == 4 && !numberDup[cur]){
            if(pre == 1 || pre == 2 || pre == 3 || pre == 5 || pre == 7 || pre == 8 || pre == 9){
                numberDup[cur] = true;
                pre = cur;
            } else if(pre == 6 && numberDup[5]){
                numberDup[cur] = true;
                pre = cur;
            } else {
                chk = false;
            }
        } else if(cur == 5 && !numberDup[cur]){
            if(pre == 1 || pre == 2 || pre == 3 || pre == 4 || pre == 6 || pre == 7 || pre == 8 || pre == 9){
                numberDup[cur] = true;
                pre = cur;
            }else {
                chk = false;
            }
        } else if(cur == 6 && !numberDup[cur]){
            if(pre == 1 || pre == 2 || pre == 3 || pre == 5 || pre == 7 || pre == 8 || pre == 9){
                numberDup[cur] = true;
                pre = cur;
            } else if(pre == 4 && numberDup[5]){
                numberDup[cur] = true;
                pre = cur;
            } else {
                chk = false;
            }
        } else if(cur == 7 && !numberDup[cur]){
            if(pre == 2 || pre == 4 || pre == 5 || pre == 6 || pre == 8){
                numberDup[cur] = true;
                pre = cur;
            } else if(pre == 1 && numberDup[4]) {
                numberDup[cur] = true;
                pre = cur;
            } else if(pre == 3 && numberDup[5]) {
                numberDup[cur] = true;
                pre = cur;
            } else if(pre == 9 && numberDup[8]) {
                numberDup[cur] = true;
                pre = cur;
            } else {
                chk = false;
            }
        } else if(cur == 8 && !numberDup[cur]){
            if(pre == 1 || pre == 3 || pre == 4 || pre == 5 || pre == 6 || pre == 7 || pre == 9){
                numberDup[cur] = true;
                pre = cur;
            } else if(pre == 2 && numberDup[5]) {
                numberDup[cur] = true;
                pre = cur;
            } else {
                chk = false;
            }
        } else if(cur == 9 && !numberDup[cur]){
            if(pre == 2 || pre == 4 || pre == 8 || pre == 5 || pre == 6){
                numberDup[cur] = true;
                pre = cur;
            } else if(pre == 1 && numberDup[5]) {
                numberDup[cur] = true;
                pre = cur;
            } else if(pre == 3 && numberDup[6]) {
                numberDup[cur] = true;
                pre = cur;
            } else if(pre == 7 && numberDup[8]) {
                numberDup[cur] = true;
                pre = cur;
            } else {
                chk = false;
            }
        } else {
            chk = false;
        }
    }
}