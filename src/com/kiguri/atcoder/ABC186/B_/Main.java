package com.kiguri.atcoder.ABC186.B_;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < W; j++) {
                int A = sc.nextInt();
                max += A;
                min = Math.min(A, min);
            }
        }

        System.out.println(max - N * W * min);
    }
}
