package com.kiguri.atcoder.ABC182.B_AlmostGCD;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc182/tasks/abc182_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] ints = new int[N];
        for (int i = 0; i < N; i++) {
            ints[i] = sc.nextInt();
        }

        Arrays.sort(ints);
        int ans = 0;
        int cnt = 0;
        for (int k = 2; k <= ints[N - 1]; k++) {

            int tmpCnt = 0;
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] % k == 0) {
                    tmpCnt++;
                }
            }

            if (tmpCnt > cnt) {
                ans = k;
                cnt = tmpCnt;
            }
        }

        System.out.println(ans);
    }
}
