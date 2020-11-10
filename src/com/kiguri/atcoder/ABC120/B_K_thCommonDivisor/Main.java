package com.kiguri.atcoder.ABC120.B_K_thCommonDivisor;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc120/tasks/abc120_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();

        int max = A > B ? B : A;
        LinkedList<Integer> arr = new LinkedList<>();
        for (int i = max; i >= 1; i--) {
            if (A % i == 0 && B % i == 0) {
                arr.add(i);
            }
        }
        System.out.println(arr.get(K - 1));
    }
}
