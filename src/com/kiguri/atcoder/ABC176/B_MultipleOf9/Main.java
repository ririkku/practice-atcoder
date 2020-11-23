package com.kiguri.atcoder.ABC176.B_MultipleOf9;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc176/tasks/abc176_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int sum = 0;
        for (String s : n.split("")) {
            int num = Integer.parseInt(s);
            sum += num;
        }

        if (sum % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
