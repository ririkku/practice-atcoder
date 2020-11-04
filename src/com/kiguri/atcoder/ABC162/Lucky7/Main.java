package com.kiguri.atcoder.ABC162.Lucky7;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc162/tasks/abc162_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = String.valueOf(N);

        boolean f = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '7') {
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
