package com.kiguri.atcoder.ABC130.B_Bounding;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc130/tasks/abc130_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int cnt = 1;
        int x = 0;
        for (int i = 0; i < N; i++) {
            x += sc.nextInt();
            if (x <= X) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
