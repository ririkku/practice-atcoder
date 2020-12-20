package com.kiguri.atcoder.ABC186.D_;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] ints = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            ints[i] = sc.nextInt();
            max += ints[i];
        }

        int ans = 0;
        int x = 0;
        for (int i = 0; i < ints.length; i++) {
            x += ints[i];
            int i2 = ints[i] * (ints.length - 1 - i);
            int i3 = max - x;
            System.out.println(i2);
            System.out.println(i3);
            ans += Math.abs(i2-i3);
        }

        System.out.println(ans);
    }
}
