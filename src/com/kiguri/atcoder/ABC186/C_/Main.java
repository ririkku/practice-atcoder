package com.kiguri.atcoder.ABC186.C_;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            boolean contains = String.valueOf(i).contains("7");
            boolean contains1 = Integer.toOctalString(i).contains("7");
            if (contains && contains1) {
                cnt++;
                continue;
            }
            if (contains) {
                cnt++;
                continue;
            }
            if(contains1) {
                cnt++;
            }
        }

        System.out.println(N - cnt);
    }
}
