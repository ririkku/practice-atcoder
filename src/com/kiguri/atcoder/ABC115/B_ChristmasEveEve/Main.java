package com.kiguri.atcoder.ABC115.B_ChristmasEveEve;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc115/tasks/abc115_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Integer[] ps = new Integer[N];
        for (int i = 0; i < N; i++) {
            ps[i] = sc.nextInt();
        }

        Arrays.sort(ps, Comparator.reverseOrder());

        int x = ps[0] / 2;
        for (int i = 1; i < N; i++) {
            x += ps[i];
        }

        System.out.println(x);
    }
}
