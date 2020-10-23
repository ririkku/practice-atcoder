package com.kiguri.external.BubbleSort;

import java.util.Random;

/**
 * バブルソート
 */
public class BubbleSort {

    /**
     * 隣接してる要素を比較して交換するってことや。
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] sut = new int[10];
        for (int i = 0; i < sut.length; i++) {
            sut[i] = random.nextInt(30);
        }

        int index = 1;
        for (int i = sut.length - 1; i > 0; i--) {

            System.out.println(index + "回目の外側");

            for (int j = 0; j < i; j++) {

                System.out.println("  " + j + "回目の内側");

                // 今の値が次の値より大きい場合は入れ替える
                int next = j + 1;
                boolean b = sut[j] > sut[next];
                if (sut[j] > sut[next]) {
                    System.out.println("    今:" + sut[j] + " > 次:" + sut[next] + " = " + b + "なので入れ替え！！！");
                    int temp = sut[j];
                    sut[j] = sut[next];
                    sut[next] = temp;
                    System.out.println("    " + sut[j] + " : " + sut[next]);
                } else {
                    System.out.println("    今:" + sut[j] + " > 次:" + sut[next] + " = " + b + "なので入れ替えない");
                }
            }

            index++;
        }

        // こういうパターンもいける
        // 先頭から(sut);

        System.out.println("=======================");

        for (int i : sut) {
            System.out.println(i);
        }
    }

    private static void 先頭から(int[] sut) {
        boolean f = true;
        while (f) {

            f = false;

            for (int i = 1; i < sut.length; i++) {
                int current = sut[i - 1];
                int next = sut[i];
                // 1 2だったら、交換しない
                // 2 1だったら、交換後の次の要素から同じことする
                if (current > next) {
                    int temp = sut[i];
                    sut[i] = sut[i - 1];
                    sut[i - 1] = temp;
                    f = true;
                }
            }
        }
    }


}
