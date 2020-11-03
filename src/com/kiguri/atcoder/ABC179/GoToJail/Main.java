package com.kiguri.atcoder.ABC179.GoToJail;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc179/tasks/abc179_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean[] xx = new boolean[N];
        for (int i = 0; i < N; i++) {
            int D1 = sc.nextInt();
            int D2 = sc.nextInt();
            xx[i] = D1 == D2;
        }

        boolean f = false;
        for (int i = 0; i < xx.length - 2; i++) {
            if (xx[i] && xx[i + 1] && xx[i + 2]) {
                f = true;
            }
        }

        if (f) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
