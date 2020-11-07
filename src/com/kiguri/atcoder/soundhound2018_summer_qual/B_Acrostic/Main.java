package com.kiguri.atcoder.soundhound2018_summer_qual.B_Acrostic;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/soundhound2018-summer-qual/tasks/soundhound2018_summer_qual_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int w = sc.nextInt();

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < S.length(); i = i + w) {
            char c = S.substring(i).charAt(0);
            ans.append(c);
        }
        System.out.println(ans.toString());
    }
}
