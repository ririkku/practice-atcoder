package com.kiguri.atcoder.ABC025.B_双子とスイカ割り;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc025/tasks/abc025_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int ans = 0;
        for (int i = 0; i < N; i++) {
            String si = sc.next();
            int di = sc.nextInt();

            if ("East".equals(si)) {
                if (A <= di && di <= B) {
                    ans += di;
                    continue;
                }
                if (di < A) ans += A;
                if (di > B) ans += B;
            } else if ("West".equals(si)) {
                if (A <= di && di <= B) {
                    ans -= di;
                    continue;
                }
                if (di < A) ans -= A;
                if (di > B) ans -= B;
            }
        }

        if (ans < 0) {
            System.out.println("West " + Math.abs(ans));
        } else if (ans > 0) {
            System.out.println("East " + ans);
        } else {
            System.out.println(0);
        }
    }
}
