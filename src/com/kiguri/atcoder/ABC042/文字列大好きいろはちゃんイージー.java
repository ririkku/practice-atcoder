package com.kiguri.atcoder.ABC042;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc042/tasks/abc042_b
 */
public class 文字列大好きいろはちゃんイージー {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        Arrays.sort(str);
        for (String s : str) {
            System.out.print(s);
        }
        sc.close();
    }
}
