package com.kiguri.atcoder.ABC116.CollatzProblem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://atcoder.jp/contests/abc116/tasks/abc116_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        int[] a = new int[1000000 + 1];
        for (int i = 1; i <= 1000000; i++) {
            if (i == 1) {
                a[i] = s;
                continue;
            }
            a[i] = f(a[i - 1]);
        }

        Set<Integer> A = new HashSet<>();
        for (int i = 1; i < a.length; i++) {
            if (!A.add(a[i])) {
                System.out.println(i);
                return;
            }
        }

    }

    static int f(int n) {
        // nが偶数 = n / 2
        // nが奇数 = (3*n) + 1
        if (n % 2 == 0) return n / 2;
        else return (3 * n) + 1;
    }
}
