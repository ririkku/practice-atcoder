package com.kiguri.atcoder.ARC033.B_メタ構文変数;

import java.util.*;

/**
 * https://atcoder.jp/contests/arc033/tasks/arc033_2
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NA = sc.nextInt();
        int NB = sc.nextInt();


        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < NA; i++) {
            list.add(sc.nextInt());
        }

        int sameCnt = 0;
        for (long i = 0; i < NB; i++) {
            int Sb = sc.nextInt();
            if(list.contains(Sb)) {
                // 共通部分
                sameCnt++;
            } else {
                // 和集合
                list.add(Sb);
            }
        }

        // 共通部分/和集合
        System.out.println((double) sameCnt / list.size());
    }
}
